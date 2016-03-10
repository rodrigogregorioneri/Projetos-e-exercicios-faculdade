<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
 
<%@ page import = "cadastro.*"%>
<jsp:useBean id="ListaClientes" class="cadastro.ListaClientes" scope="request" type="ListaClientes"/>
 
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="folha.css">
        <title>Cadastro de Clientes</title>
    </head>
 
    <body>
        <h3>Cadastro de Clientes</h3>
 
        <% if( !ListaClientes.consultar() ){  %>
        <p>Erro no acesso ao banco de dados(/p>
        <% } %>
 
        <table>
            <tr bgcolor="#00ccff"><th>Nome</th><th>Endere&ccedil;o</th><th>Cidade</th>
<th>CEP</th><th>Estado</th><th>E-mail</th>
            <th>Cliente</th><th>Est.Civil</th><th>Interesse1</th><th>Interesse2</th>
<th>Interesse3</th><th>Interesse4</th>
            <th>Coment&aacute;rios</th></tr>
            <%
            while (ListaClientes.proximoCliente() ) { %>
            <tr bgcolor='#99FFCC'>
                <td><a href="altera.jsp?id=<%= ListaClientes.getId()%>"><%= ListaClientes.getNome() %></a></td>
                <td><%= ListaClientes.getEndereco() %></td>
                <td><%= ListaClientes.getCidade() %></td>
                <td><%= ListaClientes.getCep() %></td>
                <td><%= ListaClientes.getEstado() %></td>
                <td><%= ListaClientes.getEmail() %></td>
                <td><%= ListaClientes.getCliente() %></td>
                <td><%= ListaClientes.getEstadocivil() %></td>
                <td><%= ListaClientes.getInteresse1() %></td>
                <td><%= ListaClientes.getInteresse2() %></td>
                <td><%= ListaClientes.getInteresse3() %></td>
                <td><%= ListaClientes.getInteresse4() %></td>
                <td><%= ListaClientes.getComentario() %></td>
            </tr>    
            <%   } 
            %>
        </table>
 
        <p><a href="index.jsp">Incluir nova Pessoa</a></p>
    </body>
</html> 