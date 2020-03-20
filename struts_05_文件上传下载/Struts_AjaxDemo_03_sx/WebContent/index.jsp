<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<sx:tree label="all">
   			<!-- 每一个sx:treeNode生成一个节点 -->
    		<sx:treenode label="a" />
    		<sx:treenode label="b" />
    		<sx:treenode label="c" />
    		<sx:treenode label="d" />
		</sx:tree>
	</center>
</body>
</html>