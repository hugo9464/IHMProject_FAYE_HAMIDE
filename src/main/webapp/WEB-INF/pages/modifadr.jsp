<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Modifier adresse</title>


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
<h1>Modifier l'adresse</h1>
<sf:form method="POST" modelAttribute="adresse">
                <fieldset>
                        <table>
                        
                        <tr>
                                <td>Numéro :</td>
                                        <td><sf:input value="${adresse.numero}" path="numero" /></td>
                                </tr>
                                <tr>
                                        <td>Rué :</td>
                                        <td><sf:input value="${adresse.rue}" path="rue" /></td>
                                </tr>
                                                                <tr>
                                        <td>Code postal :</td>
                                        <td><sf:input value="${adresse.codepostal}" path="codepostal" /><br/>
                                                
                                        </td>
                                </tr>
                                                                <tr>
                                        <td>Ville :</td>
                                        <td><sf:input value="${adresse.ville}"  path="ville" /></td>
                                </tr>
                                
                                <tr>
                                        <td colspan="2"><input type="submit"
                                                value="Ajouter ce contact" /></td>
                                </tr>
                        </table>
                </fieldset>
        </sf:form>
        </body>
        </html>