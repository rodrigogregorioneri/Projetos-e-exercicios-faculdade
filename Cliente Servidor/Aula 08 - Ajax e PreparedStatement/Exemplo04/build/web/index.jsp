<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exemplo Ajax 4</title>
        <script language="javascript">
            var xmlHttp;
            function mudaImagem() {
                var url = 'mudaImagem.jsp';
                if (window.ActiveXObject) {
                        xmlHttp = new ActiveXObject('Microsoft.XMLHTTP');
                }
                else if (window.XMLHttpRequest) {
                        xmlHttp = new XMLHttpRequest();
                }
                xmlHttp.open('GET', url, true);
                xmlHttp.onreadystatechange = callback;
                xmlHttp.send(null);
            }
            function callback(){
                if (xmlHttp.readyState == 4) {
                    if (xmlHttp.status == 200) {
                        elemImagem = document.getElementById("imagem");
                        nomeImagem = xmlHttp.responseXML;
                        nomeImagem = nomeImagem.getElementsByTagName("imagem");
                        nomeImagem = nomeImagem[0].childNodes[0].nodeValue;
                        elemImagem.src = nomeImagem;
                    }
                }
            }
        </script>
    </head>
    <body>

    <h1>Exemplo Ajax 4</h1>
    
    <img id="imagem" src="imagens/produtos/51625A_small.jpg" onclick="mudaImagem()"/>
    
    </body>
</html>
