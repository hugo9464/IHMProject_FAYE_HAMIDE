<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<c:forEach items="${adresses}" var="adresses">
			<p>Adresses :</p>
			<p>numero: ${adresses.numero}</p>
			<p>rue: ${adresses.rue}</p>
			<p>code postal: ${adresses.codepostal }</p>
			<p>ville: ${adresses.ville }</p>
</c:forEach>
</body>
</html>