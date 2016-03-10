<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<table width="771" border="1" cellspacing="0" cellpadding="2">
  <tr>
    <td width="79" align="center" bgcolor="#6699FF"><strong>RGM</strong></td>
    <td width="254" align="center" bgcolor="#6699FF"><strong>NOME</strong></td>
    <td width="69" align="center" bgcolor="#6699FF"><strong>CURSO</strong></td>
    <td width="292" align="center" bgcolor="#6699FF"><strong>EMAIL</strong></td>
    <td width="14" align="center" bgcolor="#6699FF">&nbsp;</td>
  </tr>
<%
//Objetos
Connection con;
Statement stm;
ResultSet rs; //objeto que irá guardar o retorno da consulta
String sql;
String url = "jdbc:mysql://localhost/aula";
try
{
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection(url,"root","root");
	stm = con.createStatement();	

	sql = "SELECT * FROM alunos ORDER BY nome";
	rs = stm.executeQuery(sql);
	while (rs.next())
	{
	%>
          <tr>
            <td><a href="apagar.jsp?rgm=<%= rs.getString("rgm")%>"><%= rs.getString("rgm") %></a></td>
            <td><%= rs.getString("nome") %></td>
            <td><%= rs.getString("curso") %></td>
            <td><%= rs.getString("email") %></td>
          </tr>
    <%
	}	
}
catch(SQLException ex)
{
	out.print(ex.getMessage());
}
%>
</table>

</body>
</html>