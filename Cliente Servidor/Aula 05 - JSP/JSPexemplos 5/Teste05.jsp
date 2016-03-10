<%-- Teste05.jsp --%>
<html>
<body> 
    <h1>Teste05.jsp</h1>
    <h2>Utilizando for e switch</h2>
    <b>
    <p>Idem a Teste04.jsp, mas utiliza os valores incial e final enviados como argumentos</p>
    <p>Ou seja, utilize, por exemplo:  http://localhost:8082/ ..../Teste05.jsp?ini=4&fim=45</p>
    </b>
   
   <p>Quadrados de valores</p>
	<%
	int valor = Integer.parseInt(request.getParameter("ini"));
	int fim = Integer.parseInt(request.getParameter("fim"));
	for(; valor<=fim; valor++){
		switch(valor){
			case 9:
				out.println("Omitido 9");
				break;
			case 13:
				out.println("Omitido 13");
				break;
			default:
				out.println(valor + " --- " + (valor*valor) + "<br>");
		}
	}
	%>
</body> 
</html>

