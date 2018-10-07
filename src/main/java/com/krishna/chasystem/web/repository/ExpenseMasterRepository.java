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

import com.krishna.chasystem.web.dto.ExpenseMaster;

@Repository
public class ExpenseMasterRepository {
	Logger logger = Logger.getLogger(ExpenseMasterRepository.class);
	Connection con;

	/**
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<ExpenseMaster> getAllExpenseMasterRecords() throws ClassNotFoundException, SQLException {
		List<ExpenseMaster> expenseMasterList = new ArrayList<ExpenseMaster>();
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from expense_master";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		ExpenseMaster expenseMaster;
		while (rs.next()) {
			expenseMaster = new ExpenseMaster();
			expenseMaster.setExpenseCode(rs.getInt(1));
			expenseMaster.setAccountCode(rs.getString(2));
			expenseMaster.setExpenseName(rs.getString(3));
			expenseMaster.setCgst(rs.getDouble(4));
			expenseMaster.setSgst(rs.getDouble(5));
			expenseMaster.setIgst(rs.getDouble(6));
			expenseMaster.setReceiptOrDetailAction(rs.getString(7));
			expenseMasterList.add(expenseMaster);
		}
		return expenseMasterList;
	}
	
	/**
	 * @param expense
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int addExpenseMaster(ExpenseMaster expense) throws ClassNotFoundException, SQLException {
		int recordsAdded = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "insert into expense_master values(?,?,?,?,?,?,?)";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setLong(1, getNextExpenseCodeFromSequence());
		preparedStatement.setString(2, expense.getAccountCode());
		preparedStatement.setString(3, expense.getExpenseName());
		preparedStatement.setDouble(4, expense.getCgst());
		preparedStatement.setDouble(5, expense.getSgst());
		preparedStatement.setDouble(6, expense.getIgst());
		preparedStatement.setString(7, expense.getReceiptOrDetailAction());

		recordsAdded = preparedStatement.executeUpdate();// data is inserted after this line is executed
		logger.info(recordsAdded + " expense_master(s) added");

		return recordsAdded;
	}

	/**
	 * @param expenseMaster
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int updateExpenseMaster(ExpenseMaster expenseMaster) throws ClassNotFoundException, SQLException {
		int recordsUpdated = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}

		String sql = "update expense_master set EXPENSE_NAME='" + expenseMaster.getExpenseName()
				+ " where ACCOUNT_CODE='" + expenseMaster.getAccountCode() + "', CGST=" + expenseMaster.getCgst()
				+ ", SGST=" + expenseMaster.getSgst() + ", IGST=" + expenseMaster.getIgst()
				+ ", RECEIPT_OR_DETAIL_ACTION='" + expenseMaster.getReceiptOrDetailAction() + "' where EXPENSE_CODE="
				+ expenseMaster.getExpenseCode();

		Statement statement = con.createStatement();

		recordsUpdated = statement.executeUpdate(sql);
		logger.info(recordsUpdated + " expense_master updated");

		return recordsUpdated;
	}

		/** by krishna
	 * @param ExpesnseCode
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int deleteExpenseMaster(int expenseCode) throws ClassNotFoundException, SQLException {
		int recordsUpdated = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		
		String sql = "delete from expense_master where EXPENSE_CODE="+expenseCode;

		Statement statement = con.createStatement();

		recordsUpdated = statement.executeUpdate(sql);
		logger.info(recordsUpdated + " expense_master deleted");

		return recordsUpdated;
	}
	

	/**
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public synchronized long getNextExpenseCodeFromSequence() throws ClassNotFoundException, SQLException {

		long nextJobNumber = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select expense_master_sequence.nextval from dual";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			nextJobNumber = rs.getLong(1);
		}
		return nextJobNumber;
	}

}
