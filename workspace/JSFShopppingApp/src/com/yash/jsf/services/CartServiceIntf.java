package com.yash.jsf.services;

import java.util.ArrayList;

import com.yash.jsf.beans.CartBean;

public interface CartServiceIntf {

	public void saveCartData(CartBean cartbean);

	public ArrayList<CartBean> getCartDetail();
	
	public void deleteCartData(CartBean cartbean);
}
