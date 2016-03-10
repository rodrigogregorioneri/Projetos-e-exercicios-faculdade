<%@ include file="conecta.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<title>Exemplo Ajax 2</title>
<script src="ajax.js" type="text/javascript"></script>
<script language="javascript">
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
    <h1>Exemplo Ajax 2 </h1>
    <p>No evento <i><b>onChange</b></i> do combo das turmas, o objeto <i>XMLHttpRequest</i> 
    pesquisa os alunos da turma em uma base de dados, atrav&eacute;s de uma requisi&ccedil;&atilde;o ass&iacute;ncrona 
    &agrave; p&aacute;gina <i><b>pesquisaAlunos.jsp</b></i>. Atrav&eacute;s da resposta XML, &eacute; gerada 
    uma tabela.</p>
    <p>
      <select name="select" onChange="solicitacaoHttp('pesquisaAlunos.jsp','?codTurma='+this.value)">
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
    <div id="tabelaAlunos"></div>
</body>
</html>

