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
		
		ck.setPath("/");//Ҫ���ñ�ɾ��Cookie��path
		ck.setMaxAge(0);//�൱��ɾ��Cookie��������ܻ�ɾ��
		response.addCookie(ck);//��Cookieд��ͻ��˻���
	}
}
