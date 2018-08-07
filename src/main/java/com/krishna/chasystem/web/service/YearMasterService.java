package com.krishna.chasystem.web.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.chasystem.web.dto.YearEntry;
import com.krishna.chasystem.web.repository.YearRepository;

@Service
public class YearMasterService {

	@Autowired
	YearRepository yearRepository;
	
	public Map<Integer, String> getyearCodeAndDurationMap()
	{
		Map<Integer, String> yearCodeAndDurationMap = new HashMap<Integer, String>();
		List<YearEntry> yearEntries = yearRepository.getAllYears();
		for(YearEntry yearEntry : yearEntries)
		{
			yearCodeAndDurationMap.put(yearEntry.getYearCode(), yearEntry.getBeginYear()+"-"+yearEntry.getEndYear());
		}
		
		//to be removed code
		yearCodeAndDurationMap.put(1000, "2010-2011");
		yearCodeAndDurationMap.put(1001, "2011-2012");
		yearCodeAndDurationMap.put(1002, "2012-2013");
		yearCodeAndDurationMap.put(1003, "2013-2014");
		yearCodeAndDurationMap.put(1004, "2014-2015");
		yearCodeAndDurationMap.put(1005, "2015-2016");
		yearCodeAndDurationMap.put(1006, "2016-2017");
		yearCodeAndDurationMap.put(1007, "2017-2018");
		yearCodeAndDurationMap.put(1008, "2018-2019");
		yearCodeAndDurationMap.put(1009, "2019-2020");
		yearCodeAndDurationMap.put(1010, "2020-2021");
		yearCodeAndDurationMap.put(1011, "2021-2022");
		return yearCodeAndDurationMap;
	}
}
