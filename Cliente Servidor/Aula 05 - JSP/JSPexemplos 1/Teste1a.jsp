<%-- Comentário: exemplo com JSP Teste1a.jsp --%>

<html>
<body> 

<h1>Tabela de senos. Teste1a.jsp.</h1>

<%-- 
Experimente abrir esta página com
http://localhost:8082/jsp/Teste1a.jsp?inicial=0&final=6.30&incremento=0.01 
--%>

<table>
 <tr>
   <td> <b> Ang </b> </td>
   <td> <b> Sen(Ang) </b> </td>
 </tr>

<%
//entramos neste scriptlet Java
float va  = Float.parseFloat( request.getParameter("inicial") ); 
float vb  = Float.parseFloat( request.getParameter("final") ); 
float inc = Float.parseFloat( request.getParameter("incremento") ); 

while(va <= vb) {
   out.println("<tr><td>");
   out.println(va);
   out.println("</td><td>");
   out.println(Math.sin(va));
   out.println("</td></tr>");
   va += inc;
}
%>

</table>
</body>
</html>