package com.yash.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.domain.Employee;
import com.yash.service.EmployeeService;
import com.yash.service.EmployeeServiceIntf;



/**
 * Servlet implementation class EmployeeServlet
 */
@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		String action=request.getParameter("action");
		String employeeid=request.getParameter("id");
		System.out.println(employeeid);
		EmployeeServiceIntf employeeservice=new EmployeeService();
		System.out.println("---out---"+action);
		
		if(action.equals("submit"))
		{
		
			if(employeeid.isEmpty()){
				System.out.println("---in null ---");
				
				List<Employee> list=employeeservice.getAllDetails();
				request.setAttribute("employee", list);
				request.getRequestDispatcher("/EmployeeView.jsp").forward(request, response);
			}else{
				int Employeeid=Integer.parseInt(employeeid);
				System.out.println("---in ---");
			List<Employee> list=employeeservice.getEmployeedetails(Employeeid);
			request.setAttribute("employee", list);
			request.getRequestDispatcher("/EmployeeView.jsp").forward(request, response);
			}
			
			}
			
			
			
		if(action.equals("registration")){
			System.out.println("inside registration");
			String name=request.getParameter("name");
			String salary=request.getParameter("salary");
			int Employeesalary=Integer.parseInt(salary);
			Employee employee=new Employee();
			employee.setEmployeeName(name);
			
			employee.setSalary(Employeesalary);
			employeeservice.addEmployee(employee);
			List<Employee> list=employeeservice.getAllDetails();
			request.setAttribute("employee", list);
			request.getRequestDispatcher("/EmployeeView.jsp").forward(request, response);
			
		
		}
		if(action.equals("delete")){
			System.out.println("inside delete");
			int Employeeid=Integer.parseInt(employeeid);
			employeeservice.deleteEmployee(Employeeid);
			List<Employee> list=employeeservice.getAllDetails();
			request.setAttribute("employee", list);
			request.getRequestDispatcher("/EmployeeView.jsp").forward(request, response);

			
		}
		if(action.equals("update")){
			System.out.println("inside update");
			String ids=request.getParameter("actions");
			int Employeeids=Integer.parseInt(ids);
			String name=request.getParameter("name");
			String salary=request.getParameter("salary");
			int Employeesalary=Integer.parseInt(salary);
			Employee employee=new Employee();
			employee.setEmployeeName(name);
			employee.setId(Employeeids);
			employee.setSalary(Employeesalary);
			employeeservice.updateEmployee(employee);
			List<Employee> list=employeeservice.getAllDetails();
			request.setAttribute("employee", list);
			request.getRequestDispatcher("/EmployeeView.jsp").forward(request, response);

		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
