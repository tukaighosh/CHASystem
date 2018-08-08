package com.krishna.chasystem.web.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;

import com.krishna.chasystem.web.dto.UserMaster;

@Repository
public class UserMasterRepository {

	public boolean isAuthenticatedUser(UserMaster user) throws ClassNotFoundException, SQLException
	{
		boolean isAuthenticated = false;
		/*Connection con = JdbcConnection.getConnection();
		String sql = "select * from user_master where user_id=? and password=?";
		
		PreparedStatement preparedStatement = con.prepareStatement(sql);
		preparedStatement.setInt(1, user.getUserId());
		preparedStatement.setString(2, user.getPassword());
		
		ResultSet rs = preparedStatement.executeQuery();
		if(rs.getFetchSize()>0)
			isAuthenticated=true;
		rs.close();
*/
		isAuthenticated = true;
		return isAuthenticated;
	}
}
