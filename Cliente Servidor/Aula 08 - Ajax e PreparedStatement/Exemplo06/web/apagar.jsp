<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>

<%
Connection con;
PreparedStatement pstm;
String sql;
String url = "jdbc:mysql://localhost/aula";
try
{
	Class.forName("com.mysql.jdbc.Driver");
	con = DriverManager.getConnection(url,"root","root");
	sql = "DELETE FROM alunos WHERE id = ?";
	pstm = con.prepareStatement(sql);
	pstm.setInt(1,Integer.parseInt(request.getParameter("id")));
	pstm.executeUpdate();
	response.sendRedirect("lista.jsp");	
}
catch(SQLException ex)
{
	out.print(ex.getMessage());
}
%>