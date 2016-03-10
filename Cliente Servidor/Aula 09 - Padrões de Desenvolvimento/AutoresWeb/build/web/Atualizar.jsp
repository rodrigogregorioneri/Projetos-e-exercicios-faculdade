<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<jsp:useBean id="bean" scope="session" class= "br.com.Modelo.Autores"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <title>:: ALTERAÇÃO DE AUTOR ::</title>
    </head>

    <body>
        <form id="form1" name="form1" method="post" action="Atualizar.jsp">
            Consultar: Id: 
            <input type="text" name="id" id="id" />
            <input type="submit" name="consulta" id="consulta" value="Consultar" />
        </form>

        <%
            if (request.getParameter("consulta") != null) {
                ResultSet res = bean.consultar("SELECT * FROM autores WHERE id = " + request.getParameter("id"));

                if (res.next()) {
        %>
        <form id="form2" name="form2" method="post" action="AA">
            <p>Alterar Cliente</p>
            <p>Id: <%= res.getString("id")%>
                <input type="hidden" name="id" id="id" value="<%= res.getString("id")%>" />
                <input type="hidden" name="pNome" id="id" value="<%= res.getString("primeiroNome")%>" />
                <input type="hidden" name="sNome" id="id" value="<%= res.getString("segundoNome")%>" />
            </p>
            <p>Primeiro Nome:
                <input name="Primeiro Nome: " type="text" name="primeiroNome" value="<%= res.getString("primeiroNome")%>" />
                <br />
                <br />
            </p>
            <p>
                Segundo Nome:
                <input name="Primeiro Nome: " type="text" name="segundoNome" value="<%= res.getString("segundoNome")%>" />
                <br />
                <br />
            </p>
            <p>
                <input type="submit" name="button" id="button" value="Alterar" />
            </p>
        </form>
        <%
                } else {
                    out.print("Nenhum registro");
                }
            }
        %>

        <p>&nbsp;</p>
        <p>&nbsp;</p>
        <p><a href="index.jsp">Menu</a>
        </p>
    </body>
</html>
