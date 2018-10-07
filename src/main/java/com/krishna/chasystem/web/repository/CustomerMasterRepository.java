package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.CustomerMaster;

@Repository
public class CustomerMasterRepository {
	Logger logger = Logger.getLogger(CustomerMaster.class);
	Connection con;

	public List<CustomerMaster> getAllCustomerMasterList() throws SQLException, ClassNotFoundException {
		List<CustomerMaster> customerMasterList = new ArrayList<CustomerMaster>();

		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from customer_master";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		CustomerMaster customerMaster;
		while(rs.next())
		{
			customerMaster = new CustomerMaster();
			customerMaster.setAccountCode(rs.getString(2));
			customerMaster.setCustomerId(rs.getInt(1));
			customerMasterList.add(customerMaster);
		}
		return customerMasterList;
	}
	
	/**
	 * @param bankMaster
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int addCustomerMaster(CustomerMaster customerMaster) throws ClassNotFoundException, SQLException {
		int recordsAdded = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "insert into customer_master values(?,?)";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setLong(1, getNextCustomerIdFromSequence());
		preparedStatement.setString(2, customerMaster.getAccountCode());

		recordsAdded = preparedStatement.executeUpdate();// data is inserted after this line is executed
		logger.info(recordsAdded + " customer_master(s) added");

		return recordsAdded;
	}
	
	
	public int updateCustomerMaster(CustomerMaster customerMaster) throws ClassNotFoundException, SQLException {
		int recordsUpdated = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		
		String sql = "update customer_master set ACCOUNT_CODE='" + customerMaster.getAccountCode() + "' where CUSTOMER_ID = "+customerMaster.getCustomerId();

		Statement statement = con.createStatement();

		recordsUpdated = statement.executeUpdate(sql);
		logger.info(recordsUpdated + " customer_master updated");

		return recordsUpdated;
	}
	
	
	public int deleteCustomerMaster(int customerId) throws ClassNotFoundException, SQLException {
		int recordsUpdated = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		
		String sql = "delete from customer_master where CUSTOMER_ID="+customerId;

		Statement statement = con.createStatement();

		recordsUpdated = statement.executeUpdate(sql);
		logger.info(recordsUpdated + " customer_master deleted");

		return recordsUpdated;
	}
	
	public synchronized long getNextCustomerIdFromSequence() throws ClassNotFoundException, SQLException {

		long nextCustomerId = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select customer_master_sequence.nextval from dual";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			nextCustomerId = rs.getLong(1);
		}
		return nextCustomerId;
	}

}
