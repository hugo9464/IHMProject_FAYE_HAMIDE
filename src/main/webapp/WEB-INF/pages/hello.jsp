<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>

    <c:forEach items="${adresses}" var="adresses">
       <p> ${adresses.key}  --  ${adresses.value.numero} ${adresses.value.rue} ${adresses.value.codepostale} ${adresses.value.ville}</p>
    </c:forEach>
    <a href="adresse">Ajouter une nouvelle adresse</a>
    
</body>
</html>