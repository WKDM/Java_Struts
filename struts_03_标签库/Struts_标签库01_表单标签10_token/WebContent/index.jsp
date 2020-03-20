<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<!-- 创建表单 -->
		<s:form action="action">
			<s:textfield label="用户名" name="name"/>
			<s:password label="密码" name="password" />
			<s:token />
			<s:submit />
		</s:form>
	</center>
</body>
</html>