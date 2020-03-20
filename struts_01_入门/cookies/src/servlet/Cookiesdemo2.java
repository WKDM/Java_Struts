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
		Cookie[] cookies = request.getCookies();//��ÿͻ�������cookie����
		for(int i=0;cookies!=null&&i<cookies.length;i++){
			if("lastAccessTime".equals(cookies[i].getName())){//�жϵ�ǰcookie�е�name
				long l = Long.parseLong(cookies[i].getValue());//�õ����Ǻ���ֵ
				out.write("����¼ʱ��Ϊ��"+new Date(l).toLocaleString());//ת����yyyy-MM-dd
			}
		}
		out.write("<a href='"+request.getContextPath()+"/servlet/clear'>clear</a>");
		//����Cookie
		Cookie ck = new Cookie("lastAccessTime",System.currentTimeMillis()+"");
		
		//����cookie��ʱ�䣬��λΪ��
		ck.setMaxAge(60*5);//��Чʱ��Ϊ5����
		//���÷���·��
//		ck.setPath("/cookies");
//		ck.setPath(request.getContextPath());
		ck.setPath("/");
		
		//��cookie��Ϣд�ص��ͻ���
		response.addCookie(ck);
	}
}
