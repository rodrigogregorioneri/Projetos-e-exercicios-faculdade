<html>
<body> 

<%-- Comentário: exemplo Teste0a.jsp --%>

<h1>Tabela de quadrados</h1>

<table>
 <tr>
   <td> <b> Valor </b> </td>
   <td> <b> Quadr </b> </td>
 </tr>

<%
//Este é um scriptlet Java
float v =1;
while(v <= 10) {
   out.println("<tr><td>");
   out.println(v);
   out.println("</td><td>");
   out.println(v * v);
   out.println("</td></tr>");
   v++;
}
%>

</table>
</body>
</html>