package com.krishna.chasystem.web.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.YearEntryMaster;

@Repository
public class YearRepository {
	
	public List<YearEntryMaster> getAllYears() {
		List<YearEntryMaster> listOfYearEntries = new ArrayList<YearEntryMaster>();

		YearEntryMaster yearEntryMaster = new YearEntryMaster();
		yearEntryMaster.setBeginYear(2010);
		yearEntryMaster.setEndYear(2011);
		yearEntryMaster.setYearCode(1001);
		listOfYearEntries.add(yearEntryMaster);
		
		yearEntryMaster = new YearEntryMaster();
		yearEntryMaster.setBeginYear(2011);
		yearEntryMaster.setEndYear(2012);
		yearEntryMaster.setYearCode(1002);
		listOfYearEntries.add(yearEntryMaster);
		
		yearEntryMaster = new YearEntryMaster();
		yearEntryMaster.setBeginYear(2012);
		yearEntryMaster.setEndYear(2013);
		yearEntryMaster.setYearCode(1003);
		listOfYearEntries.add(yearEntryMaster);
		
		yearEntryMaster = new YearEntryMaster();
		yearEntryMaster.setBeginYear(2013);
		yearEntryMaster.setEndYear(2014);
		yearEntryMaster.setYearCode(1004);
		listOfYearEntries.add(yearEntryMaster);
		
		yearEntryMaster = new YearEntryMaster();
		yearEntryMaster.setBeginYear(2014);
		yearEntryMaster.setEndYear(2015);
		yearEntryMaster.setYearCode(1005);
		listOfYearEntries.add(yearEntryMaster);
		
		yearEntryMaster = new YearEntryMaster();
		yearEntryMaster.setBeginYear(2015);
		yearEntryMaster.setEndYear(2016);
		yearEntryMaster.setYearCode(1006);
		listOfYearEntries.add(yearEntryMaster);
		
		
		yearEntryMaster = new YearEntryMaster();
		yearEntryMaster.setBeginYear(2016);
		yearEntryMaster.setEndYear(2017);
		yearEntryMaster.setYearCode(1007);
		listOfYearEntries.add(yearEntryMaster);
		
		yearEntryMaster = new YearEntryMaster();
		yearEntryMaster.setBeginYear(2017);
		yearEntryMaster.setEndYear(2018);
		yearEntryMaster.setYearCode(1008);
		listOfYearEntries.add(yearEntryMaster);
		
		
		yearEntryMaster = new YearEntryMaster();
		yearEntryMaster.setBeginYear(2018);
		yearEntryMaster.setEndYear(2019);
		yearEntryMaster.setYearCode(1009);
		listOfYearEntries.add(yearEntryMaster);
		
		return listOfYearEntries;
	}

}
