package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.ExpenseMaster;

@Repository
public class ExpenseMasterRepository {
	Logger logger = Logger.getLogger(ExpenseMasterRepository.class);
	Connection con;
	public List<ExpenseMaster> getAllExpenseMasterRecords() throws ClassNotFoundException, SQLException {
		List<ExpenseMaster> expenseMasterList = new ArrayList<ExpenseMaster>();
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from year_master";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		ExpenseMaster expenseMaster;
		while(rs.next())
		{
			expenseMaster = new ExpenseMaster();
			expenseMaster.setAccountCode("001");
			expenseMaster.setExpenseCode(1001);
			expenseMaster.setExpenseName("ABCD DEBIT");
			expenseMaster.setCgst(12);
			expenseMaster.setIgst(10);
			expenseMaster.setSgst(6);
			expenseMaster.setReceiptOrDetailAction("Receipt");
			expenseMasterList.add(expenseMaster);
		}
		return expenseMasterList;
	}

}
