<%@include file="conecta.jsp" %>
<%@page contentType="text/xml"%>
<%@page pageEncoding="ISO-8859-1"%>
<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");

    String rgm = request.getParameter("rgm");
    String sql = "SELECT aluno.nome, turma.nome FROM aluno INNER JOIN turma ";
    sql += "ON (aluno.turma = turma.codigo) WHERE aluno.codigo='" + rgm + "'";
    ResultSet rs = stmt.executeQuery(sql);
    out.println("<resposta>");
    if(rs.next()) {
        out.println("<nome>" + rs.getString("aluno.nome") + "</nome>");
        out.println("<turma>" + rs.getString("turma.nome") + "</turma>");
    }
    else {
        out.println("<nome>Não encontrado</nome>");
        out.println("<turma>N/C</turma>");
    }
    out.println("</resposta>");
    rs.close();
%>