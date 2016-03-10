<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
        <script language="Javascript">
            var xmlHttp;
            function pesquisar() {
                //Pega o RGM para pesquisar
                var jsrgm = document.getElementById("rgm").value;
                if(jsrgm == "") {
                    alert("Entre com o RGM do aluno para pesquisar");
                    return;
                }
                //Cria url para a página que faz a pesquisa
                var url = "buscaaluno.jsp?rgm=" + jsrgm;
                // code for IE6, IE5
                if (window.ActiveXObject) {
                    xmlHttp = new ActiveXObject('Microsoft.XMLHTTP');
                }
                //IE7+, Firefox, Chrome, Opera, Safari
                else if (window.XMLHttpRequest) {
                    xmlHttp = new XMLHttpRequest();
                }
                else {
                    alert("Navegador não suporta AJAX");
                }
                
				xmlHttp.open('GET', url, true);
				xmlHttp.onreadystatechange = capturaeventos;
				xmlHttp.send(null);
            }

		function capturaeventos(){
			//Mostra imagem de carregando na caixa
			if (xmlHttp.readyState == 1) {
                document.getElementById("nome").value = "Procurando...";
			}
			//Quando terminar de carregar a resposta
			if (xmlHttp.readyState == 4) {
				if (xmlHttp.status == 200) {
					//Captura a resposta do AJAX
					xmlDoc = xmlHttp.responseXML;
					jsnome = xmlDoc.getElementsByTagName("nome")[0].childNodes[0].nodeValue;
					jsturma = xmlDoc.getElementsByTagName("turma")[0].childNodes[0].nodeValue;

                    //Colocando a resposta no formulário
                    document.getElementById("nome").value = jsnome;
                    document.getElementById("turma").value = jsturma;
				}
			 }
		}

    </script>
    </head>
    <body>
        <h1>Busca Dados do Aluno</h1>
        <table border="1">
            <tr>
                <td>RGM:</td>
                <td>
                    <input type="text" name="rgm" id="rgm" size="7">
                    <input type="button" value="Pesquisar" onclick="Javascript:pesquisar()">
                </td>
            </tr>
            <tr>
                <td>Nome:</td>
                <td><input type="text" name="nome" id="nome" size="50"></td>
            </tr>
            <tr>
                <td>Turma:</td>
                <td><input type="text" name="turma" id="turma" size="7"></td>
            </tr>
        </table>
    </body>
</html>
