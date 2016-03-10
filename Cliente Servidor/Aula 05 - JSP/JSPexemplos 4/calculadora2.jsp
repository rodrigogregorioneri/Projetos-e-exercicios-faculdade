<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>calculadora</title>
</head>

<body>
<form method="POST" action="calcular2.jsp">
  |<input type="text" name="num1"> e
   <input type="text" name="num2"> <br>
   <input type="submit" name="operacao" value="Somar">
   <input type="submit" name="operacao" value="Subtrair">
   <input type="submit" name="operacao" value="Multiplicar">
   <input type="submit" name="operacao" value="Dividir">

</form>

<%

	String resp = request.getParameter("resp");
	if (resp != null)
		out.println("Resultado: " + resp);
%>
</body>
</html>