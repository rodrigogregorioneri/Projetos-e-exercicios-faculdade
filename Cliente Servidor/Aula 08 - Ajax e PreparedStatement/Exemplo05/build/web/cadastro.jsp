<%@ include file="conecta.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Exemplo Ajax 2</title>
<script src="ajax.js" type="text/javascript"></script>
<script language="javascript">
	function salvar(){
		parametros = "?codTurma="+document.getElementById("turma").value;
		parametros += "&codigo="+document.getElementById("codigo").value;
		parametros += "&nome="+document.getElementById("nome").value;
		solicitacaoHttp('gravar.jsp',parametros);
	}
	function processar(){
		var xmlDoc = xmlHttp.responseXML;
		var alunos = xmlDoc.getElementsByTagName("aluno");
		var saida ="";
		saida = "<table width='30%'><tr class='cabecalho'><td>Código</td><td>Nome</td></tr>";
		for(i=0; i<alunos.length; i++){
			codigo = alunos[i].getElementsByTagName("codigo");
			nome = alunos[i].getElementsByTagName("nome");
			saida+="<tr class='linha'><td>"+codigo[0].firstChild.nodeValue+"</td><td>"+nome[0].firstChild.nodeValue+"</td></tr>";	
		}
		saida+="</table>";
		document.getElementById("tabelaAlunos").innerHTML = saida;
	}
</script>
<style type="text/css">
	*{
		font-family:Verdana, Geneva, sans-serif;
		font-size:10pt;	
	}
	.cabecalho{
		background-color:#33C;	
		color:#FFF;
	}
	.linha{
		background-color:#CFC;	
	}
</style>
</head>
<body>
    <h1>Exemplo Ajax 3 - Gravação</h1>
    <p>
      Código: <input name="codigo" id="codigo" type="text">
      Nome: <input name="nome" id="nome" type="text">
      Turma: <select name="turma" id="turma">
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
    <input name="btn" type="button" value="Salvar" onclick="salvar()">
    </p>
    <div id="tabelaAlunos"></div>
</body>
</html>

