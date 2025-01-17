

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EmployeeDetailsController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String eid = request.getParameter("id");
		String ename = request.getParameter("name");
		String esalary = request.getParameter("salary");
		System.out.println(eid + "     "+ename + "   "+esalary);
		
		//parse String object to int datatype
		int id = Integer.parseInt(eid);
				
		//parse String object to double datatype
		double salary = Double.parseDouble(esalary);
		
		
		//call JDBC createConnection method
		JdbcConnection.createConnection();
		
		//call JDBC save method
		JdbcConnection.save(id, ename, salary);
	}
}