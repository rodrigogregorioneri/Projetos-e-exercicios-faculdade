<%@ include file="conecta.jsp" %>
<%
    String status = request.getParameter("status");
    
    if(status != null && status.equals("1")) {
        out.println("Registro Inserido com sucesso");
    }
%>
<html>
    <head>
        <title>Banco de Dados</title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
    </head>
    
    <body>
        <form name="form1" action="gravar.jsp" method="post">
            <table border="1">
                <tr>
                    <td>Nome:</td>
                    <td><input type="text" name="nome"></td>
                </tr>
                <tr>
                    <td>Nota 1:</td>
                    <td><input type="text" name="nota1"></td>
                </tr>
                <tr>
                    <td>Nota 2:</td>
                    <td><input type="text" name="nota2"></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="Gravar"></td>
                </tr>
            </table>
        </form>
        <br>
        <table border="1">
            <tr>
                <td>Nome</td>
                <td>Nota 1</td>
                <td>Nota 2</td>
            </tr>
        <%
            String sql = "SELECT * FROM dados ORDER BY nome";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                out.println("<tr>");
                out.println("<td>" + rs.getString("nome") + "</td>");
                out.println("<td>" + rs.getString("nota1") + "</td>");
                out.println("<td>" + rs.getString("nota2") + "</td>");
                out.println("</tr>");
            }
            rs.close();
            stmt.close();
        %>
        
        </table>
    </body>
</html>
