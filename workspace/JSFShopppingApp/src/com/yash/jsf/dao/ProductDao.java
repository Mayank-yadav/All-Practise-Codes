package com.yash.jsf.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import com.yash.jsf.beans.ProductsBean;
import com.yash.jsf.util.ConnectDB;



public class ProductDao {

	
	
	public ArrayList<ProductsBean> SelectProducts(String query){
		Connection connection=ConnectDB.getConnection();
		PreparedStatement preparedstatement;
		ResultSet result=null;
		List<ProductsBean> list=new ArrayList<ProductsBean>();
		try {
			preparedstatement=connection.prepareStatement(query);
			result=preparedstatement.executeQuery();
			
			while(result.next()){
				ProductsBean products=new ProductsBean();
				System.out.println("inside productdao"+products);
				products.setProductname(result.getString("productname"));
				products.setProductprice(result.getString("productprice"));
				products.setProductimage(result.getString("productimage"));
				products.setProductcategoryid(result.getString("productcategory"));
				list.add(products);
			}
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return (ArrayList<ProductsBean>) list;
		
	}
}
