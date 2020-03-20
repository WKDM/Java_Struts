package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class doLoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException{
		response.setContentType("text/html;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");	
		PrintWriter out = response.getWriter();
		//获取表单数据
		String username = request.getParameter("username");
		String pwd =request.getParameter("password");
		String rem = request.getParameter("remember");
		Cookie ck = new Cookie("username",username);
		//处理业务逻辑
		//分发转向
		if("wk".equals(username)&&"123".equals(pwd)){
			if(rem!=null){
				ck.setPath("/");
				ck.setMaxAge(Integer.MAX_VALUE);
			}else{
				ck.setMaxAge(0);
			}
			response.addCookie(ck);
			out.write("登陆成功");
		}else{
			out.write("登陆失败");
			//设置2秒钟后重新登陆
			response.setHeader("refresh","2;url="+request.getContextPath()+"/login");
		}
		
		
	}
}
