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
	<s:bean name="com.model.User" var="usr">
		<s:param name="name" value="tom"></s:param>
		<s:param name="age" value="20"></s:param>
		<s:if test="#usr.age>10">
			<s:property value="#usr.name" />
		</s:if>
	</s:bean>
</body>
</html>