package com.krishna.chasystem.web.util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.krishna.chasystem.web.dto.YearEntryMaster;

@Component
public class CommonUtils {
	@Autowired
	YearEntryMaster yearEntry;
	
	public static Date convertStringToSqlDate(String dateInString) throws ParseException
	{
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date date = sdf1.parse(dateInString);
		Date sqlStartDate = new Date(date.getTime());
		
		return sqlStartDate;
		
	}
	
	public static Date convertUtilDateToSqlDate(java.util.Date utilDate)
	{
		return new Date(utilDate.getTime());
	}
	
	public static Date getCurrentDateInSql()
	
	{
		Date date = new Date(new java.util.Date().getTime());
		return date;
	}
	
	public List<String> getAccountingYears()
	{
		List<String> accountingYearList = new ArrayList<String>();
		accountingYearList.add("2010-2011");
		accountingYearList.add("2011-2012");
		accountingYearList.add("2012-2013");
		accountingYearList.add("2013-2014");
		accountingYearList.add("2014-2015");
		accountingYearList.add("2015-2016");
		accountingYearList.add("2016-2017");
		accountingYearList.add("2017-2018");
		accountingYearList.add("2018-2019");
		return accountingYearList;
	}
	
}
