<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html><body>

 <h1>Exemplo2.jsp</h1>
<h2>Tag  c:if verifica o valor do atributo passago via GET se for vazio carrega uma página de erro com a tag jsp:forward </h2>
  
   <c:if test="${empty param.nomePessoa}" >
           <jsp:forward page="Exemplo1.jsp" />
    </c:if>

</body></html>
