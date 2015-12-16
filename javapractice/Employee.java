package org.assignment1;

public class Employee{
 int empID;
 int var=121;
static int empCount;
	Employee(){
		System.out.println("Inside Employee Constuctor:Default");
		
	}
	
	
	
	private Employee(int empID){
		System.out.println("Inside Employee Constuctor:private");
		
	}
	
	protected Employee(String empName){
		System.out.println("Inside Employee Constuctor:protected");
		
	}
	
	Employee(int empID,String empName){
				System.out.println("Inside Employee 2nd Constuctor:parameterized");

		
	}
	
	void setEmpID(int value){
	this.empID=value;
	}
	int getEmpId(){
		return empID;
	}
	static int increment(){
		empCount++;
		return empCount;
	}
	public static void details_print(int id,String... manyinputs){
		System.out.println("id:"+id);
		for(String manyinput:manyinputs){
			System.out.println(""+manyinput);
		}
		
	}
	
	/*class ContractEmp{
		private ContractEmp(int empID){
		System.out.println("Inside ContractEmp Constuctor:private");
		
	}
	
	protected ContractEmp(String empName){
		 print(){
		System.out.println("ContractEmp class :protected"+empName);
		}
		*/
	}
	
		
	}
	
}