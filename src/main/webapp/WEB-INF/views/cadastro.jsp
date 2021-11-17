<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cadastro de Produtos</title>
</head>
<body>
	<h1>Novo produto: </h1>
	<p style="color: red">${msg}</p>
	<form method="POST" action="/cadastro">
		<label>
			Nome:
			<input type="text" name="name">
		</label>
		<label>
			Preço:
			<input type="text" name="value">
		</label>
		<label>
			<input type="submit" name="btnSub" value="Cadastrar">
		</label>
	</form>
</body>
</html>