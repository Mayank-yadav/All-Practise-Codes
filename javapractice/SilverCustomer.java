package org.assignment1;

public class SilverCustomer extends Customer{

	public float discount(float price){
		float discount=(float)(price*0.7);
		//System.out.print("DISCOUNTED PRICE:"+(price-discount));
		return (price-discount) ;
	}
	
	public float discount(String price){
		float a =Float.parseFloat(price);
		float b = (float)(a*0.4);
		System.out.print("DISCOUNTED PRICE:"+(a-b));
		return (a-b);
	}
	
}
