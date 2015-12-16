package com.yash.jsf.services;

import java.util.ArrayList;

import javax.inject.Inject;

import com.yash.jsf.beans.ProductsBean;
import com.yash.jsf.dao.ProductDao;


public class ProductServiceImpl implements ProductServiceIntf{

	@Inject
	ProductDao productdao;
	
	@Override
	public ArrayList<ProductsBean> getProductDetails(int categoryid) {
		String query="Select * From products where productcategory=('"+categoryid+"')";
		System.out.println(query);
		return productdao.SelectProducts(query);
	}

	
}
