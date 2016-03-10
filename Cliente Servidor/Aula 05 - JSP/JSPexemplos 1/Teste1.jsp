<%-- Comentário: exemplo Teste1.jsp --%>
<html>
<body> 

<h1>Tabela de quadrados. Teste1.jsp.</h1>
<table>
 <tr>
   <td> <b> Valor </b> </td>
   <td> <b> Quadr </b> </td>
 </tr>

<%
//este é um scriptlet Java
float va = 1; 
float vb = 20;

while(va <= vb) {
   out.println("<tr><td>");
   out.println(va);
   out.println("</td><td>");
   out.println(va * va);
   out.println("</td></tr>");
   va++;
}
%>

</table>
</body>
</html>