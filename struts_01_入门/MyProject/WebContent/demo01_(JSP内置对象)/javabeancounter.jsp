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
	<jsp:useBean id="countbean" scope="application" class="javabean.counter" />
	<!-- 使用jsp:getProperty动作指令获得count属性值 -->
	the number of requests is ：
	<jsp:getProperty property="count" name="countbean"/><br>
</body>
</html>