package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Factorial extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		p.println("<center>");
		p.println("<form method="+"post"+" action="+"printfactorial"+">");
		p.println("Enter Number<input type="+"text"+" name="+"n"+">");
		p.println("<br><br>");
		p.println("<input type="+"submit"+" value="+"submit"+">");
		p.println("</form>");
		p.println("</center>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		int number=Integer.parseInt(request.getParameter("n").toString());
		long fact=1;
		for(int i=1;i<=number;i++)
			fact=fact*i;
		p.println("<h2>");
		p.println("Factorial is"+fact);
		p.println("</h2");
	}

}
