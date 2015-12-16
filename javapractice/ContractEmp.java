package org.assignment1;

class ContractEmp extends Employee{

		private ContractEmp(int empId){
		System.out.println("Inside ContractEmp Constuctor:private");
		
	}
	
	protected ContractEmp(String empName){
		
		System.out.println("ContractEmp class :protected"+empName);
		}
}