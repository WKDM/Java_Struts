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
		//��ȡ������
		String username = request.getParameter("username");
		String pwd =request.getParameter("password");
		String rem = request.getParameter("remember");
		Cookie ck = new Cookie("username",username);
		//����ҵ���߼�
		//�ַ�ת��
		if("wk".equals(username)&&"123".equals(pwd)){
			if(rem!=null){
				ck.setPath("/");
				ck.setMaxAge(Integer.MAX_VALUE);
			}else{
				ck.setMaxAge(0);
			}
			response.addCookie(ck);
			out.write("��½�ɹ�");
		}else{
			out.write("��½ʧ��");
			//����2���Ӻ����µ�½
			response.setHeader("refresh","2;url="+request.getContextPath()+"/login");
		}
		
		
	}
}
