package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.FacultyDAO;
import model.Faculty;


public class RemoveFaculty extends HttpServlet 
{

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		HttpSession session=request.getSession(false);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		try 
		{
			if(session!=null)
			{
				Faculty faculty=new Faculty();
				faculty.setName(request.getParameter("facultyName"));
				faculty.setUser_id(request.getParameter("user-id"));
				List<Faculty> facultyList = FacultyDAO.remove(faculty);
				request.setAttribute("facultyList", facultyList);
				//response.sendRedirect("display_faculty.jsp");
				RequestDispatcher rd=request.getRequestDispatcher("display_faculty.jsp");
				//rd.forward(request, response);
				rd.include(request,response);
				
				out.println("<html><body><font color='red' size='5'><center>");
				out.println("<b>Faculty removed successfully</b>");
				out.println("</center></font></body></html>");
				
			}
			else
			{
				out.println("<html><body><font color='red' size='5'><center>");
				out.println("<b>Error message : Please Login first !!</b>");
				out.println("</center></font></body></html>");
				RequestDispatcher rd=request.getRequestDispatcher("Admin_login.html");
				rd.include(request,response);
			}
		}
	 catch (Exception e)
		{
			e.printStackTrace();
		}	
	 out.close();
	    
	
	}
}