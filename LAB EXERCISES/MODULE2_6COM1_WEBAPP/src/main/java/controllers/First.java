package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class First
 */
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		  PrintWriter p=response.getWriter();
		p.println("<html>");
		p.println("<body bgcolor="+"yellow"+"/>");
		p.println("	<p style=color:red;/>");
		p.println("Hello");
		p.println("<p style=color:green;/p>");
		p.println("	 World");
		p.println("</body>");
		p.println("</html>");
	}

}
