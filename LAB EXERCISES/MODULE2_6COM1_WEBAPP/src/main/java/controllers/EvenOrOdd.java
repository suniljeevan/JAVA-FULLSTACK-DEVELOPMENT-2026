package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class EvenOrOdd extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
	p.println("<center>");
	p.println("<form method="+"post"+" action="+"check"+">");
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
		if(number%2==0)
			p.println("<h2> Number is Even</h2>");
		else
			p.println("<h2> Number is Odd</h2>");
	}

}




