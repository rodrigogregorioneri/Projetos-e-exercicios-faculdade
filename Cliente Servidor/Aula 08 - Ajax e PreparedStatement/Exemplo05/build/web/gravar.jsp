<%@ include file="conecta.jsp" %>
<%@page contentType="text/xml"%>
<%@page pageEncoding="iso-8859-1"%>
<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");

    //Captura os dados do formulário do index
    String turma = request.getParameter("codTurma");
    String codigo = request.getParameter("codigo");
    String nome = request.getParameter("nome");
    
    //Comando SQL para inserir na tabela
    String sql = "INSERT INTO aluno(codigo, nome, turma) VALUES('" + codigo + "','" + nome + "'," + turma + ")";
    
    //Executa o comando no banco de dados
    stmt.executeUpdate(sql);
    
    out.println("<turma>");
    try{
        if(turma!=null){
            ResultSet rs = stmt.executeQuery("SELECT * FROM aluno WHERE turma = "+turma);
            while(rs.next()){
                out.println("<aluno><codigo>"+rs.getString("codigo")+"</codigo><nome>"+rs.getString("nome")+"</nome></aluno>");
            }
            rs.close();
       }
    }catch(Exception e){}
    out.println("</turma>");
%>