package com.krishna.chasystem.web.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
		Map<String,String> mapOfDebtors = new TreeMap<String,String>();
		
		for(Master master : masterList)
		{
			mapOfDebtors.put(master.getAccountCode(), master.getAccountCode()+"-"+master.getAccountHead());
		}
		return mapOfDebtors;
	}
}
