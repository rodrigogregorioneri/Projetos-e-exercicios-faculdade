<%@ include file="conecta.jsp" %>

<%
    //Captura os dados do formulário do index
    String nome = request.getParameter("nome");
    String nota1 = request.getParameter("nota1");
    String nota2 = request.getParameter("nota2");
    
    //Comando SQL para inserir na tabela
    String sql = "INSERT INTO dados(nome, nota1, nota2) VALUES('" + nome + "'," + nota1 + "," + nota2 + ")";
    
    //Executa o comando no banco de dados
    stmt.executeUpdate(sql);
    
    //Manda de volta para o index com uma mensagem (sucesso)
    response.sendRedirect("index.jsp?status=1");
%>