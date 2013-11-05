<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

	<c:forEach items="${contacts}" var="contacts">
		
<!-- 		<p> -->
			<a href="show_address?name=${contacts.nom}">${contacts.nom} ${contacts.prenom}</a> 
<!-- 		</p> -->
		    <a href="adresse?name=${contacts.nom}">Ajouter une nouvelle adresse</a>


	</c:forEach>
	<p><a href="contact">Ajouter un nouveau contact</a></p>
</body>
</html>