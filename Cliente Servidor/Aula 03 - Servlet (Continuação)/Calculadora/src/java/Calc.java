
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class Calc extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        int v1, v2;
		PrintWriter out = response.getWriter();
	try {
		out.println("<HTML>");
		out.println("<HEAD>");
		out.println("<TITLE>");
		out.println("Exercício de Calculadora - Resultado");
		out.println("</TITLE>");
		out.println("</HEAD>");
		out.println("<BODY bgcolor=#009999>");
		out.println("<BR>");
		out.println("<p><font color=#FFFF00 size=5><strong>Universidade Cruzeiro do Sul - RODRIGO GREGORIO NERI</strong></font></p>");
		out.println("<table width=378 border=0 cellspacing=0 cellpadding=0>");
		out.println("<tr>");

		out.println("<td width=246><div align=right><strong><font color=#FFFF00 size=4>" +
				  "Opera&ccedil;&atilde;o Solicitada:&nbsp; </font></strong></div></td>");
		out.println("<td width=132><strong><font color=#FFFF00 size=4>" +
				  request.getParameter("operacao") + "</font></strong></td></tr>");

		out.println("<tr><td>&nbsp;</td><td>&nbsp;</td></tr>");

		v1 = Integer.parseInt(request.getParameter("valor1"));
		v2 = Integer.parseInt(request.getParameter("valor2"));

		out.println("<tr>");

		if (request.getParameter("operacao").equals("somar") ){
			out.println("<td><div align=right><font size=4>&nbsp;<strong><font color=#FFFF00>" +
						v1 + " + " + v2 + " = </font></strong></font></div></td>");
			out.println("<td><font size=4>&nbsp;<strong><font color=#FFFF00>" +
						(v1 + v2) + "</font></strong></font></td>");
		}else if (request.getParameter("operacao").equals("subtrair") ) {
			out.println("<td><div align=right><font size=4>&nbsp;<strong><font color=#FFFF00>" +
						v1 + " - " + v2 + " = </font></strong></font></div></td>");
			out.println("<td><font size=4>&nbsp;<strong><font color=#FFFF00>" +
						(v1 - v2) + "</font></strong></font></td>");
		}else if (request.getParameter("operacao").equals("dividir") ) {
			out.println("<td><div align=right><font size=4>&nbsp;<strong><font color=#FFFF00>" +
						v1 + " / " + v2 + " = </font></strong></font></div></td>");
			out.println("<td><font size=4>&nbsp;<strong><font color=#FFFF00>" +
						(v1 / v2) + "</font></strong></font></td>");
		}else if (request.getParameter("operacao").equals("multiplicar") ) {
			out.println("<td><div align=right><font size=4>&nbsp;<strong><font color=#FFFF00>" +
						v1 + " * " + v2 + " = </font></strong></font></div></td>");
			out.println("<td><font size=4>&nbsp;<strong><font color=#FFFF00>" +
						(v1 * v2) + "</font></strong></font></td>");
		}

		out.println("</tr></table>");
		out.println("<input type='button' name='btnvoltar' value='Voltar' onClick='javascript:history.back(1)'>");
		out.println("</BODY>");
		out.println("</HTML>");
	} catch (ArithmeticException e){
		out.println("<html><head><title>Resultado da Calculadora");
		out.println("</title></head>");
		out.println("<body>");
		out.println("<p>Divisão não pode ser por zero");
		out.println("</body>");
		out.println("</html>");
	}finally{
		out.close();
	}
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("/Calculadora/Exemplo02");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
