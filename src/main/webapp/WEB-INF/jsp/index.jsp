<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>客户管理页面</title>
</head>
<body>
	
		<table border="1px" align="center" width="700px">
			<tr align="center">
				<td>客户ID</td>
				<td>客户姓名</td>
				<td>客户年龄</td>
			</tr>
			<c:forEach items="${list}" var="c">
				<tr align="center">
					<td>${c.id}</td>
	                <td>${c.name}</td>
	                <td>${c.age}</td>
		       
				</tr>
			</c:forEach>
		</table>
</body>
</html>
