<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html> <body> 
<h1>Exemplo1.jsp</h1>
<h2>Tag  c:out mostra o resultado de 1+2+3 </h2>
<p> 
    <c:out value="${1 + 2 + 3}" />
</p>

<h2>Tag c:forEach mostra os numeros de um ate 30 </h2>
 <c:forEach begin="1" end="30" var="valor">
     <c:out  value="${valor}" /> <br>
 </c:forEach>   

<h2>Tag c:set esta definindo a variavel va com o valor passado por parametro</h2> 
<p>
	<c:set var="va" value="${10}" />
	Valor final: <c:out value="${va}" />
</p>
 </body> </html>
