<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<body>
<title>::. DACA .::</title>
<head>
	<meta http-equiv="Content-Type" content="text/html;">
	<link href="rtm.css" rel="stylesheet" type="text/css">
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">

	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" background="#CC6633" class="opcao_menu_rapido">
		<tr><td><jsp:include page="index.jsp" flush="true"/></td></tr>
	</table>
	
	<br><br><br>

	<div class="titulo_secao">Removendo aluno do cadastro</div>
	
	<form name="form" method="post" action="removerAluno">
		<table border="0" align="center" cellpadding="0" cellspacing="0">
			<tr><td>
			<table class="form" border="0" align="center" cellspacing="2" cellpadding="2">
				<tr>
					<td>Nome do Aluno:</td>
	            	<td><input class="input_text" type="text" name="nome" size="30" value="" title="Digite o nome do aluno a ser removido."></td>
	            </tr>
	            <tr align="center">
			  		<td>
			  			<input class="input_button" name="ok" type="submit" id="ok" value="OK">
			  			<a href="removeAluno.jsp"><input class="input_button" name="cancel" type="submit" id="cancel" value="Limpa"></a>			  			
			  		</td>
			  	</tr>
			</table>
			</td></tr>
		</table>
	</form>
	
</body>
</html>