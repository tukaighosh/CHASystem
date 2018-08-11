package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.UnitMaster;

@Repository
public class UnitMasterRepository {
	Logger logger = Logger.getLogger(UnitMasterRepository.class);
	Connection con;

	public List<UnitMaster> getUnitMasterList() throws ClassNotFoundException, SQLException {
		List<UnitMaster> unitMasterList = new ArrayList<UnitMaster>();
		if (con == null) {
			con = JdbcConnection.getConnection();
		}
		String sql = "select * from unit_master";

		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		UnitMaster unitMaster = null;
		while (rs.next()) {
			unitMaster = new UnitMaster();
			unitMaster.setUnitId(rs.getInt(1));
			unitMaster.setUnitName(rs.getString(2));
			unitMasterList.add(unitMaster);
		}
		return unitMasterList;
	}

}
