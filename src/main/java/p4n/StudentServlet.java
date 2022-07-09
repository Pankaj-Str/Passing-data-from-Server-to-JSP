package p4n;

import java.io.*;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {

protected void processRequest(HttpServletRequest request,
								HttpServletResponse response)
	throws ServletException, IOException
	{
	response.setContentType("text/html;charset=UTF-8");
	try (PrintWriter out = response.getWriter()) {
	out.println("<!DOCTYPE html>");
	out.println("<html>");
	out.println("<head>");
	out.println("<title>Servlet StudentServlet</title>");
	out.println("</head>");
	out.println("<body>");

	// List to hold Student objects
	ArrayList<Student> std = new ArrayList<Student>();

	// Adding members to the list. Here we are
	// using the parameterized constructor of
	// class "Student.java"
	std.add(new Student("Joy jain", 22, "B.D.S"));
	std.add(new Student("Trupti", 22, "B.Tech"));
	std.add(new Student("Shilpa", 21, "B.B.A"));
	std.add(new Student("Rohan", 22, "B.Tech"));
	std.add(new Student("Helena Carlow", 24, "M.B.B.S"));

	// Setting the attribute of the request object
	// which will be later fetched by a JSP page
		request.setAttribute("data", std);

	// Creating a RequestDispatcher object to dispatch
	// the request the request to another resource
		RequestDispatcher rd =
			request.getRequestDispatcher("Index.jsp");

	// The request will be forwarded to the resource
	// specified, here the resource is a JSP named,
	// "stdlist.jsp"
		rd.forward(request, response);
			out.println("</body>");
			out.println("</html>");
		}
	}
	/** Following methods are used to handle
		requests coming from the Http protocol request.
		Inspects method of HttpMethod type
		and if the request is a POST, the doPost()
		method will be called or if it is a GET,
		the doGet() method will be called.
	**/
	@Override
	protected void doGet(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException, IOException
	{
		processRequest(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request,
						HttpServletResponse response)
		throws ServletException, IOException
	{
		processRequest(request, response);
	}
	@Override
	public String getServletInfo()
	{
		return "Short description";
	}
}

