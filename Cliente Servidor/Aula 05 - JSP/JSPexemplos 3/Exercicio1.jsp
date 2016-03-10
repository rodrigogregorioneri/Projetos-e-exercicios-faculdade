<%! public String retornaData( ) {
	String data;
	String Dia_Semana[]=
             {"Domingo","Segunda Feira","Terça Feira","Quarta Feira","Quinta Feira","Sexta Feira","Sabado"};
	String Meses[]=
             {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro"};

	java.util.Date vdata = new java.util.Date();
	data = "Hoje é ";
	data = data + vdata.getDate();
	data = data + " (" + Dia_Semana[vdata.getDay()]+") de ";
	data = data + Meses[vdata.getMonth()] + " de ";
	data = data + (vdata.getYear()+1900);
	return (data); 
    }
 %>
<HTML>
<BODY>
<%= retornaData() %>
</BODY>
</HTML>
