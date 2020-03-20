package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException{
		//得到客户端保存的Cookie数据
		Cookie[] cookies = request.getCookies();
		String username = "";
		String checked ="";
		for(int i=0;cookies!=null&&i<cookies.length;i++){
			if("username".equals(cookies[i].getName())){
				username = cookies[i].getValue();
				checked = "checked='checked'";
			}
		}
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.write("<form action='"+request.getContextPath()+"/test/dologin' method='post'>");
		out.write("用户名:<input type='text' name='username' value='"+username+"'/><br>");
		out.write("密码:<input type='password' name='password'/><br>");
		out.write("记住用户名<input type='checkbox' name='remember' "+checked+"/><br>");
		out.write("<input type='submit'value='登陆'/>");
		out.write("</form>");
		
	}
}
