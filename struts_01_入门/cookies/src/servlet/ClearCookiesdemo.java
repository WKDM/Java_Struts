package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClearCookiesdemo extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		Cookie ck =new Cookie("lastAccessTime","");
		
		ck.setPath("/");//要设置被删除Cookie的path
		ck.setMaxAge(0);//相当于删除Cookie，否则可能会删错
		response.addCookie(ck);//将Cookie写会客户端缓存
	}
}
