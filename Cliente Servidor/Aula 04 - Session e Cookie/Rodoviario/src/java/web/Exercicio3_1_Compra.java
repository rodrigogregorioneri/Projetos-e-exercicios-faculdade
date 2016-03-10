package web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Exercicio3_1_Compra extends HttpServlet {

  private void resultado(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    String passagens[] = request.getParameterValues("txt_passagens");
    String cod_passagens[] = request.getParameterValues("txt_passagenscod");

    // gerar um cookie para cada passagem
    for(int cont=0;cont<cod_passagens.length;cont++){

          String nome = cod_passagens[cont];
          String valor = passagens[cont];
          if (!valor.equals("")){
              Cookie cookie = new Cookie(nome, valor);
              response.addCookie(cookie);
          };
    }

    response.setContentType("text/html; charset=iso-8859-1");
    PrintWriter out = response.getWriter();
    out.println("<html>");
    out.println("<head>");

    out.println("<title>Análise e Desenvolvimento de Sistemas - RODRIGO GREGORIO NERI</title>");
    out.println("</head>");
    out.println("<body bgcolor='#FFFFCC'>");
    out.println("<table width='100%' height=100% border='2' cellpadding='0' cellspacing='0' bordercolor='#000066' bgcolor='#FFFFCC'>");
    out.println("  <tr>");
    out.println("    <td>");
    out.println("	<table height=100% width='100%' border='0' cellspacing='0' cellpadding='0'>");
    out.println("        <tr> ");
    out.println("          <td height='15' bgcolor='#000066'>");
    out.println("	      <table width='100%' border='0' cellspacing='0' cellpadding='0'>");
    out.println("              <tr>");
    out.println("                <td width='36%' height='19'><strong><font color='#FFFFFF' size='4'><br>");
    out.println("                  Análise e Desenvolvimento de Sistemas<br>");
    out.println("                  Prof(s) Luiz / Ana<br>");
    out.println("                  <br>");
    out.println("                  </font></strong></td>");
    out.println("                <td width='35%'><div align='center'><font color='#FFFFFF' size='4' face='Verdana, Arial, Helvetica, sans-serif'><strong>UNIVERSIDADE CRUZEIRO DO SUL</strong></font></div></td>");
	out.println("                <td width='29%'><div align='right'><font color='#FFFFFF' size='4' face='Verdana, Arial, Helvetica, sans-serif'><strong>3º / 4º ");
    out.println("                    Semestre</strong></font></div></td>");
    out.println("              </tr>");
    out.println("            </table>");
    out.println("            </td>");
    out.println("        </tr>");
    out.println("	<form name='frmresultado' method='post' action='Exercicio3_2_Compra'>");
    out.println("        <tr> ");
    out.println("      <td>");
    out.println("		  <table width='100%' border='0' cellspacing='0' cellpadding='0'>");
    out.println("            <tr> ");
    out.println("              <td colspan='7'><div align='center'><strong><font color='#CC3300' size='6'>Sistema ");
    out.println("                  para Busca de Passagens</font><font color='#CC3300' size='5'><br>");
    out.println("                  </font></strong></div></td>");
    out.println("            </tr>");
    out.println("            <tr> ");
    out.println("              <td height='20'>&nbsp;</td>");
    out.println("              <td colspan='6'>&nbsp;</td>");
    out.println("            </tr>");
    out.println("            <tr>");
    out.println("              <td height='20'>&nbsp;</td>");
    out.println("              <td colspan='6'>&nbsp;</td>");
    out.println("            </tr>");
    out.println("            <tr> ");
    out.println("              <td width='2%' height='20'>&nbsp;</td>");
    out.println("              <td colspan='6'><div align='center'><strong><font color='#0000FF' size='5'><em>Compra ");
    out.println("                  efetuada com Sucesso</em></font></strong></div></td>");
    out.println("            </tr>");
    out.println("            <tr> ");
    out.println("              <td>&nbsp;</td>");
    out.println("              <td>&nbsp;</td>");
    out.println("              <td>&nbsp;</td>");
    out.println("              <td>&nbsp;</td>");
    out.println("              <td>&nbsp;</td>");
    out.println("              <td>&nbsp;</td>");
    out.println("              <td>&nbsp;</td>");
    out.println("            </tr>");
    out.println("            <tr> ");
    out.println("              <td>&nbsp;</td>");
    out.println("              <td width=16%>&nbsp;</td>");
    out.println("              <td width=10%>&nbsp;</td>");
    out.println("              <td width=19%>&nbsp;</td>");
    out.println("              <td width=12%>&nbsp;</td>");
    out.println("              <td width=17%>&nbsp;</td>");
    out.println("              <td width=24%><p>&nbsp;</p></td>");
    out.println("            </tr>");
    out.println("            <tr> ");
    out.println("              <td>&nbsp;</td>");
    out.println("              <td>&nbsp;</td>");
    out.println("              <td> &nbsp;&nbsp; </td>");
    out.println("              <td> &nbsp;&nbsp; </td>");
    out.println("              <td><input type='button' name='btnVoltar' value='Voltar' onClick='javascript:history.back(1)'></td>");
    out.println("              <td>&nbsp;</td>");
    out.println("              <td>&nbsp;</td>");
    out.println("            </tr>");
    out.println("          </table>");
    out.println("        <p>&nbsp;</p>");
    out.println("           <p><br>");
    out.println("            <br>");
    out.println("            <br>");
    out.println("            <br>");
    out.println("          </p>");
    out.println("        <p>&nbsp;</p></td>");
    out.println("    </tr>");
    out.println("		</form>");
    out.println("      </table>");
    out.println("      <p>&nbsp;</p>");
    out.println("      </td>");
    out.println("  </tr>");
    out.println("</table>");
    out.println("</body>");
    out.println("</html>");
  };

  public void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    resultado(request, response);
  }
}
