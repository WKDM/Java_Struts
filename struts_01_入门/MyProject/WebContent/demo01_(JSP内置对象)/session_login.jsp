<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户登录界面</title>
</head>
<body>
	<%
		String name="";
		//判断是否为新的session
		if(!session.isNew()){
			//获取session中的username的属性值
			name=(String)session.getAttribute("username");			
			if(name==null){
				name="";
			}
		}
	%>
	<p>欢迎光临！</p>
	<!-- 获取session标识 -->
	<p>Session ID:<%=session.getId()%></p>
	<form action="session_check.jsp" mothed="post">
		<p>用户名：<input type="text" name="username" value=<%=name%>></p>
		<input type="submit" value="提交" />
	</form>
</body>
</html>