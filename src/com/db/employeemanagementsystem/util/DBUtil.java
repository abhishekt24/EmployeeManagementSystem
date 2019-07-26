package com.db.employeemanagementsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public final static String  USER_NAME="root";
	public final static String PASSWORD="Comeon1997";
	public final static String DRIVER_NAME="com.mysql.jdbc.Driver";
	public final static String URI="jdbc:mysql://localhost:3306/sample";
	
	public static Connection getConnection() {
		//Load the driver class
		Connection connection=null;
		try {
			Class.forName(DRIVER_NAME);
			connection=DriverManager.getConnection(URI, USER_NAME, PASSWORD);
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//get the connection from get connection method of driver manager class
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	
	}
}
