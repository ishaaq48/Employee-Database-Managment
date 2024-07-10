

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FetchEmployeeDetailsController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		//call JDBC createConnection method
		JdbcConnection.createConnection();
		
		//call JDBC selectValues method
		try {
			ResultSet rs = JdbcConnection.selectValues();
			while (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				double salary = rs.getDouble(3);
				out.println(id + "  "+name+"   "+salary+"<br>");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
