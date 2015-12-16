package org.assignment1;

public class Test1{
	public static void main(String args[]){
		Customer c= new Customer();
		c.print();
		System.out.println("========Customer========"+Customer.custCount);
		Customer.Address addr=c.new Address();
			addr.print();
		Customer.Contact con = c.new Contact();
			con.print();
		Customer c1=new Customer();
		System.out.println("Custcount"+c1.custCount);
		Customer c2=new Customer();
		System.out.println("Custcount"+c2.custCount);
		Customer.CustCount custm = c.new CustCount();
			custm.display();
		System.out.println("Maxphone:"+c.MAXPHONE);
				System.out.println("Maxphone:"+Customer.MAXPHONE);

	/*	Employee e1=new Employee();
		e1.setEmpID(11021);
		System.out.println("EmployeeID::"+e1.getEmpId());
		System.out.println("Employee Count::"+Employee.increment());
		System.out.println("Employee Count::"+e1.increment());
		e1.details_print(1,"abc","xyz");*/
		Employee e2=new Employee(101,"Mayank");
		//Employee e3=new Employee(101);
		Employee e4=new Employee("Mayank");
		//Employee e1=new Employee();
		//Employee.ContractEmp ce=e4.new ContractEmp("mayank");
		//ce.print();
		
		//ContractEmp cemp=new ContractEmp(1);
		ContractEmp cemp1=new ContractEmp("Mayank");

		Contractor cont=new Contractor();
		Contractor cont1=new Contractor();
		 
		/*int i=10,j=1000;
		
		Integer cont2 = i;
		Integer cont3 = j;
		cont.equalsMethod(cont2,cont3);*/
		cont.display();
		String s1=new String("Emp");
		String s2=new String("Emp");

		cont.equals(cont,cont);
		cont.equals(cont1,cont);
		cont.equals(s1,s2);				//equal values
		System.out.println("Discount rate:"+c.discount(100));
		
		GoldCustomer gc=new GoldCustomer();
		System.out.println("Discount rate:"+gc.discount(100));
		
		SilverCustomer sc=new SilverCustomer();
		System.out.println("Discount rate:"+sc.discount(100));  //yes program works
		
		Customer cust=gc;
		System.out.println("Discount rate:"+cust.discount(100));

		Customer cust1=sc;
		System.out.println("Discount rate:"+cust1.discount(100)); // yes it is possible
		
		sc.discount(100);
		System.out.println("Discount rate:"+sc.discount(100)); 
		
		sc.discount("100");

	}
}