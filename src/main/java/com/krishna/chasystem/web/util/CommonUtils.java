package com.krishna.chasystem.web.util;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Component;

@Component
public class CommonUtils {

	
	public static Date convertStringToSqlDate(String dateInString) throws ParseException
	{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date date = dateFormat.parse(dateInString);
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
	
	public static String getCurrentDateInString()
	{
		java.util.Date date = new java.util.Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-YYYY");
		String formattedDate = dateFormat.format(date);
		return formattedDate;
	}
}
