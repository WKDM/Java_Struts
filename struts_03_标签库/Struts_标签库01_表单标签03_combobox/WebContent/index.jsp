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
			<s:combobox label="My Favirtes" name="fruit" 
				list="{'apple','banana','pear','grape'}"
				headerKey="-1" headerValue="----please choose fruits---"
				emptyOption ="true"
				value="banana"
				></s:combobox>
			<s:submit/>
		</s:form>
	</center>
</body>
</html>