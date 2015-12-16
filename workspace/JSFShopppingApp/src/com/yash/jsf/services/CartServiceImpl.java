package com.yash.jsf.services;

import java.util.ArrayList;

import javax.inject.Inject;

import com.yash.jsf.beans.CartBean;
import com.yash.jsf.dao.CartDao;

public class CartServiceImpl implements CartServiceIntf{
	
	@Inject
	CartDao cartdao;
	
	@Override
	public void saveCartData(CartBean cartbean) {
		// TODO Auto-generated method stub
		String query="Insert into cartdata(product,price,quantity,sum) values("
				+"'"+cartbean.getProduct() +"','"
				+ cartbean.getPrice()+"','"
				+ cartbean.getQuantity()+"','"
				+ cartbean.getSum()
				+ "')";
		cartdao.update(query);
	}
	@Override
	public ArrayList<CartBean> getCartDetail() {

		String query="Select * From cartdata";
		
		return cartdao.select(query);
	}
	@Override
	public void deleteCartData(CartBean cartbean) {
		// TODO Auto-generated method stub
		String query="Delete * from cartdata";
		cartdao.update(query);
	}

}
