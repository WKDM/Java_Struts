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
			<!-- 创建表单元素 -->
			<s:optiontransferselect
			label="My Favourite Cartoons Characters"
			name="leftSides" 
			leftTitle="Left Title"
			list="{'Blue-Cat','AoTeMan','Popeye','He-Man'}"
			multiple="true"
			headerKey="headeerKey"
			headerValue="---Please Select---"
			emptyOption="true"
			doubleList="{'SuperMan','Mickey Mouse','Donald Duck'}"
			doubleName="rightSides"
			rightTitle="Right Title"
			doubleHeaderKey="doubleHeaderKey"
			doubleHeaderValue="--Please Select--"
			doubleMultiple="true"
			doubleEmptyOption="true"/>
			<s:submit />
		</s:form>
	</center>
</body>
</html>