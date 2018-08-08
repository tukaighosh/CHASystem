package com.krishna.chasystem.web.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.YearEntryMaster;

@Repository
public class YearRepository {

	@Autowired
	YearEntryMaster yearEntry;
	
	public List<YearEntryMaster> getAllYears() {
		List<YearEntryMaster> listOfYearEntries = new ArrayList<YearEntryMaster>();
		return listOfYearEntries;
	}

}
