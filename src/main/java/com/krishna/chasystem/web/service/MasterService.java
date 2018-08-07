package com.krishna.chasystem.web.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.Master;
import com.krishna.chasystem.web.repository.MasterRepository;

@Service
public class MasterService {

	@Autowired
	MasterRepository masterRepository;
	
	public  Map<String,String> getDebtorsMap() throws ClassNotFoundException, SQLException
	{
		List<Master> masterList = masterRepository.getListOfMaster();
		Map<String,String> mapOfDebtors = new HashMap<String,String>();
		mapOfDebtors.put("D001","D001-ABCD");
		mapOfDebtors.put("D002","D002-PQRS");
		mapOfDebtors.put("D003","D003-WXYZ");
		mapOfDebtors.put("D004","D004-MNOP");
		/*for(Master master : masterList)
		{
			if(master.getAccountCode().startsWith("D"))
			{
				listOfDebtors.add(master.getAccountCode()+"-"+master.getAccountHead());
			}
		}*/
		return mapOfDebtors;
		
	}
	
	
}
