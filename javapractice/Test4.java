package org.interfacepractice;


class Test4{
	
	
	public static void main(String args[]){
	CalculatorService cs=new CalculatorService();
	
	cs.sum(1,1);
	cs.multiply(2,3);
	cs.display();
	Calculator cal=new CalculatorService();
	cal.sum(2,3);//yes, it works
	try{
	cs.doCalc(0);//exception generated
	//String str = args[2];//if no command argument is given then array index outofbound exception --also if doCalc(0) then it directly go to catch of Arithmetic exception
	}
	catch(ArithmeticException ae){

		System.out.println(ae);
	}
	catch(Exception e){
		System.out.println(e);
	}
	
	finally{
		System.out.println("Final block is called");

	}
	
	cs.save();
	
	}
}