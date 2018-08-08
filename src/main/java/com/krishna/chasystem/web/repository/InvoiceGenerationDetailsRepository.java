package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.InvoiceGenerationDetailsMaster;
import com.krishna.chasystem.web.util.CommonUtils;

@Repository
public class InvoiceGenerationDetailsRepository
{

	static Logger  logger = Logger.getLogger(InvoiceGenerationDetailsRepository.class);
	static Connection con;
	
	public  int addJobReceiptEntry( InvoiceGenerationDetailsMaster  invoicedetail) throws ClassNotFoundException, SQLException
	{
		// write body to get connection, create prepared statement then execute update
		
		int recordsAdded = 0;
		if(con == null)
		{
			con = JdbcConnection.getConnection();
		}
		String sql = "insert into invoice_generation_details(INVOICE_GENERATION_DATE,PRODUCT_QUANTITY,UNIT_OF_MEASURE,OUTGOING_AMOUNT,VEHICLE_CHALLAN_NUMBER,VEHICLE_CHALLAN_DATE,CHALLAN_DETAILS,JOB_NUMBER,RATE_PER_UNIT,USER_ID,BRANCH_CODE,ID) values(?,?,?,?,?,?,?,?,?,?,?,?)";
	
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setDate(1, CommonUtils.getCurrentDateInSql());
		preparedStatement.setDouble(2, invoicedetail.getProductQuantity());
		preparedStatement.setString(3, invoicedetail.getUnitOfMeasure());
		preparedStatement.setDouble(4, invoicedetail.getOutgoingAmount());
		preparedStatement.setString(5, invoicedetail.getVehicleChallanNumber());
		preparedStatement.setDate(6, invoicedetail.getVehicleChallanDate());
		preparedStatement.setString(7, invoicedetail.getChallanDetails());
		preparedStatement.setString(8, invoicedetail.getJobNumber());
		preparedStatement.setDouble(9, invoicedetail.getRatePerUnit());
		preparedStatement.setString(10, invoicedetail.getUserId());
		preparedStatement.setString(11, invoicedetail.getBranchCode());
		preparedStatement.setLong(12, getInvoiceSequenceValue());
		
				
		recordsAdded = preparedStatement.executeUpdate();// data is inserted after this line is executed
		logger.info(recordsAdded+" invoice_generation_detail(s) added");
		return recordsAdded;
		
	}
	
	public synchronized static long getInvoiceSequenceValue() throws ClassNotFoundException, SQLException
	{
		long nextJobNumber = 0;
		if(con == null)
		{
			con = JdbcConnection.getConnection();
		}
		String sql = "select invoice_generation_sequence.nextval from dual";
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
		{
			nextJobNumber = rs.getLong(1);
		}
		return nextJobNumber;
	}
}
