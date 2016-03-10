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
		msg = "Falta apenas " + mes + " mês para o seu aniversário.";
	}
	
	if (mes == -1){
		msg = "Seu aniversário foi no mês passado";
	}
	
	if (mes > 1){
		msg = "Faltam apenas " + mes + " mêses para o seu aniversário.";
	}
	
	if (mes == 0){
		msg = "Oba... estamos no mês do seu aniversário.";
	} else if (mes < -1){
		mes *= -1;
		msg = "Seu aniversário foi a " + mes + " mêses atrás.";
	}
%>
<html>
	<body>
		<center>
			<h3><%=msg%></h3><br><br><br>
		</center>
	</body>
</html>