<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 
<%@ page import = "cadastro.*"%>
<jsp:useBean id="AlteraClientes" class="cadastro.AlteraClientes" scope="request" type="AlteraClientes"/>
<jsp:setProperty name="AlteraClientes" property="*"/>
 
<html>
    <head>
        <title>
            Formul&aacute;rios
        </title>
        <link rel="stylesheet" type="text/css" href="folha.css">
        <script type="text/javascript" language="JavaScript1.2" src="valida.js">      
        </script>
    </head>
    <body>
        <h2>
            Cadastro de Clientes
        </h2>
 
        <% if( !AlteraClientes.consultar(request.getParameter("id")) ){  %>
              <p>Erro no acesso ao banco de dados(/p>
        <% } %>
 
        <form method="POST" action="alteraclientes.jsp?id=<%= request.getParameter("id")%>" name="formulario" onsubmit="return fValidaForm();">
            <span class="instr">Campos obrigat&oacute;rios aparecem em negrito:</span>
            <table class="form">
                <tr>
                    <td>
                        <strong>Nome</strong> 
                    </td>
                    <td>
                        <input type="text" name="nome" size="40" maxlength="60" value="<%= AlteraClientes.getNome() %>">
                    </td>
                </tr>
                <tr>
                    <td>
                        Endere&ccedil;o
                    </td>
                    <td>
                        <input type="text" name="endereco" size="40" maxlength="60" value="<%= AlteraClientes.getEndereco() %>">
                    </td>
                </tr>
                <tr>
                    <td>
                        Cidade
                    </td>
                    <td>
                        <input type="text" name="cidade" size="40" maxlength="60" value="<%= AlteraClientes.getCidade() %>">
                    </td>
                </tr>
                <tr>
                    <td>
                        Estado
                    </td>
                    <td>
                        <input type="text" name="estado" size="2" value="<%= AlteraClientes.getEstado() %>">
                        &nbsp;&nbsp;CEP&nbsp;
                        <input type="text" name="cep" size="9" value="<%= AlteraClientes.getCep() %>">
                    </td>
                </tr>
                <tr>
                    <td>
                        <strong>E-mail</strong>
                    </td>
                    <td>
                        <input type="text" name="email" size="40" maxlength="60" value="<%= AlteraClientes.getEmail() %>">
                    </td>
                </tr>
                <tr>
                    <td>
                        Cliente
                    </td>
                    <td>
                        <input type="radio" name="cliente" value="S" <% if(AlteraClientes.getCliente().equals("S")) {%>checked<% } %>>Sim <input type=
                        "radio" name="cliente" value="N" <% if(AlteraClientes.getCliente().equals("N")) {%>checked<% } %>>N&atilde;o
                    </td>
                </tr>
                <tr>
                    <td>
                        Estado Civil
                    </td>
                    <td>
                        <select name="estadocivil">
                            <option value="Casado" <% if("Casado".equals(AlteraClientes.getEstadocivil())) {%>selected<% } %>>
                                Casado
                            </option>
                            <option value="Solteiro" <% if("Solteiro".equals(AlteraClientes.getEstadocivil())) {%>selected<% } %>>
                                Solteiro
                            </option>
                            <option value="Separado" <% if("Separado".equals(AlteraClientes.getEstadocivil())) {%>selected<% } %>>
                                Separado
                            </option>
                            <option value="Divorciado" <% if("Divorciado".equals(AlteraClientes.getEstadocivil())) {%>selected<% } %>>
                                Divorciado
                            </option>
                        </select> 
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        Interesse por
                    </td>
                    <td>
                        <table>
                            <tr>
                                <td>
                                    <input type="checkbox" name="interesse1" value=
                                    "Fin.Aut." <% if("Fin.Aut.".equals(AlteraClientes.getInteresse1())) {%>checked<% } %>>Financiamento de Autom&oacute;vel
                                </td>
                                <td>
                                    <input type="checkbox" name="interesse2" value=
                                    "Poupanca" <% if("Poupanca".equals(AlteraClientes.getInteresse2())) {%>checked<% } %>>Poupan&ccedil;a
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" name="interesse3" value=
                                    "Credito" <% if("Credito".equals(AlteraClientes.getInteresse3())) {%>checked<% } %>>Cr&eacute;dito Pessoal
                                </td>
                                <td>
                                    <input type="checkbox" name="interesse4" value=
                                    "Acoes" <% if("Acoes".equals(AlteraClientes.getInteresse4())) {%>checked<% } %>>A&ccedil;&otilde;es
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        Coment&aacute;rios:
                    </td>
                    <td>
                        <textarea name="comentario" cols="50" rows="5"><%= AlteraClientes.getComentario()%></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                    </td>
                    <td>
                        <input type="submit" name="submit" value="Alterar">   
                        <input type="reset" name="reset" value="Limpar">&nbsp;&nbsp;&nbsp;
                        <input type="submit" name="submit" value="Excluir">   
                    </td>
                </tr>
            </table>
        </form>
        <p><a href="listaclientes.jsp">Listar Pessoas cadastradas</a></p>
    </body>
</html> 