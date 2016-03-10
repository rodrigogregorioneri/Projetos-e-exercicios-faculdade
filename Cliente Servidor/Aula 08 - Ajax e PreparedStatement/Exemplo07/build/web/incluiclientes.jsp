<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
 
<%@ page import = "cadastro.*"%>
<jsp:useBean id="IncluiClientes" class="cadastro.IncluiClientes" scope="request" type="IncluiClientes"/>
<jsp:setProperty name="IncluiClientes" property="*"/>
 
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="folha.css">
        <title>Cadastro de Clientes</title>
    </head>
 
    <body>
        <h3>Inclus&atilde;o de Cliente</h3>
 
        <% if( IncluiClientes.incluir() ){  %>
        <p>Cliente <strong><%= IncluiClientes.getNome() %></strong> incluido com sucesso</p>
        <% }else{ %>
        <p>Ocorreu erro na inclusão!</p>
        <% } %>
 
        <p><a href="listaclientes.jsp">Listar Pessoas cadastradas</a></p>
    </body>
</html> 