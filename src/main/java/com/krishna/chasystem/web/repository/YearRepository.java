package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.YearEntryMaster;

@Repository
public class YearRepository {
	Logger logger = Logger.getLogger(YearRepository.class);
	Connection con;

	public List<YearEntryMaster> getAllYears() throws ClassNotFoundException, SQLException {
		List<YearEntryMaster> listOfYearEntries = new ArrayList<YearEntryMaster>();
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from year_master";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		YearEntryMaster yearEntryMaster;
		while(rs.next())
		{
			yearEntryMaster = new YearEntryMaster();
			yearEntryMaster.setBeginYear(rs.getInt(2));
			yearEntryMaster.setEndYear(rs.getInt(3));
			yearEntryMaster.setYearCode(rs.getInt(1));
			listOfYearEntries.add(yearEntryMaster);
		}
		return listOfYearEntries;
	}

}
