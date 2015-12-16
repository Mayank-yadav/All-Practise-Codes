package org.assignment1;

public class Customer{

private int custId;
private String custName;
public int member1=1;
private int member2=2;
protected int member3=3;
int member4=4;
static final int MAXPHONE=10;
static int custCount;
 Customer(){
	 	System.out.println("Customer constructor called");
		custCount++;
	//	System.out.println("custCount:"+custCount);
		//this.MAXPHONE=10;

 }
	public void print(){
	System.out.println("Print Method invoked in print method");
	System.out.println("member:"+member1);
	System.out.println("member:"+member2);
	System.out.println("member:"+member3);
	System.out.println("member:"+member4);
			//System.out.println("Value:"+custCount);

		
	}
	
	 class Address{
		public void print(){
		System.out.println("Address class is invoked");
		}
	}
	
	class Contact{
		public void print(){
		System.out.println("Contact class is invoked");
				//System.out.println("Value:"+custCount);

		}
		
	}
	
	class CustCount{
		public void display(){
		System.out.println("custCount:"+custCount);

		}
			
		}
	public void display(){
		System.out.println("custCount:"+custCount);
		System.out.println("MAXPHONE:"+MAXPHONE);
		}
		
	public float discount(float price){
		float discount=(float)(price*0.2);
		//System.out.print("DISCOUNTED PRICE:"+(price-discount));
		return (price-discount) ;
	}
	
}