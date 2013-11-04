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
	<p>nom: ${contact.nom}</p>
	<p>prenom: ${contact.prenom}</p>
	<a href="welcome">Accueil</a>
	<a href="contact">Ajouter un nouveau contact</a>

</body>
</html>