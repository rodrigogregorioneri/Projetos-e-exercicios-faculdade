<%
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	String operacao = request.getParameter("operacao");
	float resultado=0;
	
	
	if (operacao.equals("Somar")){
		resultado = Float.parseFloat(num1) + Float.parseFloat(num2);
	}
	
	if (operacao.equals("Subtrair")){
		resultado = Float.parseFloat(num1) - Float.parseFloat(num2);
	}
	
	if (operacao.equals("Multiplicar")){
		resultado = Float.parseFloat(num1) * Float.parseFloat(num2);
	}
	
	if (operacao.equals("Dividir")){
		resultado = Float.parseFloat(num1) / Float.parseFloat(num2);
	}
	
	response.sendRedirect("calculadora.jsp?resp=" + resultado);
%>
