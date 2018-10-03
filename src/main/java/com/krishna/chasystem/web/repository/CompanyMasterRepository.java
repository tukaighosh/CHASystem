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

import com.krishna.chasystem.web.dto.CompanyMaster;

@Repository
public class CompanyMasterRepository {
	Logger logger = Logger.getLogger(BankMasterRepository.class);
	Connection con;
	
	/**
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public List<CompanyMaster> getAllCompanyMasterList() throws SQLException, ClassNotFoundException {
		List<CompanyMaster> companyList = new ArrayList<CompanyMaster>();
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from company_master";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		CompanyMaster company = null;
		while (rs.next()) {
			company = new CompanyMaster();
			company.setCompanyCode(rs.getInt(1));
			company.setCompanyName(rs.getString(2));
			company.setYearCode(rs.getInt(3));
			companyList.add(company);
		}

		return companyList;
	}
	
	/**
	 * @param company
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int addCompanyMaster(CompanyMaster company) throws ClassNotFoundException, SQLException {
		int recordsAdded = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "insert into company_master values(?,?,?,?,?)";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setLong(1, getNextCompanyCodeFromSequence());
		preparedStatement.setString(2, company.getCompanyName());
		preparedStatement.setInt(3, company.getYearCode());

		recordsAdded = preparedStatement.executeUpdate();// data is inserted after this line is executed
		logger.info(recordsAdded + " company_master(s) added");

		return recordsAdded;
	}

	/**
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public synchronized long getNextCompanyCodeFromSequence() throws ClassNotFoundException, SQLException {

		long nextJobNumber = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select company_master_sequence.nextval from dual";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			nextJobNumber = rs.getLong(1);
		}
		return nextJobNumber;
	}
	
}
