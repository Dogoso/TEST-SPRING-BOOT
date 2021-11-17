<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Listagem de Produtos</title>
</head>
<body>
	<h1 style="text-align: center">Lista de Produtos</h1>
	<table style="width: 100%">
		<tr style="background-color: green; color: white">
			<th>ID</th>
			<th>NAME</th>
			<th>DESCRIPTION</th>
			<th>MARK</th>
			<th>VALUE</th>
		</tr>
		<c:forEach var="product" items="${product_list}">
			<tr style="background-color: #E0E0E0">
				<td>${product.getId()}</td>
				<td>${product.getName()}</td>
				<td>${product.getDesc()}</td>
				<td>${product.getMark()}</td>
				<td>${product.getValue()}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>