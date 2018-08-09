package com.krishna.chasystem.web.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.krishna.chasystem.web.dto.ExpenseMaster;
import com.krishna.chasystem.web.dto.JobMaster;
import com.krishna.chasystem.web.dto.UserMaster;
import com.krishna.chasystem.web.model.JobMasterEntryPageModel;
import com.krishna.chasystem.web.model.LoginPageModel;
import com.krishna.chasystem.web.service.BranchMasterService;
import com.krishna.chasystem.web.service.ExpenseMasterService;
import com.krishna.chasystem.web.service.JobMasterService;
import com.krishna.chasystem.web.service.MasterService;
import com.krishna.chasystem.web.service.UnitMasterService;
import com.krishna.chasystem.web.service.UserMasterService;
import com.krishna.chasystem.web.service.YearMasterService;
import com.krishna.chasystem.web.util.CommonUtils;

@Controller
public class CHASystemController {
	Logger logger = Logger.getLogger(CHASystemController.class);
	@Autowired
	UserMasterService userMasterService;
	@Autowired
	BranchMasterService branchMasterService;
	@Autowired
	MasterService masterService;
	@Autowired
	YearMasterService yearMasterService;
	@Autowired
	JobMasterService jobMasterService;
	@Autowired
	ExpenseMasterService expenseMasterService;
	@Autowired
	UnitMasterService unitMasterService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Log In Requested, locale = " + locale);
		model.addAttribute("branchMap",
				branchMasterService.getBranchMasterMap());
		model.addAttribute("accountingYearMap",
				yearMasterService.getyearCodeAndDurationMap());
		return "login";
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String authenticateUser(@Validated LoginPageModel loginPageModel,
			Locale locale, Model model, HttpServletRequest request) {
		logger.info("Log In Requested, locale = " + locale);
		boolean isAuthenticated = false;
		UserMaster user = new UserMaster();
		user.setUserName(loginPageModel.getUserName());
		user.setPassword(loginPageModel.getPassword());
		try {
			isAuthenticated = userMasterService.isAuthenticatedUser(user);
		} catch (ClassNotFoundException | SQLException e) {
			logger.error(e.getMessage(), e);
			return "error";
		}
		if (isAuthenticated) {
			HttpSession session = request.getSession();
			session.setAttribute("branchMap",
					branchMasterService.getBranchMasterMap());
			session.setAttribute("accountingYearMap",
					yearMasterService.getyearCodeAndDurationMap());
			session.setAttribute("userName", loginPageModel.getUserName());
			session.setAttribute("accountingYear",
					loginPageModel.getAccountingYearCode());
			session.setAttribute("branch", loginPageModel.getBranch());

			return "menu";
		} else {
			model.addAttribute("branchMap",
					branchMasterService.getBranchMasterMap());
			model.addAttribute("accountingYearMap",
					yearMasterService.getyearCodeAndDurationMap());
			model.addAttribute("errorMessage", "Invalid UserName or Password");
			return "login";
		}
	}

	@RequestMapping(value = "/showJobMasterEntryPage", method = RequestMethod.GET)
	public String showJobMasterEntry(Locale locale, Model model,
			HttpSession session) {
		model.addAttribute("serverTime", CommonUtils.getCurrentDateInString());
		
		try {
			model.addAttribute("jobNumberPart2",
					jobMasterService.getNextJobNumber());
			session.setAttribute("debtorsMapFromMasterTable",
					masterService.getDebtorsMap());
			session.setAttribute("unitList",
					unitMasterService.getListOfUnitMaster());

		} catch (ClassNotFoundException | SQLException e) {
			logger.error(e.getMessage(), e);
			return "error";
		}
		return "jobMasterEntry";
	}

