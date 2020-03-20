package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cookiesdemo2 extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Cookie[] cookies = request.getCookies();//获得客户端所有cookie对象
		for(int i=0;cookies!=null&&i<cookies.length;i++){
			if("lastAccessTime".equals(cookies[i].getName())){//判断当前cookie中的name
				long l = Long.parseLong(cookies[i].getValue());//得到的是毫秒值
				out.write("最后登录时间为："+new Date(l).toLocaleString());//转化成yyyy-MM-dd
			}
		}
		out.write("<a href='"+request.getContextPath()+"/servlet/clear'>clear</a>");
		//创建Cookie
		Cookie ck = new Cookie("lastAccessTime",System.currentTimeMillis()+"");
		
		//设置cookie的时间，单位为秒
		ck.setMaxAge(60*5);//有效时间为5分钟
		//设置访问路径
//		ck.setPath("/cookies");
//		ck.setPath(request.getContextPath());
		ck.setPath("/");
		
		//把cookie信息写回到客户端
		response.addCookie(ck);
	}
}
