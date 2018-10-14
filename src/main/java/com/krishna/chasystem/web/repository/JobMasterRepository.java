package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.JobMaster;
import com.krishna.chasystem.web.util.CommonUtils;

/*	1) Generally refers to a central place where data is stored and maintained.
A repository can be a place where multiple databases or files are located for distribution over a network,
or a repository can be a location that is directly accessible to the user without having to travel across a network.

*/
@Repository
public class JobMasterRepository {
	static Logger logger = Logger.getLogger(JobMasterRepository.class);
	Connection con;

	public int addJobMasterEntry(JobMaster jobMaster) throws ClassNotFoundException, SQLException {
		int recordsAdded = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "insert into job_master values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, jobMaster.getJobNumber());
		preparedStatement.setString(2, jobMaster.getImportOrExport());
		preparedStatement.setInt(3, jobMaster.getBranchCode());
		preparedStatement.setString(4, jobMaster.getShipName());
		preparedStatement.setString(5, jobMaster.getDispatchFrom());
		preparedStatement.setString(6, jobMaster.getDispatchTo());
		preparedStatement.setString(7, jobMaster.getPort());
		preparedStatement.setString(8, jobMaster.getBeNo());
		preparedStatement.setString(9, jobMaster.getCity());
		preparedStatement.setString(10, jobMaster.getPartyRefNo());
		preparedStatement.setString(11, jobMaster.getCommodity());
		preparedStatement.setInt(12, jobMaster.getUnitId());
		preparedStatement.setDouble(13, jobMaster.getQuantity());
		preparedStatement.setDate(14, CommonUtils.getCurrentDateInSql());
		preparedStatement.setLong(15, jobMaster.getUserId());
		preparedStatement.setString(16, jobMaster.getJobCompleted());
		preparedStatement.setString(17, jobMaster.getNarration());
		preparedStatement.setString(18, jobMaster.getTurnKey());
		preparedStatement.setDouble(19, jobMaster.getAdvanceAmount());
		preparedStatement.setInt(20, jobMaster.getYearCode());
		preparedStatement.setString(21, jobMaster.getAccountCode());

		recordsAdded = preparedStatement.executeUpdate();// data is inserted after this line is executed
		logger.info(recordsAdded + " job_master(s) added");

		return recordsAdded;
	}

	public int updateJobMasterEntry(JobMaster jobMaster) throws ClassNotFoundException, SQLException {
		int recordsAdded = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "update job_master set BRANCH_CODE='" + jobMaster.getBranchCode() + "', VESSEL='"
				+ jobMaster.getShipName() + "',DESP_FROM='" + jobMaster.getDispatchFrom() + "',DESP_TO='"
				+ jobMaster.getDispatchTo() + "',PORT='" + jobMaster.getPort() + "',BENO='" + jobMaster.getBeNo()
				+ "',CITY='" + jobMaster.getCity() + "',PARTY_REFNO='" + jobMaster.getPartyRefNo() + "',COMMODITY="
				+ jobMaster.getCommodity() + "',UNIT_ID=" + jobMaster.getUnitId() + ",JOB_QUANTITY="
				+ jobMaster.getQuantity() + ",JOB_CREATION_DATE='" + jobMaster.getJobCreationDate() + "',USER_ID="
				+ jobMaster.getUserId() + ",JOB_COMPLETED='" + jobMaster.getJobCompleted() + "',NARRATION='"
				+ jobMaster.getNarration() + "',TURNKEY='" + jobMaster.getTurnKey() + "',ADVANCE_AMOUNT="
				+ jobMaster.getAdvanceAmount() + ",YEAR_CODE=" + jobMaster.getYearCode() + ",ACCOUNT_CODE='"
				+ jobMaster.getAccountCode() + "' where JOB_NUM='"+jobMaster.getJobNumber()+"'";

		Statement statement = con.createStatement();

		recordsAdded = statement.executeUpdate(sql);
		logger.info(recordsAdded + " job_master updated");

		return recordsAdded;
	}
	
	public JobMaster getJobMasterById(String jobNumber) throws ClassNotFoundException, SQLException
	{
		JobMaster jobMaster = null;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from job_master where JOB_NUM='"+jobNumber+"'";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			jobMaster = new JobMaster();
			jobMaster.setJobNumber(rs.getString(1));
			jobMaster.setImportOrExport(rs.getString(2));
			jobMaster.setBranchCode(rs.getInt(3));
			jobMaster.setShipName(rs.getString(4));
			jobMaster.setDispatchTo(rs.getString(5));
			jobMaster.setDispatchTo(rs.getString(6));
			jobMaster.setPort(rs.getString(7));
			jobMaster.setBeNo(rs.getString(8));
			jobMaster.setCity(rs.getString(9));
			jobMaster.setPartyRefNo(rs.getString(10));
			jobMaster.setCommodity(rs.getString(11));
			jobMaster.setUnitId(rs.getInt(12));
			jobMaster.setQuantity(rs.getDouble(13));
			jobMaster.setJobCreationDate(rs.getDate(14));
			jobMaster.setUserId(rs.getLong(15));
			jobMaster.setJobCompleted(rs.getString(16));
			jobMaster.setNarration(rs.getString(17));
			jobMaster.setTurnKey(rs.getString(18));
			jobMaster.setAdvanceAmount(rs.getDouble(19));
			jobMaster.setYearCode(rs.getInt(20));
			jobMaster.setAccountCode(rs.getString(21));
		}
		return jobMaster;
	}
	
	/** krishna
	 * @param JobNumber
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public int deleteJobMaster(int jobnumber) throws ClassNotFoundException, SQLException {
		int recordsUpdated = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		
		String sql = "delete from job_master where JOB_NUM="+jobnumber;

		Statement statement = con.createStatement();

		recordsUpdated = statement.executeUpdate(sql);
		logger.info(recordsUpdated + " job_master deleted");

		return recordsUpdated;
	}
	

	
	// static synchronized method
	public synchronized long getNextJobNumberFromSequence() throws ClassNotFoundException, SQLException {

		long nextJobNumber = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select job_number_sequence.nextval from dual";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while (rs.next()) {
			nextJobNumber = rs.getLong(1);
		}
		return nextJobNumber;
	}

}
