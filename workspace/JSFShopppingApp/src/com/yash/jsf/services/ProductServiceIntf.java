package com.yash.jsf.services;

import java.util.ArrayList;

import com.yash.jsf.beans.ProductsBean;

public interface ProductServiceIntf {

	public ArrayList<ProductsBean> getProductDetails(int categoryid);
}
