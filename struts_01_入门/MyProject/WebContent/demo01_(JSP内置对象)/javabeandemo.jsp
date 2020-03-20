<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 指定javabean实例，其相应的生存范围及权限限定类名 -->
	<jsp:useBean id="userbean" scope="page" class="javabean.User"/>
	<!-- 使用jsp:setProperty动作指令设置username属性值 -->
	<jsp:setProperty name="userbean" property="username" param="username"/>
	<!-- 使用jsp:setProperty动作指令设置password属性值 -->
	<jsp:setProperty name="userbean" property="password" param="password"/>
	
	
	用户名：
	<!-- 使用jsp:getProperty动作指令设置username属性值 -->
	<jsp:getProperty name="userbean" property="username"/><br>
	密&nbsp;&nbsp;码：
	<!-- 使用jsp:setProperty动作指令设置password属性值 -->
	<jsp:getProperty name="userbean" property="password"/><br>
	
	
	
	
	<!-- 使用out.println来显示username和password -->
	<%
		out.println("用户名："+userbean.getUsername()+"<br>");
		out.println("密码："+userbean.getPassword()+"<br>");
	%>
</body>
</html>