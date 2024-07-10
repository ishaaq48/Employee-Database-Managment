import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteEmployeeDetailsController")
public class DeleteEmployeeDetailsController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		//parse String object to int datatype
		int empId = Integer.parseInt(id);
		
		//call JDBC createConnection method
		JdbcConnection.createConnection();
				
		//call JDBC deleteRows method
		JdbcConnection.deleteRows(empId);
	}
}