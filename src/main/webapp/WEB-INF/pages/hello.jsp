<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Home</title>


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
}
</style>
</head>
<body>

	<h1>Contacts</h1>

	<c:forEach items="${contacts}" var="contacts">

		<p class="contact">
			<a class="infos" href="show_address?name=${contacts.nom}">${contacts.nom} ${contacts.prenom}</a> 
			<a class="nouvelle_adresse" href="adresse?name=${contacts.nom}">Nouvelle adresse</a> 
			<a class="modifier" href="modif?name=${contacts.nom}">Modifier</a> 
			<a class="supprimer" href="delete?name=${contacts.nom}">Supprimer</a>
		</p>
	</c:forEach>
	<p>
		<a href="contact">Ajouter un nouveau contact</a>
	</p>
</body>
</html>