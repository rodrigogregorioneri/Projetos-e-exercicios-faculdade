<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <html>
<body bgcolor="#FFFFFF">

<jsp:useBean id="colecao" class="teste.ColecaoDeNomes"/> 
<table border="0" align="center" cellpadding="2" cellspacing="2">
		<tr>
				    <td bgcolor="#e0e0e0">Id</td>
					<td bgcolor="#e0e0e0">Nome</td>
        </tr>
        <c:forEach var="nome" items="${colecao.nomes}" varStatus="status"> 			
	        <tr>
	           <td bgcolor="#f0f0f0">
					<c:choose>
						    <c:when test="${status.first}">Primeiro</c:when>	    			
						    <c:when test="${status.last}">Último</c:when>			    	
						    <c:otherwise>Número ${status.count}</c:otherwise>
					</c:choose>
	           </td>			  
	           <td bgcolor="#f0f0f0">${nome}</td>			
	        </tr>		
        </c:forEach >
</table>
</body> </html>
