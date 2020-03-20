package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet{
	private static final long servialVersionUID = 1L;
	public UserServlet(){
		super();
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		request.setCharacterEncoding("UTF-8");
		String username = request.getParameter("username");
		
		out.print("<html>");
		out.print("<body>");
		out.print("ÓÃ»§Ãû£º"+username+"<br>");
		out.print("<body>");
		out.print("</html>");
		out.close();
	}
}
