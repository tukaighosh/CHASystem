package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.BranchMaster;

@Repository
public class BranchMasterRepository {
	Logger logger = Logger.getLogger(BranchMaster.class);
	Connection con;

	public List<BranchMaster> getBranchMasterMap() throws ClassNotFoundException, SQLException {
		List<BranchMaster> branchMasterList = new ArrayList<BranchMaster>();
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from branch_master";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		BranchMaster branchMaster;
		while(rs.next())
		{
			branchMaster = new BranchMaster();
			branchMaster.setBranchCode(rs.getInt(1));
			branchMaster.setBranchName(rs.getString(2));
			branchMasterList.add(branchMaster);
		}
		return branchMasterList;
	}

}
