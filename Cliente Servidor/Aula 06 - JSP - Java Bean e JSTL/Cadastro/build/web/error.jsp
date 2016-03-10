<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<title>P&aacute;gina de Erro</title>
		<link href="rtm.css" rel="stylesheet" type="text/css">		
	</head>
	
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
	
	<table width="100%" border="0" align="center" cellpadding="0" cellspacing="0" bordercolor="#FFFFFF" background="#CC6633" class="opcao_menu_rapido">
		<tr><td><jsp:include page="index.jsp" flush="true"/></td></tr>
	</table>
		
	<br><br><br>
	
	<center><div class="titulo_erro">Aten&ccedil;&atilde;o!</div></center>
	<p><center class="form">${mensagem}</center></p>
	<font color="#FFFFFF" size="5" face="Verdana, Arial, Helvetica, sans-serif">
		<center><a href="Javascript:history.back()">Voltar</a></center>
	</font>

</body>
</html>
