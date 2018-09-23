package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.JobReceiptMaster;
import com.krishna.chasystem.web.util.CommonUtils;

@Repository
public class JobReceiptRepository {

	static Logger logger = Logger.getLogger(JobReceiptRepository.class);
	static Connection con;

	public  int addJobReceiptEntry(JobReceiptMaster jobReceipt) throws ClassNotFoundException, SQLException {
		// write body to get connection, create prepared statement then execute update

		int recordsAdded = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "insert into job_receipt values(?,?,?,?,?,?,?,?,?,?,?,?)";

		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setDate(1, jobReceipt.getJobDate());
		preparedStatement.setDate(2, jobReceipt.getInvoiceDate());
		preparedStatement.setString(3, jobReceipt.getReceiptNumber());
		preparedStatement.setDate(4, jobReceipt.getReceiptDate());
		preparedStatement.setDouble(5, jobReceipt.getReceiptAmount());
		preparedStatement.setString(6, jobReceipt.getReceiptDetail());
		preparedStatement.setDate(7, CommonUtils.getCurrentDateInSql());
		preparedStatement.setString(8, jobReceipt.getJobNumber());
		preparedStatement.setString(9, jobReceipt.getInvoiceNo());
		preparedStatement.setString(10, jobReceipt.getUserId());
		preparedStatement.setString(11, jobReceipt.getBranchCode());
		preparedStatement.setLong(12, getJobReceiptSequenceValue());
		preparedStatement.setInt(13, jobReceipt.getExpenseCode());
		preparedStatement.setString(14, jobReceipt.getAccountCode());
		preparedStatement.setString(15, jobReceipt.getBankAccountCode());
		preparedStatement.setString(16, jobReceipt.getPaymentMode());
		preparedStatement.setString(17, jobReceipt.getChequeNumber());
		preparedStatement.setString(18, jobReceipt.getRtgsNumber());
		

		recordsAdded = preparedStatement.executeUpdate();// data is inserted after this line is executed
		logger.info(recordsAdded + " job_receipt(s) added");
		return recordsAdded;

	}
	
	public int updateJobMasterEntry(JobReceiptMaster jobReceipt) throws ClassNotFoundException, SQLException {
		int recordsAdded = 0;
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		
		String sql = "update job_master set JOB_DATE='" + jobReceipt.getBranchCode() + "', INVOICE_DATE='"
				+ jobReceipt.getInvoiceDate() + "',RECEIPT_NUMBER='" + jobReceipt.getReceiptNumber() + "',RECEIPT_DATE='"
				+ jobReceipt.getReceiptDate() + "',RECEIPT_AMOUNT=" + jobReceipt.getReceiptAmount() + ",RECEIPT_DETAIL='" + jobReceipt.getReceiptDetail()
				+ "',RUN_DATE='" + jobReceipt.getRunDate() + "',JOB_NUMBER='" + jobReceipt.getJobNumber() + "',INVOICE_NUMBER="
				+ jobReceipt.getInvoiceNo() + "',USER_ID=" + jobReceipt.getUserId() + ",BRANCH_CODE="
				+ jobReceipt.getBranchCode() + ",EXPENSE_CODE="
				+ jobReceipt.getExpenseCode() + ",ACCOUNT_CODE='" + jobReceipt.getAccountCode() + "',BANK_ACCOUNT_CODE='"
				+ jobReceipt.getBankAccountCode() + "',PAYMENT_MODE='" + jobReceipt.getPaymentMode() + "',CHEQUE_NUMBER='"
				+ jobReceipt.getChequeNumber() + ",RTGS_NUMBER='" + jobReceipt.getRtgsNumber() + "' where ID="+jobReceipt.getId();

		Statement statement = con.createStatement();

		recordsAdded = statement.executeUpdate(sql);
		logger.info(recordsAdded + " job_receipt updated");

		return recordsAdded;
	}
	
	
	public synchronized static long getJobReceiptSequenceValue() throws ClassNotFoundException, SQLException
	{
		long nextJobNumber = 0;
		if(con == null)
		{
			con = JdbcConnection.getConnection();
		}
		String sql = "select job_receipt_sequence.nextval from dual";
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			nextJobNumber = rs.getLong(1);
		}
		return nextJobNumber;
	}
}
