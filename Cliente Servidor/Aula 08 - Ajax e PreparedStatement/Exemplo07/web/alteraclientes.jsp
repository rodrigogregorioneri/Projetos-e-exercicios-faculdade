<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 
<%@ page import = "cadastro.*"%>
<jsp:useBean id="AlteraClientes" class="cadastro.AlteraClientes" scope="request" type="AlteraClientes"/>
<jsp:setProperty name="AlteraClientes" property="*"/>
 
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="folha.css">
        <title>Cadastro de Clientes</title>
    </head>
 
    <body>
        <h3>Altera&ccedil;&atilde;o de Cliente</h3>
 
        <% if("Excluir".equals(request.getParameter("submit"))) {
              if (AlteraClientes.excluir(request.getParameter("id"))) { %>
        <p>Cliente <strong><%= AlteraClientes.getNome() %></strong> excluido</p>
        <%    } else { %>
        <p>Ocorreu erro na exclus&atilde;o!</p>
        <%    } 
           } else { 
              if( AlteraClientes.alterar((request.getParameter("id")))) {  %>
        <p>Cliente <strong><%= AlteraClientes.getNome() %></strong> alterado com sucesso</p>
        <%    } else { %>
        <p>Ocorreu erro na altera&ccedil;&atilde;o!</p>
        <%    }
           }  %>
 
        <p><a href="listaclientes.jsp">Listar Pessoas cadastradas</a></p>
    </body>
</html> 