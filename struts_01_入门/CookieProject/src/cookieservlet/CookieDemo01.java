package cookieservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo01 extends HttpServlet{	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
//		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write("Hello");
		out.close();
	}
//	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
//		
//	}
}
