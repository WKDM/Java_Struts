<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name=null;
		//获取request中的username的属性值
		name = request.getParameter("username");
		if(name!=null){
			//设置session的属性值
			session.setAttribute("username",name);
		}
	%>
	<a href="session_login.jsp">登陆</a>&nbsp;&nbsp;&nbsp;<!-- 链接到登陆页面 -->
	<a href="session_logout.jsp">注销</a>&nbsp;&nbsp;&nbsp;<!-- 链接到注销页面 -->
	<p>当前用户为：<%=name %></p>
	<p>邮箱中共有50封邮件</p>
</body>
</html>