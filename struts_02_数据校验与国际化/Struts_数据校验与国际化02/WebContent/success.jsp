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
		<!-- 取出list中的元素，users[0]代表第一个元素，user[1]代表第二个元素 -->
		Name:<s:property value="users[first].name" />
		Age:<s:property value="users[first].age" />
		Tel:<s:property value="users[first].tel" /></br>
		Name:<s:property value="users[second].name" />
		Age:<s:property value="users[second].age" />
		Tel:<s:property value="users[second].tel" />
	</center>
</body>
</html>