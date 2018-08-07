package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.Job_Master;
import com.krishna.chasystem.web.util.CommonUtils;

/*	1) Generally refers to a central place where data is stored and maintained.
A repository can be a place where multiple databases or files are located for distribution over a network,
or a repository can be a location that is directly accessible to the user without having to travel across a network.

*/
@Repository
public class JobMasterRepository {
	static Logger  logger = Logger.getLogger(JobMasterRepository.class);
	Connection con;
	public int addJobMasterEntry(Job_Master jobMaster) throws ClassNotFoundException, SQLException {
		int recordsAdded = 1;
		/*if(con == null)
		{
			con = JdbcConnection.getConnection();
		}
		String sql = "insert into job_master values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, jobMaster.getJobNumber());
		preparedStatement.setString(2, jobMaster.getImportOrExport());
		preparedStatement.setString(3, jobMaster.getBranchCode());
		preparedStatement.setString(4, jobMaster.getVessel());
		preparedStatement.setString(5, jobMaster.getDispatchFrom());
		preparedStatement.setString(6, jobMaster.getDispatchTo());
		preparedStatement.setString(7, jobMaster.getPort());
		preparedStatement.setString(8, jobMaster.getBeNo());
		preparedStatement.setString(9, jobMaster.getCity());
		preparedStatement.setString(10, jobMaster.getPartyRefNo());
		preparedStatement.setString(11, jobMaster.getCommodity());
		preparedStatement.setString(12, jobMaster.getUnit());
		preparedStatement.setDouble(13, jobMaster.getQuantity());
		preparedStatement.setDate(14, CommonUtils.getCurrentDateInSql());
		preparedStatement.setString(15, jobMaster.getUserId());
		preparedStatement.setString(16, jobMaster.getJobCompleted());
		preparedStatement.setDate(17, CommonUtils.getCurrentDateInSql());
		
		recordsAdded = preparedStatement.executeUpdate();// data is inserted after this line is executed
		logger.info(recordsAdded+" job_master(s) added");
	*/	
		return recordsAdded;
	}
	// static synchronized method
	public synchronized long getNextJobNumberFromSequence() throws ClassNotFoundException, SQLException {
		
		/*long nextJobNumber = 0;
		if(con == null)
		{
			con = JdbcConnection.getConnection();
		}
		String sql = "select job_number_sequence.nextval from dual";
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			nextJobNumber = rs.getLong(1);
		}
		return nextJobNumber;*/
		return 1001;
	}
	
}
