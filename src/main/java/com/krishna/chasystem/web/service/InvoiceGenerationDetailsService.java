package com.krishna.chasystem.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.InvoiceGenerationDetailsMaster;
import com.krishna.chasystem.web.repository.InvoiceGenerationDetailsRepository;

@Service
public class InvoiceGenerationDetailsService {

	@Autowired
	InvoiceGenerationDetailsRepository invoiceMaster;
	
	public int addInvoiceGenerationDetailsRepository(InvoiceGenerationDetailsMaster invoicedetail) throws ClassNotFoundException, SQLException
	{
		return invoiceMaster.addInvoiceGenerationDetails(invoicedetail);
	}
	
	public List<InvoiceGenerationDetailsMaster> getAllInvoiceDetailsList()
	{
		return invoiceMaster.getAllInvoiceDetailsList();
	}
}
