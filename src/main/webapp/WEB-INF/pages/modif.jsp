<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<html>
<head>

<title>Modifier contact</title>

<style type="text/css">

body {
        background: #415370;
}

h1 {
        font-family: Helvetica;
        text-align: center;
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

tr
{
        color: white;
}


        
        </style>

</head>
<body>

<h1>Modifier le contact</h1>
<sf:form method="POST" modelAttribute="contact">
                <fieldset>
                        <table>
                        
                                <tr>
                                        <td>Nom :</td>
                                        <td><sf:input value="${contact.nom}" path="nom" /></td>
                                </tr>
                                <tr>
                                        <td>Pr�nom :</td>
                                        <td><sf:input value="${contact.prenom}" path="prenom" /></td>
                                </tr>
                                
                                <tr>
                                        <td colspan="2"><input type="submit"
                                                value="Modifier l'adresse !" /></td>
                                </tr>
                        </table>
                </fieldset>
        </sf:form>
        </body>
        </html>