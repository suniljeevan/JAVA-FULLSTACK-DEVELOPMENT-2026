import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setContentType("text/html");	
         PrintWriter pw=response.getWriter();     
	     String n=request.getParameter("uname");
	     String p=request.getParameter("password");
	     if(p.equals("xyz"))
	    	 request.getRequestDispatcher("/welcome").forward(request, response);
	     else
	    	 request.getRequestDispatcher("/error").forward(request, response);
	}

}




