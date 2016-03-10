<HTML>
<BODY  bgcolor='#FFFFCC'>
<div align='center'>
  <p><font color='#CC3300 ' size='4'><font color="#000066" size="6">Universidade Cruzeiro do Sul</font><br>
      <font color="#000033">Ciencia da Computa&ccedil;&atilde;o</font></font><font color='#000066' size='5'><B></font></p>
  <p><font color='#FF0000' size='3'><strong>CONVERSÃO DE  GRAUS CELSIUS PARA FAHRENHEIT</strong></font></p>
</div>
<BR>
<table border=1>
<tr>
<td colspan=2><div align='center'><font color='#CC3300 ' size='5'>Conversão</font></div></td>
</tr>
<tr>
  <td>
	<font color='#000000 ' size='4'>Celsius</font>
  </td>
  <td>
	<font color='#000000 ' size='4'>Fahrenheit</font>
  </td>
</tr>

<%
for(int cont=-40;cont<=100;cont+=10){%>
	<tr>
	   <td>
	      <%=cont%>
	   </td>
	   <td>
	      <%double fahrenheit= ( 9.0 / 5 * cont )+32;%>
	      <%=fahrenheit%>
	   </td>
	   
	</tr>
<%}%>
</table>
</BODY>
</HTML>
