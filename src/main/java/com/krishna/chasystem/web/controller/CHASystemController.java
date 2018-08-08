package com.krishna.chasystem.web.controller;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
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
import com.krishna.chasystem.web.service.UserMasterService;
import com.krishna.chasystem.web.service.YearMasterService;
import com.krishna.chasystem.web.util.CommonUtils;

@Controller
public class CHASystemController {
	Logger logger = Logger.getLogger(CHASystemController.class);
	@Autowired
	UserMasterService userMasterService;
	@Autowired
	UserMaster user;
	@Autowired
	BranchMasterService branchMasterService;
	@Autowired
	CommonUtils commonUtils;
	@Autowired
	MasterService masterService;
	@Autowired
	YearMasterService yearMasterService;
	@Autowired
	JobMasterService jobMasterService;
	@Autowired
	JobMaster jobMaster;
	@Autowired
	ExpenseMasterService expenseMasterService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Log In Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("branchMap",
				branchMasterService.getBranchMasterMap());
		model.addAttribute("accountingYearMap",
				yearMasterService.getyearCodeAndDurationMap());
		return "login";
	}
	
	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String authenticateUser(@Validated LoginPageModel loginPageModel,Locale locale, Model model,HttpServletRequest request) {
		HttpSession session = request.getSession();
		logger.info("Log In Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		
		boolean isAuthenticated = false;
		user.setUserId(Integer.parseInt(loginPageModel.getUserId()));
		user.setPassword(loginPageModel.getPassword());
		try {
			isAuthenticated = userMasterService.isAuthenticatedUser(user);
		} catch (ClassNotFoundException | SQLException e) {
			logger.error(e.getMessage());
			return "error";
		}
		if (isAuthenticated) {

			try {
				session.setAttribute("userId", loginPageModel.getUserId());
				model.addAttribute("accountingYear", loginPageModel.getAccountingYearCode());
				model.addAttribute("branch", loginPageModel.getBranch());
				model.addAttribute("jobNumberPart2", jobMasterService.getNextJobNumber());
				model.addAttribute("debtorsMapFromMasterTable",
						masterService.getDebtorsMap());
			} catch (ClassNotFoundException | SQLException e) {
				logger.error(e.getMessage());
				return "error";
			}
			return "jobMasterEntry";
		} else {
			return "invalidUser";
		}
	}
	
	@RequestMapping(value = "/saveJobMaster", method = RequestMethod.POST)
	public String saveJobMaster(@Validated JobMasterEntryPageModel jobMasterEntrymodel,Locale locale, Model model, HttpServletRequest request) {
		logger.info("Log In Requested, locale = " + locale);
		int recordsUpdated = 0;
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
		jobMaster.setQuantity(Integer.parseInt(jobMasterEntrymodel.getCommodityQuantity()));
		jobMaster.setUnit(jobMasterEntrymodel.getUnit());
		jobMaster.setUserId((String) request.getSession().getAttribute("userId"));
		jobMaster.setShipName(jobMasterEntrymodel.getShipName());
		
		
		try {
			recordsUpdated = jobMasterService.addJobMasterEntry(jobMaster);
		} catch (ClassNotFoundException | SQLException e) {
			logger.error(e.getMessage());
			return "error";
		}
		if(recordsUpdated > 0)
		{
			List<ExpenseMaster> expenseMasterList = expenseMasterService.getAllExpenseMasterRecords();
			model.addAttribute("expenseMasterList", expenseMasterList);
			model.addAttribute("recordsUpdated",true);
		}
		else
		{
			model.addAttribute("recordsUpdated",false);
		}
		return "jobMasterUpdateResult";
	}
}
