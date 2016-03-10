<%@page contentType="text/xml"%>
<%@page pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>

<%!
    Connection c = null;
    Statement s = null;
%>
    
<%
    response.setHeader("Cache-Control", "no-cache");
    response.setHeader("Pragma", "no-cache");
    String prefix = request.getParameter("nome");
    if (prefix!=null) {
        out.println("<response>");
        try{
            if(c==null || c.isClosed()){
                Class.forName("com.mysql.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost/aula","root","root");
            }
            s = c.createStatement();
            ResultSet rs = s.executeQuery("SELECT nome FROM aluno WHERE nome LIKE '"+prefix+"%' ORDER BY nome");
            int cont = 0;
            while(rs.next()){
                out.println("<name>" + rs.getString("nome") + "</name>");
                cont++;
            }
            if (cont==0) response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            c.close();
        }catch(Exception e){
            response.setStatus(HttpServletResponse.SC_NO_CONTENT);
        }
        out.println("</response>");
    } else {
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }
%>
