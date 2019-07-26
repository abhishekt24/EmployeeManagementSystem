package com.db.employeemanagementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.db.employeemanagementsystem.bean.LoginBean;
import com.db.employeemanagementsystem.util.DBUtil;

public class LoginDAOImpl implements LoginDAO {

	public boolean authenticate(LoginBean login) {
		// TODO Auto-generated method stub
		String query="select * from login_table where username=? and password=?";
		Connection connection=null;
		PreparedStatement preparedstatement=null;
		ResultSet resultSet=null;
		connection=DBUtil.getConnection();
		try {
			preparedstatement=connection.prepareStatement(query);
			preparedstatement.setString(1, login.getUserName());
			preparedstatement.setString(2,login.getPassword());
			resultSet=preparedstatement.executeQuery();
			if(resultSet.next()) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

}
