<%@include file="conecta.jsp" %>
<%@page contentType="text/xml"%>
<%@page pageEncoding="UTF-8"%>

<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    out.println("<table border=\"1\">");
    out.println("<tr><th>RGM</th><th>Nome</th></tr>");
    try{
        String codTurma = request.getParameter("codTurma");
        if(codTurma!=null){
            ResultSet rs = stmt.executeQuery("SELECT * FROM aluno WHERE turma = "+codTurma+" ORDER BY codigo");
            while(rs.next()){
                out.println("<tr><td>"+rs.getString("codigo")+"</td><td>"+rs.getString("nome")+"</td></tr>");
            }
            rs.close();
       }
    }catch(Exception e){
         out.println("<tr><td colspan=2>"+e.getMessage()+"</td></tr>");
    }
    out.println("</table>");
%>
