<%@ page import="java.util.Date" %>
<%@ page import="java.lang.String" %>
<%
	String msg = "";
	String mesString = request.getParameter("mesNasceu");
	int mes = Integer.parseInt(mesString);
	
	Date dateNow = new Date();
	int montNow = dateNow.getMonth() + 1;
	
	mes -= montNow;
	
	if (mes == 1){
		msg = "Falta apenas " + mes + " m�s para o seu anivers�rio.";
	}
	
	if (mes == -1){
		msg = "Seu anivers�rio foi no m�s passado";
	}
	
	if (mes > 1){
		msg = "Faltam apenas " + mes + " m�ses para o seu anivers�rio.";
	}
	
	if (mes == 0){
		msg = "Oba... estamos no m�s do seu anivers�rio.";
	} else if (mes < -1){
		mes *= -1;
		msg = "Seu anivers�rio foi a " + mes + " m�ses atr�s.";
	}
%>
<html>
	<body>
		<center>
			<h3><%=msg%></h3><br><br><br>
		</center>
	</body>
</html>