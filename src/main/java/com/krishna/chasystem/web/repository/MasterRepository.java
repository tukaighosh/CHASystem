package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.Master;

@Repository
public class MasterRepository {
	Logger logger = Logger.getLogger(BankMasterRepository.class);
	Connection con;
	public List<Master> getListOfMaster() throws ClassNotFoundException, SQLException {
		List<Master> masterList = new ArrayList<Master>();

		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from master";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		Master master;
		while(rs.next())
		{
			master = new Master();
			master.setAccountCode(rs.getString(1));
			master.setAccountHead(rs.getString(2));
			master.setCurrentDebit(rs.getDouble(3));
			master.setCurrentCredit(rs.getDouble(4));
			master.setScheduleCode(rs.getInt(5));
			master.setBalance(rs.getDouble(6));
			master.setOpeningBalance(rs.getDouble(7));
			
			masterList.add(master);
		}
		return masterList;
	}
}
