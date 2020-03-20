<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>表单页</title>
</head>
<body>
<!-- 使用form标签创建表单 -->
<form action="requestobject.jsp" mothed="post">
	<p>用户名：<input type="text" name="username" /></p>
	<p>年    龄：<input type="text" name="userage" /><p>
	<input type="submit" value="提交" />
</form>
</body>
</html>