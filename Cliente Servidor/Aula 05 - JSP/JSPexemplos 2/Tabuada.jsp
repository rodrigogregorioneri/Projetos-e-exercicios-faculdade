<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Tabuada</title>
</head>

<body>
<%
   	int num = Integer.parseInt(request.getParameter("txtTabuada"));
%>
<h1>Tabuada do <%= num %> </h1>
<table cellspacing="2">
<%
	//codigo Java
	 for (int v=0; v<=10; v++){
	 	%> 
        <tr bgcolor="#99CCCC"><td> 
			<% out.println(num + " x " + v + " = " + (num*v)); %> 
        </td></tr>
	<% }
%>  
</table>
</body>
</html>
