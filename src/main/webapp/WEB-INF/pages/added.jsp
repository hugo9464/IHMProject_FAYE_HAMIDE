<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Getting Started: Handing Form Submission</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
	<h1>Result</h1>
	<p>alias: ${adresse.alias}</p>
	<p>numero: ${adresse.numero}</p>
	<p>rue: ${adresse.rue}</p>
	<p>code postal: ${adresse.codepostal }</p>
	<p>ville: ${adresse.ville }</p>
	<a href="welcome">Accueil</a>
	<a href="adresse">Ajouter une nouvelle adresse</a>

</body>
</html>