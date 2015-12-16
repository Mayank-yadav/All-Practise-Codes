package org.assignment1;


class Contractor extends Employee{
int var=100000;
Contractor(){
	int empID=100;
	
	System.out.println("Using Contractor Constructor initialize value of empID:"+empID);
	}
public void display(){
		System.out.println("new value for var"+var);

	}

public void equals(Object first, Object second){
	/*Integer a = (Integer)first;
	Integer b = (Integer)second;
	if(a==b){
		System.out.println("Inputs have equal address");
	}
	else if((a).equals(b)){
		System.out.println("Inputs have equal value");	
	}	
	else{
		System.out.println("Values are unequal");
	}
}*/
	if(first==second){
		System.out.println("Inputs have equal address");
	}
	else if((first).equals(second)){
		System.out.println("Inputs have equal value");	
	}	
	else{
		System.out.println("Values are unequal");

}}}