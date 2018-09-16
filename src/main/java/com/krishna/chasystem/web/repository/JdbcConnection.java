package com.krishna.chasystem.web.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;



public class JdbcConnection {
	static Logger  logger = Logger.getLogger(JdbcConnection.class);
	static Connection con;
	private static String USERNAME;
	private static String PASSWORD;
	
	static {
		Properties properties = new Properties();
		try {
			properties.load(JdbcConnection.class.getResourceAsStream("/db.properties"));
			USERNAME = properties.getProperty("DB.USERNAME");
			PASSWORD = properties.getProperty("DB.PASSWORD");
		} catch (IOException e) {
			logger.error(e.getMessage(),e);
		}
		
	}
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException
	{
		if(con != null)
		{
			return con;
		}
		// lock on Connection object con. Only one thread can enter this block at a time.
		  //synchronized (JdbcConnection.class) {
			  // this is called two-way checking in multithreading. These ensures that only one object is created of Connection class.
			  if(con != null)
				  return con;
			  
			  try {
					//step1 load the driver class
					Class.forName("oracle.jdbc.driver.OracleDriver");
					
					//step2 create  the connection object  
					//Best Practice : This should be read from properties file
					con=DriverManager.getConnection(  
					"jdbc:oracle:thin:@localhost:1521:xe",USERNAME,PASSWORD);
					
					logger.info("Connection created: "+con);
					return con;
					
				} catch (ClassNotFoundException e) {
					logger.error(e.getMessage());
					throw e;
				} catch (SQLException e) {
					logger.error(e.getMessage());
					throw e;
				}  
		//}
		
	}
	
	
	
}
