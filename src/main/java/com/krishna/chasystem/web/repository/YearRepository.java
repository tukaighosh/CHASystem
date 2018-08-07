package com.krishna.chasystem.web.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.YearEntry;

@Repository
public class YearRepository {

	@Autowired
	YearEntry yearEntry;
	
	public List<YearEntry> getAllYears() {
		List<YearEntry> listOfYearEntries = new ArrayList<YearEntry>();
		return listOfYearEntries;
	}

}
