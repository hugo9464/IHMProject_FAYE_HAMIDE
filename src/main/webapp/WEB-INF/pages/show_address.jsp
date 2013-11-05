<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
<c:forEach items="${adresses}" var="adresses">
			<p>Adresses :</p>
			<p> ${adresses.rue}</p>
</c:forEach>
</body>
</html>