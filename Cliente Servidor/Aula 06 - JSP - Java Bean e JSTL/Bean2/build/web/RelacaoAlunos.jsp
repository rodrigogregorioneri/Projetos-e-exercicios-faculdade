<jsp:useBean id="al" class="beans.Alunos">
  <jsp:setProperty name="al" property="rgm" param="rgm" />
  <jsp:setProperty name="al" property="nome" param="nome" />
</jsp:useBean>

<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Collection"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="beans.Alunos"%>

<%
ArrayList relacao = (ArrayList) request.getAttribute("relacao");
%>

<html>
<head>
<title>Tecnologia em Análise de Desenvolvimento de Sistemas</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"></head>
<body bgcolor="#FFFFCC">
<p align="center"><font color='#CC3300 ' size='4'><font color="#000066" size="6">Universidade Cruzeiro do Sul</font><br>
      <font color="#000033">Tecnologia em Análise de Desenvolvimento de Sistemas</font></font><font color='#000066' size='5'><B></font></p>
<p align="center"><font color='#FF0000' size='3'><strong>RELA&Ccedil;&Atilde;O DOS ALUNOS </strong></font></p>
<form method='post' name='frmaluno' action='Cadastro.html'>
  <p align="center"><span>UTILIZANDO BEANS</span></p>
  <br>
  <table border="1" width="100%">
  		<tr>
  			<td width="10%" bgcolor="#FFCC00"><font size="5"><strong>Código</strong></font></td>
  			<td bgcolor="#FFCC00"><font size="5"><strong>Nome</strong></font></td>
  		</tr>
		<%
		for (int i = 0; i < relacao.size(); i++) { %>
			<%
			Alunos alunos = (Alunos) relacao.get(i);
			%>	
			
			<jsp:setProperty name="al" property="rgm" value="<%=alunos.getRgm()%>"/>
	 		<jsp:setProperty name="al" property="nome" value="<%=alunos.getNome()%>"/>
	 		
			<tr>
	          <td><jsp:getProperty name="al" property="rgm" /></td>
    		  <td><jsp:getProperty name="al" property="nome" /></td>
	        </tr>
		<%
		}
		%>
  </table>
  <br>
	<input name='btn_voltar' type='submit' value='Voltar'>
</form>
</body>
</head>
</html>