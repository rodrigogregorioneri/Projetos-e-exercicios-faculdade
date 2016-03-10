<%!
	public float calcular(String num1, String num2, String operacao) {
	
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
		
		return resultado;
	
	}
%>

<%
	String n1 = request.getParameter("num1");
	String n2 = request.getParameter("num2");
	String op = request.getParameter("operacao");
	
	
	response.sendRedirect("calculadora.jsp?resp=" + calcular(n1,n2,op));
%>
