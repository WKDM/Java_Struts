package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Servlet实现类HelloSevlet
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
	
	//构造方法
	public HelloServlet(){
		super();
	}
	
	//重写HttpServelet的doGet方法
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		//获取输出流out
		PrintWriter out = response.getWriter();
		//在网页上输出
		out.println("Hello Servlet!");
		//关闭输出流
		out.close();
	}
}
