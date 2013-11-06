<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<title>Adresses</title>


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

a{
	color: white;
	text-decoration: none;
}

a:hover {
	color: #7f9dca;
}

.modifier {
	margin-right: 30px;
}

.modifier, .supprimer {
	color: white;
	text-decoration: none;
}

.modifier:hover, .supprimer:hover {
	color: #7f9dca;
}

.infos {
	font-weight: bold;
}

.contact {
	text-align: right;
	margin-right: 150px;
}

.nouvelle_adresse {
	margin-right: 30px;
	margin-left: 150px;
}

.modifier {
	margin-right: 30px;
	margin-left: 150px;
	
}

.adresse {
	text-align: right;
	margin-right: 150px;
}
.infos {
	font-weight: bold;
}

</style>

</head>
<body>

<h1>Adresses du contact</h1>

<c:forEach items="${adresses}" var="adresses">
			<p class="adresse">
			<a class="infos">${adresses.numero} ${adresses.rue} ${adresses.codepostal} ${adresses.ville }</a>
			
			<a class="modifier" href="modifadr?name=${adresses.rue}">Modifier l'adresse</a>
			<a class="supprimer" href="deleteadr?name=${adresses.rue}">Supprimer l'adresse</a>
			</p>

</c:forEach>

<a href="welcome">Accueil</a>

</body>
</html>