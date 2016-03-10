<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<jsp:useBean id="bean" scope="session" class= "br.com.Modelo.Autores"/>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>:: LISTAR AUTORES ::</title>
</head>

<body>
<p>

</p>
<table width="925" border="0" cellspacing="0" cellpadding="5">
  <tr>
    <td width="28" height="16" bgcolor="#000000"><div align="center"><font color="#FFFFFF"><b><font size="2" face="Verdana, Arial, Helvetica, sans-serif">ID</font></b></font></div></td>
    <td width="101" bgcolor="#000000"><div align="center"><font color="#FFFFFF"><b><font size="2" face="Verdana, Arial, Helvetica, sans-serif">PRIMEIRO NOME</font></b></font></div></td>
    <td width="79" bgcolor="#000000"><div align="center"><font color="#FFFFFF"><b><font size="2" face="Verdana, Arial, Helvetica, sans-serif">SEGUNDO NOME</font></b></font></div></td>
  </tr>
  <%
	ResultSet res = bean.consultar("SELECT * FROM autores");	
	while (res.next())
	{
  %>
          <tr>
            <td><div align="center"><font size="1" face="Verdana, Arial, Helvetica, sans-serif"><%= res.getString("id") %></font></div></td>
            <td><div align="center"><font size="1" face="Verdana, Arial, Helvetica, sans-serif"><%= res.getString("primeiroNome") %></font></div></td>
            <td><div align="center"><font size="1" face="Verdana, Arial, Helvetica, sans-serif"><%= res.getString("primeiroNome") %></font></div></td>
          </tr>
        <%
	}
        %>
</table>
<p><a href="index.jsp">Menu</a></p>
</body>
</html>
