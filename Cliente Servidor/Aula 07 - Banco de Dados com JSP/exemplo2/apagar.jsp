<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>

<%
Connection con;
Statement stm;
String sql;
String url = "jdbc:mysql://localhost/aula";
try
{
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection(url,"root","root");
	stm = con.createStatement();	
	sql = "DELETE FROM alunos WHERE rgm = "+request.getParameter("rgm");
	stm.executeUpdate(sql);
	response.sendRedirect("lista.jsp");	
}
catch(SQLException ex)
{
	out.print(ex.getMessage());
}
%>