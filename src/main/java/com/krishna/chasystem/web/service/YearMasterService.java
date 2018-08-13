package com.krishna.chasystem.web.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.krishna.chasystem.web.dto.YearEntryMaster;
import com.krishna.chasystem.web.repository.YearRepository;

@Service
public class YearMasterService {

	@Autowired
	YearRepository yearRepository;
	
	public Map<Integer, String> getyearCodeAndDurationMap() throws ClassNotFoundException, SQLException
	{
		Map<Integer, String> yearCodeAndDurationMap = new TreeMap<Integer, String>();
		List<YearEntryMaster> yearEntries = yearRepository.getAllYears();
		for(YearEntryMaster yearEntry : yearEntries)
		{
			yearCodeAndDurationMap.put(yearEntry.getYearCode(), yearEntry.getBeginYear()+"-"+yearEntry.getEndYear());
		}
		return yearCodeAndDurationMap;
	}
}
