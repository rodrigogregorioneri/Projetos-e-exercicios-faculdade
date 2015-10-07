// JavaScript Document
var xmlDoc;

function exibeMenu(){
	carregaXML();
	//carrega os filhos do elemento pai com o nome opcao
	//como existem mais de uma tag com esse nome, e retornado um vetor
	//opc[0], opc[1], opc[2] ...
	opc = xmlDoc.getElementsByTagName("opcao");	
	alert("Quantidade de elementos retornado = "+opc.length);
	for (i=0;i< opc.length;i++)
	{
		document.write(opc[i].getAttribute("id")+"-"+opc[i].firstChild.nodeValue+"<br>");
		//ou
		//document.write(opc[i].getAttribute("id")+"-"+opc[i].childNodes[0].nodeValue+"<br>");
	}	
}

function carregaXML(){	
	if (navigator.appName != "Microsoft Internet Explorer")
	{
		//utilizado para diversos browser, inclusive para IE8 porém somente para conexão HTTP
		//este código segue o mesmo princípio quando utilizado com AJAX
		xmlHttp = new XMLHttpRequest();
		xmlHttp.open("GET","menu.xml",false);
		xmlHttp.send(null)
		xmlDoc = xmlHttp.responseXML;	
	}
	else
	{
		//Utilizado para acessar arquivo XML somente no IE
		xmlHttp = new ActiveXObject("Microsoft.XMLDOM")
		xmlHttp.async="false"
		xmlHttp.load("menu.xml")
		xmlDoc = xmlHttp
	}
}
