<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<title>::. DACA .::</title>
<head>
	<meta http-equiv="Content-Type" content="text/html;">
	<link href="rtm.css" rel="stylesheet" type="text/css">
	</script>	
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">

	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" background="#CC6633" class="opcao_menu_rapido">
		<tr><td><jsp:include page="index.jsp" flush="true"/></td></tr>
	</table>
	
	<br><br><br>
	
	<c:if test="${(empty alunos)}">
		<div class="titulo_erro">Aten&ccedil;&atilde;o!</div>
		<p><center>Não há alunos cadastrados.</center> </p>
	</c:if>
	
	<c:if test="${(!empty alunos)}">
		<div class="titulo_secao">Alunos Cadastrados</div>
	
		<table border="0" align="center" width="500" cellspacing="2" cellpadding="2">
			<tr class="listagem_cabecalho">
				<td align="center" width="10">Posição</td>
				<td align="center" width="80">Nome do Aluno</td>
				<td align="center" width="40">Email</td>
				<td align="center" width="40">Data do Cadastro</td>
			</tr>
		
			<c:forEach var="aluno" items="${alunos}" varStatus="posicao">
				<tr class="listagem_linha">
	              <td width="10" align="center">${posicao.count}</td>
				  <td width="80">${aluno.nome}</td>
	              <td width="40" align="center">${aluno.email}</td>
	              <td width="40" align="center">${aluno.data}</td>
				</tr>
			</c:forEach>
		</table>
	</c:if>

</body>
</html>