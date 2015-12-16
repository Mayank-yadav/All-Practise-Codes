package com.yash.jsf.beans;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import com.yash.jsf.services.CartServiceImpl;
import com.yash.jsf.services.CartServiceIntf;
import com.yash.jsf.services.CustomerServiceImpl;

@ManagedBean
@RequestScoped
public class CartBean {

	private int quantity,price,sum;
	private String product;
	ArrayList<CartBean> cartdata;
	@Inject
	CartServiceIntf cartservice;
	
	
	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String getProduct() {
		return product;
	}


	public void setProduct(String product) {
		this.product = product;
		System.out.println(product);
	}


	


	public String savecart(){
		System.out.println("inside savecart quantity:"+quantity);
		System.out.println("price:"+price);
		System.out.println("product:"+product);
		cartservice.saveCartData(this);
		
		return null;
	}

	public void deleteCart(){
		System.out.println("inside delete cart");
		cartservice.deleteCartData(this);
	}
	

	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
		System.out.println(price);
	}
	
	
	public ArrayList<CartBean> getCart(){
		cartdata=cartservice.getCartDetail();
		
		return cartdata;
		
		
		
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
		System.out.println("sum is:"+sum);
	}

}
