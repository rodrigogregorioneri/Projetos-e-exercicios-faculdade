<%@include file="conecta.jsp" %>
<%@page contentType="text/xml"%>
<%@page pageEncoding="iso-8859-1"%>

<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    out.println("<turma>");
    try{
        String codTurma = request.getParameter("codTurma");
        if(codTurma!=null){
            ResultSet rs = stmt.executeQuery("SELECT * FROM aluno WHERE turma = "+codTurma+" ORDER BY codigo");
            while(rs.next()){
                out.println("<aluno><codigo>"+rs.getString("codigo")+"</codigo><nome>"+rs.getString("nome")+"</nome></aluno>");
            }
            rs.close();
       }
    }catch(Exception e){}
    out.println("</turma>");
%>
