<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<%
Connection con;
PreparedStatement pstm;
ResultSet rs; //objeto que irá guardar o retorno da consulta
String sql;
String url = "jdbc:mysql://localhost/aula";
try
{
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection(url,"root","root");
	sql = "SELECT * FROM alunos WHERE id = ? ";
	pstm = con.prepareStatement(sql);
	pstm.setInt(1,Integer.parseInt(request.getParameter("id")));
	rs = pstm.executeQuery();
	if (rs.next())
	{
%>
<form id="form1" name="form1" method="post" action="grava_alteracao.jsp">
  <p>RGM:
  <input name="rgm" type="text" id="rgm" size="10" maxlength="7" value="<%= rs.getString("rgm") %>"/>
    <input type="hidden" name="id" id="id" value="<%= rs.getString("id") %>"/>
    <br />
    Nome: 
    <input name="nome" type="text" id="nome" size="60" maxlength="80"  value="<%= rs.getString("nome") %>"/>
    <br />
    Curso: 
    <select name="curso" id="curso">
      <option value="CCP" <%= (rs.getString("curso").equals("CCP"))?"selected":"" %>>CCP</option>
      <option value="TADS" <%= (rs.getString("curso").equals("TADS"))?"selected":"" %>>TADS</option>
      <option value="TSI" <%= (rs.getString("curso").equals("TSI"))?"selected":"" %>>TSI</option>
      <option value="TRC" <%= (rs.getString("curso").equals("TRC"))?"selected":"" %>>TRC</option>
    </select>
    <br />
    E-mail: 
    <input name="email" type="text" id="email" size="60" maxlength="100"  value="<%= rs.getString("email") %>"/>
  </p>
  <p>
    <input type="submit" name="button" id="button" value="Enviar" />
    <br />
  </p>
</form>
<%
	}//fim do if
	else
	{
		out.print("Nenhum registro encontrado");	
	}
}
catch (SQLException e)
{
}
%>
</body>
</html>
