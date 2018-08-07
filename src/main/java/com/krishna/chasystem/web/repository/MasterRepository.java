package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.Master;

@Repository
public class MasterRepository {
	@Autowired
	Master master;

	public List<Master> getListOfMaster() throws ClassNotFoundException, SQLException {
		List<Master> masterList = new ArrayList<Master>();
		/*Connection con = null;
		if(con == null)
		{
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from master where account_code like 'D%'";
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		while(rs.next())
		{
			master.setAccountCode(rs.getString(1));
			master.setAccountHead(rs.getString(2));
			masterList.add(master);
		}*/
		
		master.setAccountCode("D001");
		master.setAccountHead("Diamond");
		masterList.add(master);
		
		return masterList;
	}

}
