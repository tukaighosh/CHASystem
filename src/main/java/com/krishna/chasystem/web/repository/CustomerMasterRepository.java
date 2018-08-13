package com.krishna.chasystem.web.repository;

import java.sql.Connection;
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

}
