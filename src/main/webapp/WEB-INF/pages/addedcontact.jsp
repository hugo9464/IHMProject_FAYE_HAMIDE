<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
        pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns:th="http://www.thymeleaf.org">
<head>
<title>Contact ajouté</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<style type="text/css">

body {
        background: #415370;
}

h1 {
        font-family: Helvetica;
        color: white;
        font-weight: lighter;
}

a {
        color: white;
        text-decoration: none;
}

a:hover {
        color: #7f9dca;
}

p
{
        color: white;
}

.accueil {
        margin-right: 30px;
}


        
        </style>

</head>
<body>

<h1>Contact ajouté :</h1>
        <p>Nom: ${contact.nom}</p>
        <p>Prénom: ${contact.prenom}</p>
        <a class="accueil" href="welcome">Accueil</a>
        <a class="contact" href="contact">Ajouter un nouveau contact</a>

</body>
</html>