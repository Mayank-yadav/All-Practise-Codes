package com.yash.employeenmanagementsystem.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DBUtil {

	//Connection connection=ConnectionProvider.getConnection();
	public ResultSet select(String query){
		PreparedStatement preparedstatement;
		ResultSet result = null;
		Connection connection=ConnectionProvider.getConnection();
		try {
			preparedstatement=connection.prepareStatement(query);
			result=preparedstatement.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
		
	}
	
	public void Update(String query){
		PreparedStatement preparedstatement;
		Connection connection=ConnectionProvider.getConnection();
		try {
			preparedstatement=connection.prepareStatement(query);
			preparedstatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
