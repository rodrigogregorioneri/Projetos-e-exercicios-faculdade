<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
</head>

<body>
<form method="POST" action="ExemploRequest.jsp">
  <p>Nome:
    <input type="text" name="nome"><br>
    ID: <input type="text" name="id">
  <br />
  <input type="submit" name="Enviar" id="Enviar" value="Enviar" />
  </p>
  <p><br>
  </p>
</form>

<%
if (request.getParameter("Enviar") != null)
{
	if (request.getParameter("nome") != "" && request.getParameter("id") != ""){
		String nome = request.getParameter("nome");
		int id = Integer.parseInt(request.getParameter("id"));
		if (id == 5)
			out.println(nome);	
	}
}
%>
</body>
</html>