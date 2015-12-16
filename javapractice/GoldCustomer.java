package org.assignment1;

public class GoldCustomer extends Customer{

public float discount(float price){
		float discount=(float)(price*0.3);
		//System.out.print("DISCOUNTED PRICE:"+(price-discount));
		return (price-discount) ;
	}
}