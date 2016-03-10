  <%-- ProcessaComidas.jsp --%>
  <html>
  <head>
     <title>Resposta ao usuário</title>
  </head>
  <body>
  <h2>Estamos em ProcessaComidas.jsp. Gerando de uma resposta HTML dinâmica.</h2>
  <h3>Sua resposta.....</h3>
  <p>
  	<%
		if(request.getParameter("nomePessoa")!=null && request.getParameter("sexoPessoa")!=null){
			out.println("<p>Nome digitado: " + request.getParameter("nomePessoa") + "<br>");
			out.println("Sexo: " + request.getParameter("sexoPessoa") + "<br></p>");
			String comidas[] = request.getParameterValues("favs");
			if(comidas.length > 0){
				out.println("<p>Comidas favoritas: " + "<br>");
				for(int i=0; i < comidas.length; i++){
					out.println(comidas[i] + "<br>");
				}
				out.println("</p>");
			}
			switch(request.getParameter("sexoPessoa").charAt(0)){
				case 'f':
					out.println("<p>Recomendamos que visite os sites:"+
					  "<blockquote>"+
					  "www.claudia.com.br <br>"+
					  "www.caras.com.br <br>"+
					  "</blockquote></p>");
					break;
				case 'm':
					out.println("<p>Recomendamos que visite os sites:"+
					  "<blockquote>"+
					  "www.quatrorodas.com.br <br>"+
					  "www.webmotors.com.br <br>"+
					  "www.carsale.com.br <br>"+
					  "</blockquote></p>");
			}
		}
	%>
  <a href="Teste06.jsp">Voltar ao formulário</a>
  </body>
  </html>
  