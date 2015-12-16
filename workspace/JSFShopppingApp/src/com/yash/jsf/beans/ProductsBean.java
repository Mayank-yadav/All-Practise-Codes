package com.yash.jsf.beans;

import java.util.ArrayList;

import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import com.yash.jsf.services.ProductServiceImpl;
import com.yash.jsf.services.ProductServiceIntf;
@ManagedBean
@RequestScoped
public class ProductsBean {
	@Inject
	ProductServiceIntf productservice;
	
	private String productname,productprice,productimage,productcategoryid;
	ArrayList<ProductsBean> items;
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
		System.out.println(productname);
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
		System.out.println(productprice);
	}
	public String getProductimage() {
		return productimage;
	}
	public void setProductimage(String productimage) {
		this.productimage = productimage;
	}
	public String getProductcategoryid() {
		return productcategoryid;
	}
	public void setProductcategoryid(String productcategoryid) {
		this.productcategoryid = productcategoryid;
	}
	
	public void add(){
		System.out.println("inside the  function");
	}
	
	public ArrayList<ProductsBean> getMenProduct(){
		System.out.println("inside getMenProduct");
		int categoryid=1;	
		System.out.println(categoryid);
		items=productservice.getProductDetails(categoryid);
		System.out.println(items.toString());
		/*Gson gson=new Gson();
		String men=gson.toJson(items);
		System.out.println(men);*/
		return items;
		
	}
	public String getWomenProduct(){
		return productcategoryid;
		
	}
	public String getChildrenProduct(){
		return productcategoryid;
	}
	@Override
	public String toString() {
		return "ProductsBean [productservice=" + productservice
				+ ", productname=" + productname + ", productprice="
				+ productprice + ", productimage=" + productimage
				+ ", productcategoryid=" + productcategoryid + ", items="
				+ items + "]";
	}
	
	
	
	
}
