<%@ include file="conecta.jsp" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exemplo Ajax 2</title>
        <script language="javascript">
            var xmlHttp;
            function pesquisaAlunos(combo) {
                indice = combo.value;
				if(indice == 0) return;
                var url = 'pesquisaAlunos.jsp?codTurma=' + indice;
                if (window.ActiveXObject) {
                        xmlHttp = new ActiveXObject('Microsoft.XMLHTTP');
                }
                else if (window.XMLHttpRequest) {
                        xmlHttp = new XMLHttpRequest();
                }
                xmlHttp.open('GET', url, true);
                msg = document.getElementById("mensagem");
                msg.style.visibility = "visible";
                xmlHttp.onreadystatechange = callback;
                xmlHttp.send(null);
            }
            function callback(){
                if (xmlHttp.readyState == 4) {
                    if (xmlHttp.status == 200) {
                        escreveTabela();
                    }
                    msg.style.visibility = "hidden";
                }
            }
            function escreveTabela(){
                var tabela = document.getElementById("tabelaAlunos");
		tabela.innerHTML = xmlHttp.responseText;
            }
        </script>
    </head>
    <body>

        <h1 align="center">Exemplo Ajax 2 </h1>
    
    <p align="center">No evento <i><b>onChange</b></i> do combo das turmas, o objeto <i>XMLHttpRequest</i> 
	pesquisa os alunos da turma em uma base de dados, através de uma requisição assíncrona 
	à página <i><b>pesquisaAlunos.jsp</b></i>. Atrav&eacute;s da resposta XML, &eacute; gerada 
	uma tabela.</p>
    <p align="center">
      <select name="select" onChange="pesquisaAlunos(this)">
        <option value="0">Escolha uma Turma</option>
        <%
            String resp = "";
            try{
                ResultSet rs = stmt.executeQuery("SELECT * FROM turma ORDER BY nome");
                while(rs.next()){
                    resp+="<option value='"+rs.getInt("codigo")+"'>";
                    resp+=rs.getString("nome")+"</option>";
                }
                rs.close();
            }catch(Exception ex){
                resp = "<option>Erro ao carregar as turmas" + ex.toString() + "</option>";
            }
            out.println(resp);
        %>
    </select>
	</p>
    <div id="tabelaAlunos" align="center">
    </div>
    <div id="mensagem" style="background-color:#CC3300; color:#FFFFFF; font-weight:bold; position:absolute; top:0; right:0; visibility:hidden">&nbsp;&nbsp;Processando...&nbsp;&nbsp;</div>
    </body>
</html>

