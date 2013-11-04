<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>

	<c:forEach items="${contacts}" var="contacts">
		
<!-- 		<p> -->
			<a href="show_address?id=${contacts.nom}">${contacts.nom} ${contacts.prenom}</a> 
<!-- 		</p> -->
		


	</c:forEach>
	<a href="adresse">Ajouter une nouvelle adresse</a>
	<a href="contact">Ajouter un nouveau contact</a>
</body>
</html>