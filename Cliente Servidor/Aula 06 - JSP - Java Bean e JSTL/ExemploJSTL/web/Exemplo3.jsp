<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body bgcolor="#FFFFFF">

<jsp:useBean id="colecao" class="teste.ColecaoDeNomes"/>

<c:forEach var="nome" items="${colecao.nomes}">
   <br>${nome}
</c:forEach >

</body>
</html>
