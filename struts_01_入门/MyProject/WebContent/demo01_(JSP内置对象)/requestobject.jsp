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
		String username = request.getParameter("username");
		String userage = request.getParameter("userage");
		int age = Integer.parseInt(userage);
	%>
	用户名：<%=username %><br>
	年龄：<%=age %>
</body>
</html>