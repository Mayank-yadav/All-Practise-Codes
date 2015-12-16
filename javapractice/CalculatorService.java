package org.interfacepractice;
import java.io.*;
public class CalculatorService implements Calculator , ScientificCalculator{
public void divide(double a,double b){

   double div=(a/b);
   System.out.println("Division Result:"+div);
   //return div;
}
public void sum(double a,double b){
   double sum=a+b;
   System.out.println("Sum Result:"+sum);
 //  return sum;
}

public void multiply(double a,double b){
   double sum=a*b;
   System.out.println("Sum Result:"+sum);
 //  return sum;
}



public void subtract(double a,double b){
   double sum=a-b;
   System.out.println("Sum Result:"+sum);
 //  return sum;
 
}

public int doCalc( int iVal){
	System.out.println("doCalc value :"+(100/iVal));
	return (100/iVal);
}

public void save(){
	try{
		FileOutputStream fout = new FileOutputStream("I:\\emp.dat");
		}
	catch(FileNotFoundException fe){
	System.out.println("------------------Error----------------");
	fe.printStackTrace();
	}
	
}
public void display(){
	
	System.out.println("The value is :"+i);//yes we can call bcoz the interface values are public static final by default while methods are public and abstract.
}


}