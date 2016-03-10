// JavaScript Document
function solicitacaoHttp(url, dados) { 
	xmlHttp = false;
	//verifica o navegador
	if (window.ActiveXObject) {
		xmlHttp = new ActiveXObject('Microsoft.XMLHTTP');
	}
	else if (window.XMLHttpRequest) {
		xmlHttp = new XMLHttpRequest();
	}
	xmlHttp.open("GET", url+dados, true);
	xmlHttp.onreadystatechange = aguardaRetorno;
	xmlHttp.send(null);
}

function aguardaRetorno(){
	if (xmlHttp.readyState == 4) {
		if (xmlHttp.status == 200) {
			processar();
		}
	}
}