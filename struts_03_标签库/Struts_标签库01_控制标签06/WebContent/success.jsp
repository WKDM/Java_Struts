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
		<s:bean var="mycomparator" name="com.action.ListComparator"></s:bean>
		<s:sort comparator="#mycomparator" source="{'aaaaaaaa','ccc','aaaa','dddddd'}">
			<s:iterator>
				<s:property />
			</s:iterator>
		</s:sort>
</body>
</html>