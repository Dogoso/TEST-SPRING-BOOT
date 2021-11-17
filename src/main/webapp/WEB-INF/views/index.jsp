<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home</title>
</head>
<body>
	<h1>Home</h1>
	<%
		if(request.getAttribute("name") != null) {
	%>
		<p>Produto <strong>${name}</strong> cadastrado.</p>
		<p>Valor: <strong>${value}</strong></p>
	<%	
		}else {
	%>
		<p>Bem-vindo! Sinta-se livre para cadastrar novos produtos :)</p>
	<%	
		}
	%>
</body>
</html>