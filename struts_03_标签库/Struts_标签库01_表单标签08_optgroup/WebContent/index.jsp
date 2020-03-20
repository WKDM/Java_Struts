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
			<s:select
			label="我的选择" 
			name="myselection" value="%{'POPEYE'}"
			list="%{#{'SUPERMAN':'superman','SPIDERMAN':'spiderman'}}"
			>
				<s:optgroup label="Adult" 
				list="%{#{'SOUTH_PARK':'South_park'}}"/>
				<s:optgroup label="Japanese" 
				list="%{#{'POKEMON':'Pokemon','DIGIMON':'digimon'}}"/>
			</s:select>
			<s:submit />
		</s:form>
	</center>
</body>
</html>