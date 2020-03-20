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
		<s:form action="user">
			<s:doubleselect label="please choose province" name="province" list="{'四川','宁夏'}" doubleName="city" doubleList="top=='四川'?{'成都','绵阳'}:{'银川','中卫'}"></s:doubleselect>
			<s:submit/>
		</s:form>
	</center>
</body>
</html>