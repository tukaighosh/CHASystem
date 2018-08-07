package com.krishna.chasystem.web.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.Master;
import com.krishna.chasystem.web.repository.MasterRepository;

@Service
public class MasterService {

	@Autowired
	 static MasterRepository masterRepository;
	
	public  List<String> getListOfMaster() throws ClassNotFoundException, SQLException
	{
		List<Master> masterList = masterRepository.getListOfMaster();
		List<String> listOfDebtors = new ArrayList<String>();
		for(Master master : masterList)
		{
			if(master.getAccountCode().startsWith("D"))
			{
				listOfDebtors.add(master.getAccountCode()+"-"+master.getAccountHead());
			}
		}
		return listOfDebtors;
		
	}
	
	
}
