package com.yash.jsf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.yash.jsf.beans.CartBean;
import com.yash.jsf.util.ConnectDB;

public class CartDao {

	public ArrayList<CartBean> select(String query){
		Connection connection=ConnectDB.getConnection();
		PreparedStatement preparedstatement;
		ResultSet result=null;
		ArrayList<CartBean> cartlist=new ArrayList<CartBean>();
		try {
			preparedstatement=connection.prepareStatement(query);
			result=preparedstatement.executeQuery();
			while(result.next()){
				CartBean cartbean=new CartBean();
				cartbean.setPrice(result.getInt("price"));
				cartbean.setProduct(result.getString("product"));
				cartbean.setQuantity(result.getInt("quantity"));
				cartbean.setSum(result.getInt("sum"));
				cartlist.add(cartbean);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cartlist;
		
	}
	
	public void update(String query){
		Connection connection= ConnectDB.getConnection();
		PreparedStatement preparedstatement = null ;
			System.out.println("inside dao"+query);
			try {
				preparedstatement=connection.prepareStatement(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				preparedstatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
	
}
