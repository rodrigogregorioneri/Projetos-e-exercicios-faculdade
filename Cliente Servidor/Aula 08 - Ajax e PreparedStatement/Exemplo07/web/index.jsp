<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
 
        <form method="POST" action="incluiclientes.jsp" name="formulario" onsubmit="return fValidaForm();">
            <span class="instr">Campos obrigat&oacute;rios aparecem em negrito:</span>
            <table class="form">
                <tr>
                    <td>
                        <strong>Nome</strong>
                    </td>
                    <td>
                        <input type="text" name="nome" size="40" maxlength="60">
                    </td>
                </tr>
                <tr>
                    <td>
                        Endere&ccedil;o
                    </td>
                    <td>
                        <input type="text" name="endereco" size="40" maxlength="60">
                    </td>
                </tr>
                <tr>
                    <td>
                        Cidade
                    </td>
                    <td>
                        <input type="text" name="cidade" size="40" maxlength="60">
                    </td>
                </tr>
                <tr>
                    <td>
                        Estado
                    </td>
                    <td>
                        <input type="text" name="estado" size="2">
                        &nbsp;&nbsp;CEP&nbsp;
                        <input type="text" name="cep" size="9">
                    </td>
                </tr>
                <tr>
                    <td>
                        <strong>E-mail</strong>
                    </td>
                    <td>
                        <input type="text" name="email" size="40" maxlength="60">
                    </td>
                </tr>
                <tr>
                    <td>
                        Cliente
                    </td>
                    <td>
                        <input type="radio" name="cliente" value="S">Sim <input type=
                        "radio" name="cliente" value="N" checked>N&atilde;o
                    </td>
                </tr>
                <tr>
                    <td>
                        Estado Civil
                    </td>
                    <td>
                        <select name="estadocivil">
                            <option value="Casado">
                                Casado
                            </option>
                            <option value="Solteiro">
                                Solteiro
                            </option>
                            <option value="Separado">
                                Separado
                            </option>
                            <option value="Divorciado">
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
                                    "Fin.Aut.">Financiamento de Autom&oacute;vel
                                </td>
                                <td>
                                    <input type="checkbox" name="interesse2" value=
                                    "Poupanca">Poupan&ccedil;a
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input type="checkbox" name="interesse3" value=
                                    "Credito">Cr&eacute;dito Pessoal
                                </td>
                                <td>
                                    <input type="checkbox" name="interesse4" value=
                                    "Acoes">A&ccedil;&otilde;es
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
                        <textarea name="comentario" cols="50" rows="5"></textarea>
                    </td>
                </tr>
                <tr>
                    <td>
                    </td>
                    <td>
                        <input type="submit" name="submit" value="Incluir">   <input
                        type="reset" name="reset" value="Limpar">
                    </td>
                </tr>
            </table>
        </form>
        <p><a href="listaclientes.jsp">Listar Pessoas cadastradas</a></p>
    </body>
</html> 