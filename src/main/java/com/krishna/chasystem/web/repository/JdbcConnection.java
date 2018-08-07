package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;



public class JdbcConnection {
	static Logger  logger = Logger.getLogger(JdbcConnection.class);
	static Connection con;
	
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
					"jdbc:oracle:thin:@localhost:1521:xe","KRISHNA","12121951");
					
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
