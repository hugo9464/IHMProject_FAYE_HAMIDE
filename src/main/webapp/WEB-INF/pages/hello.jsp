<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
</head>
<body>

	<h1>Contacts</h1>

	<c:forEach items="${contacts}" var="contacts">
		
		<p class="contact">
			<a href="show_address?name=${contacts.nom}">${contacts.nom} ${contacts.prenom}</a> 
		    <a href="adresse?name=${contacts.nom}">Ajouter une nouvelle adresse</a>
			<a href="modif?name=${contacts.nom}">Modifier le contact</a>
			<a href="delete?name=${contacts.nom}">Supprimer le contact</a>
		</p>
	</c:forEach>
	<p><a href="contact">Ajouter un nouveau contact</a></p>
</body>
</html>