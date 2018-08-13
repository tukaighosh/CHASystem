package com.krishna.chasystem.web.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.UnitMaster;
import com.krishna.chasystem.web.repository.UnitMasterRepository;

@Service
public class UnitMasterService {

	@Autowired
	UnitMasterRepository unitMasterRepository;
	
	public List<UnitMaster> getListOfUnitMaster() throws ClassNotFoundException, SQLException
	{
		return unitMasterRepository.getUnitMasterList();
	}
}
