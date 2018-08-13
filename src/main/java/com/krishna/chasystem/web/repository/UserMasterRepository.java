package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.UserMaster;

@Repository
public class UserMasterRepository {

	public UserMaster getAuthenticatedUser(UserMaster user) throws ClassNotFoundException, SQLException
	{
		UserMaster userMaster = null;
		Connection con = JdbcConnection.getConnection();
		String sql = "select * from user_master where user_name=? and password=?";
		
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1, user.getUserName());
		preparedStatement.setString(2, user.getPassword());
		
		ResultSet rs = preparedStatement.executeQuery();
		if(rs.next())
		{
			userMaster = new UserMaster();
			userMaster.setUserId(rs.getInt(1));
			userMaster.setUserName(rs.getString(2));
			userMaster.setPassword(rs.getString(3));
			userMaster.setRole(rs.getString(4));
		}
		rs.close();
		return userMaster;
	}
}
