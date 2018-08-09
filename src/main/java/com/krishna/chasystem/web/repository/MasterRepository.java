package com.krishna.chasystem.web.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.constants.ScheduleEnum;
import com.krishna.chasystem.web.dto.Master;

@Repository
public class MasterRepository {

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
		Master master = new Master();
		master.setAccountCode("D001");
		master.setAccountHead("Diamond");
		master.setBalance(1000);
		master.setCurrentCredit(10000);
		master.setCurrentDebit(900);
		master.setOpeningBalance(10000);
		master.setSchedule(ScheduleEnum.valueOf("ABC"));
		masterList.add(master);
		
		master = new Master();
		master.setAccountCode("D002");
		master.setAccountHead("Gold");
		master.setBalance(10000);
		master.setCurrentCredit(90000);
		master.setCurrentDebit(1000);
		master.setOpeningBalance(80000);
		master.setSchedule(ScheduleEnum.valueOf("BCD"));
		masterList.add(master);
		
		return masterList;
	}

}
