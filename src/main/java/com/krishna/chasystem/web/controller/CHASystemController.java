package com.krishna.chasystem.web.controller;

import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.krishna.chasystem.web.dto.User;
import com.krishna.chasystem.web.model.UserModel;
import com.krishna.chasystem.web.service.BranchMasterService;
import com.krishna.chasystem.web.service.UserMasterService;
import com.krishna.chasystem.web.util.CommonUtils;

@Controller
public class CHASystemController {
	Logger logger = Logger.getLogger(CHASystemController.class);
	@Autowired
	UserMasterService userMasterService;
	@Autowired
	User user;
	@Autowired
	BranchMasterService branchMasterService;
	@Autowired
	CommonUtils commonUtils;
	
/*	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}*/
	
	
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		System.out.println("Log In Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);
		model.addAttribute("branchList", branchMasterService.getBranchMasterList());
		model.addAttribute("accountingYearList", commonUtils.getAccountingYears());
		return "login";
	}
	

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public String user(@Validated UserModel userModel, Model model) {
		boolean isAuthenticated = false;
		model.addAttribute("userId", userModel.getUserId());
		model.addAttribute("accountingYear",userModel.getAccountingYear());
		model.addAttribute("branch",userModel.getBranch());
		user.setUserId(Integer.parseInt(userModel.getUserId()));
		user.setPassword(userModel.getPassword());
		try {
			isAuthenticated = userMasterService.isAuthenticatedUser(user);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			logger.error(e.getMessage());
		}
		if(isAuthenticated)
		{
		return "jobMasterEntry";
		}
		else
		{
			return "invalidUser";
		}
	}
}
