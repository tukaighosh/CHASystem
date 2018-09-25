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

import com.krishna.chasystem.web.dto.BankMaster;

@Repository
public class BankMasterRepository {
	Logger logger = Logger.getLogger(BankMasterRepository.class);
	Connection con;

	public List<BankMaster> getBankMasterList() throws ClassNotFoundException, SQLException {
		List<BankMaster> bankMasterList = new ArrayList<BankMaster>();
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from bank_master";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		BankMaster bankMaster = null;
		while (rs.next()) {
			bankMaster = new BankMaster();
			bankMaster.setAccountCode(rs.getString(3));
			bankMaster.setBankCode(rs.getInt(1));
			bankMaster.setBankName(rs.getString(2));
			bankMaster.setCheckPrintFormatId(rs.getInt(5));
			bankMaster.setTransactionCode(rs.getString(4));
			bankMasterList.add(bankMaster);
		}

		return bankMasterList;
	}

	public int addBankMaster(BankMaster bankMaster) throws ClassNotFoundException, SQLException {
		int recordsAdded = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "insert into bank_master values(?,?,?,?,?)";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, bankMaster.getBankCode());
		preparedStatement.setString(2, bankMaster.getBankName());
		preparedStatement.setString(3, bankMaster.getAccountCode());
		preparedStatement.setString(4, bankMaster.getTransactionCode());
		preparedStatement.setInt(5, bankMaster.getCheckPrintFormatId());

		recordsAdded = preparedStatement.executeUpdate();// data is inserted after this line is executed
		logger.info(recordsAdded + " bank_master(s) added");

		return recordsAdded;
	}
	
	public int updateBankMaster(BankMaster bankMaster) throws ClassNotFoundException, SQLException {
		int recordsUpdated = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		
		String sql = "update bank_master set BANK_NAME='" + bankMaster.getBankName() + "', TRANSACTION_CODE='"
				+ bankMaster.getTransactionCode() + "',CHECK_PRINT_FORMAT_ID=" + bankMaster.getCheckPrintFormatId() + ", ACCOUNT_CODE='"+bankMaster.getAccountCode()+", where BANK_ACCOUNT_CODE="
				+ bankMaster.getBankCode();

		Statement statement = con.createStatement();

		recordsUpdated = statement.executeUpdate(sql);
		logger.info(recordsUpdated + " job_receipt updated");

		return recordsUpdated;
	}

	public synchronized long getNextBankCodeFromSequence() throws ClassNotFoundException, SQLException {

		long nextJobNumber = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select bank_master_sequence.nextval from dual";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			nextJobNumber = rs.getLong(1);
		}
		return nextJobNumber;
	}

}
