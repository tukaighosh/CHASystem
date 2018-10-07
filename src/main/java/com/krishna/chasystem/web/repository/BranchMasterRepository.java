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

import com.krishna.chasystem.web.dto.BranchMaster;

@Repository
public class BranchMasterRepository {
	Logger logger = Logger.getLogger(BranchMaster.class);
	Connection con;

	/**
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public List<BranchMaster> getBranchMasterList() throws ClassNotFoundException, SQLException {
		List<BranchMaster> branchMasterList = new ArrayList<BranchMaster>();
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from branch_master";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		BranchMaster branchMaster;
		while(rs.next())
		{
			branchMaster = new BranchMaster();
			branchMaster.setBranchCode(rs.getInt(1));
			branchMaster.setBranchName(rs.getString(2));
			branchMasterList.add(branchMaster);
		}
		return branchMasterList;
	}
	
	/**
	 * @param branchMaster
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int addBankMaster(BranchMaster branchMaster) throws ClassNotFoundException, SQLException {
		int recordsAdded = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "insert into branch_master values(?,?)";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, branchMaster.getBranchCode());
		preparedStatement.setString(2, branchMaster.getBranchName());

		recordsAdded = preparedStatement.executeUpdate();// data is inserted after this line is executed
		logger.info(recordsAdded + " branch_master(s) added");

		return recordsAdded;
	}
	
	/**
	 * @param branchMaster
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int updateBankMaster(BranchMaster branchMaster) throws ClassNotFoundException, SQLException {
		int recordsUpdated = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		
		String sql = "update branch_master set BRANCH_NAME='" + branchMaster.getBranchName() +" where BRANCH_CODE="
				+ branchMaster.getBranchCode();

		Statement statement = con.createStatement();

		recordsUpdated = statement.executeUpdate(sql);
		logger.info(recordsUpdated + " branch_master updated");

		return recordsUpdated;
	}
	
	
	/** Deletes existing {@link BranchMaster} entry from BranchMaster table based on branchCode value
	 * @param bankCode
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int deleteBranchMaster(int branchCode) throws ClassNotFoundException, SQLException {
		int recordsUpdated = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		
		String sql = "delete from branch_master where BRANCH_CODE="+branchCode;

		Statement statement = con.createStatement();

		recordsUpdated = statement.executeUpdate(sql);
		logger.info(recordsUpdated + " branch_master deleted");

		return recordsUpdated;
	}
	
	
	
	/**
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public synchronized long getNextBranchCodeFromSequence() throws ClassNotFoundException, SQLException {

		long nextJobNumber = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select branch_master_sequence.nextval from dual";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			nextJobNumber = rs.getLong(1);
		}
		return nextJobNumber;
	}
	

}