	@RequestMapping(value = "/addJobMaster", method = RequestMethod.POST)
	public String addJobMaster(
			@Validated JobMasterEntryPageModel jobMasterEntrymodel,
			Locale locale, Model model, HttpServletRequest request) {
		logger.info("Log In Requested, locale = " + locale);
		int recordsUpdated = 0;
		JobMaster jobMaster = new JobMaster();
		jobMaster.setJobNumber(jobMasterEntrymodel.getJobNumber());
		jobMaster.setJobCreationDate(CommonUtils.getCurrentDateInSql());
		jobMaster.setBeNo(jobMasterEntrymodel.getBeNo());
		logger.info(jobMasterEntrymodel.getBranch());
		jobMaster.setBranchCode(jobMasterEntrymodel.getBranch());
		jobMaster.setCity(jobMasterEntrymodel.getCityName());
		jobMaster.setCommodity(jobMasterEntrymodel.getCommodity());
		jobMaster.setDispatchFrom(jobMasterEntrymodel.getDispatchedFrom());
		jobMaster.setDispatchTo(jobMasterEntrymodel.getDispatchedTo());
		jobMaster.setImportOrExport(jobMasterEntrymodel.getImportOrExport());
		jobMaster.setJobCompleted("N");
		jobMaster.setPartyRefNo(jobMasterEntrymodel.getPartyRefNo());
		jobMaster.setPort(jobMasterEntrymodel.getPortName());
		jobMaster.setQuantity(Double.parseDouble(jobMasterEntrymodel
				.getCommodityQuantity()));
		//jobMaster.setUnit(jobMasterEntrymodel.getUnit());
		jobMaster.setUserId((String) request.getSession()
				.getAttribute("userId"));
		jobMaster.setShipName(jobMasterEntrymodel.getShipName());
		jobMaster.setAdvanceAmount(Double.parseDouble(jobMasterEntrymodel
				.getAdvanceAmount()));
		jobMaster.setNarration(jobMasterEntrymodel.getNarration());
		jobMaster.setTurnKey(jobMasterEntrymodel.getTurnKey());

		try {
			recordsUpdated = jobMasterService.addJobMasterEntry(jobMaster);
		} catch (ClassNotFoundException | SQLException e) {
			logger.error(e.getMessage(), e);
			return "error";
		}
		if (recordsUpdated > 0) {
			List<ExpenseMaster> expenseMasterList = expenseMasterService
					.getAllExpenseMasterRecords();
			model.addAttribute("expenseMasterList", expenseMasterList);
			model.addAttribute("recordsUpdated", true);
		} else {
			model.addAttribute("recordsUpdated", false);
		}
		return "jobMasterUpdateResults";
	}

	@RequestMapping(value = "/updateJobMaster", method = RequestMethod.PUT)
	public String updateJobMaster(
			@Validated JobMasterEntryPageModel jobMasterEntrymodel,
			Locale locale, Model model, HttpSession session) {
		logger.info("Log In Requested, locale = " + locale);
		int recordsUpdated = 0;
		JobMaster jobMaster = new JobMaster();
		jobMaster.setJobNumber(jobMasterEntrymodel.getJobNumber());
		jobMaster.setJobCreationDate(CommonUtils.getCurrentDateInSql());
		jobMaster.setBeNo(jobMasterEntrymodel.getBeNo());
		// logger.info(session.getBranch());
		jobMaster.setBranchCode(jobMasterEntrymodel.getBranch());
		jobMaster.setCity(jobMasterEntrymodel.getCityName());
		jobMaster.setCommodity(jobMasterEntrymodel.getCommodity());
		jobMaster.setDispatchFrom(jobMasterEntrymodel.getDispatchedFrom());
		jobMaster.setDispatchTo(jobMasterEntrymodel.getDispatchedTo());
		jobMaster.setImportOrExport(jobMasterEntrymodel.getImportOrExport());
		jobMaster.setJobCompleted("N");
		jobMaster.setPartyRefNo(jobMasterEntrymodel.getPartyRefNo());
		jobMaster.setPort(jobMasterEntrymodel.getPortName());
		jobMaster.setQuantity(Double.parseDouble(jobMasterEntrymodel
				.getCommodityQuantity()));
		//jobMaster.setUnit(jobMasterEntrymodel.getUnit());
		jobMaster.setUserId((String) (session.getAttribute("userId")));
		jobMaster.setShipName(jobMasterEntrymodel.getShipName());
		jobMaster.setAdvanceAmount(Double.parseDouble(jobMasterEntrymodel
				.getAdvanceAmount()));
		jobMaster.setNarration(jobMasterEntrymodel.getNarration());
		jobMaster.setTurnKey(jobMasterEntrymodel.getTurnKey());

		try {
			recordsUpdated = jobMasterService.addJobMasterEntry(jobMaster);
		} catch (ClassNotFoundException | SQLException e) {
			logger.error(e.getMessage(), e);
			return "error";
		}
		if (recordsUpdated > 0) {
			List<ExpenseMaster> expenseMasterList = expenseMasterService
					.getAllExpenseMasterRecords();
			model.addAttribute("expenseMasterList", expenseMasterList);
			model.addAttribute("recordsUpdated", true);
		} else {
			model.addAttribute("recordsUpdated", false);
		}
		return "jobMasterUpdateResults";
	}

}
