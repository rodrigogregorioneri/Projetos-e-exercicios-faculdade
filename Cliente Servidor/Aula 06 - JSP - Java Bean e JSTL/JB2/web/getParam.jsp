<jsp:useBean id="pessoa" class="meusBeans.PessoaBean">
  <jsp:setProperty name="pessoa" property="nome" param="nome" />
  <jsp:setProperty name="pessoa" property="email" param="email" />
</jsp:useBean>
<html>
  <head>
     <title>Teste BEANS</title>
     <style type="text/css">
<!--
.style1 {	color: #FF0000;
	font-weight: bold;
	font-size: 16px;
}
body {
	background-color: #FFFFCC;
}
-->
     </style>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1"></head>
  <body>
     <p align="center"><font color='#CC3300 ' size='4'><font color="#000066" size="6">Universidade Cruzeiro do Sul</font><BR>
           <font color="#000033">Tecnologia em Análise e Desenvolvimento de Sistemas</font></font></p>
     <p align="center"><span class="style1">UTILIZANDO BEANS</span></p>
        
     <p>Seu nome : <b><jsp:getProperty name="pessoa" property="nome" /></b></p>
     <p>Seu email: <b><jsp:getProperty name="pessoa" property="email" /></b></p> 
  </body>
</html> 
