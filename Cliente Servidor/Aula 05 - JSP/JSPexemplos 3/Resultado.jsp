<%@ page import="java.util.*"
session="false"
errorPage="/erro.jsp" %>

<%! 
Date data;
double fahrenheit;
double celcius;

public String retorna( ) {
    String expressao;
    expressao = "Na data " + data.getDate() + "/" + data.getMonth() + "/" + (data.getYear()+1900);
    expressao = expressao + " a temperatura em celcius é " + celcius;
    expressao = expressao + " e o correspondente em fahrenheit é: " + fahrenheit;
    return (expressao); 
}
%>

<%
celcius = Double.parseDouble(request.getParameter("txt_temp"));
fahrenheit= ( 9.0 / 5 * Double.parseDouble(request.getParameter("txt_temp")) )+32;
data= new Date(request.getParameter("txt_data"));
%>
<HTML>
<BODY bgcolor="#FFFFCC">
<div align="center"><font color='#CC3300 ' size='4'><font color="#000066" size="6">Universidade Cruzeiro do Sul</font><BR>
      <font color="#000033">Ciencia da Computa&ccedil;&atilde;o</font><br>
  <br>
  </font>
  <%= retorna() %>
  <br>
  <br>
  <br>
  <input type='button' name='btnvoltar' value='Voltar' onClick='javascript:history.back(1)'>
</div>
</BODY>
</HTML>



