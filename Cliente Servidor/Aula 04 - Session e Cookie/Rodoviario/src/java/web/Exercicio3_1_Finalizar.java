package web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Exercicio3_1_Finalizar extends HttpServlet {

  private void resultado(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    HttpSession session = request.getSession();
    String Itinerario[][] = (String[][]) session.getAttribute("Itinerario");
    String Empresa[][] = (String[][]) session.getAttribute("Empresa");
    String TipoOnibus[][] = (String[][]) session.getAttribute("TipoOnibus");
    String Rotas[][] = (String[][]) session.getAttribute("Rotas");
    String Cidades[][] = (String[][]) session.getAttribute("Cidades");

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
    out.println("           </table>");
    out.println("         </td>");
    out.println("        </tr>");
    out.println("	     <form name='frmresultado' method='post' action='Exercicio3_2_Compra'>");
    out.println("        <tr> ");

    out.println("      <td valign='top'>");

    out.println("        <table width='100%' border='0' cellspacing='0' cellpadding='0'>");
    out.println("            <tr> ");
    out.println("              <td valign='top' colspan='9'><div align='center'><strong><font color='#CC3300' size='6'>Sistema ");
    out.println("                  para Busca de Passagens</font><font color='#CC3300' size='5'><br>");
    out.println("                  </font></strong></div></td>");
    out.println("            </tr>");
    out.println("            <tr>");
    out.println("              <td height='20'>&nbsp;</td>");
    out.println("              <td colspan='8'>&nbsp;</td>");
    out.println("            </tr>");
    try {
        Cookie[] cookies = request.getCookies();
        out.println("            <tr> ");
        out.println("              <td height='20' colspan='9'><div align='center'><strong><font color='#006600' size='6'>PASSAGENS ");
        out.println("                  COMPRADAS</font></strong></div></td>");
        out.println("            </tr>");
        out.println("            <tr> ");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("            </tr>");
        out.println("            <tr> ");
        out.println("              <td width='14%' bordercolor='#333333'><strong><font color='#000099' size='4'>&nbsp;Origem</font></strong></td>");
        out.println("              <td width='14%' bordercolor='#333333'><strong><font color='#000099' size='4'>Destino</font></strong></td>");
        out.println("              <td width='12%' bordercolor='#333333'><strong><font color='#000099' size='4'>Empresa</font></strong></td>");
        out.println("              <td width='6%' bordercolor='#333333'><div align='center'><strong><font color='#000099' size='4'> ");
        out.println("                  Sa&iacute;da</font></strong></div></td>");
        out.println("              <td width='6%' bordercolor='#333333'><div align='center'><strong><font color='#000099' size='4'>Cheg.</font></strong></div></td>");
        out.println("              <td width='17%' bordercolor='#333333'><strong><font color='#000099' size='4'>Tipo ");
        out.println("                de &Ocirc;nibus</font></strong></td>");
        out.println("              <td width='10%'><strong><font color='#000099' size='4'>Valor</font></strong></td>");
        out.println("              <td width='6%' bordercolor='#333333'><div align='center'><strong><font color='#000099' size='4'>Qtd.</font></strong></div></td>");
        out.println("              <td width='13%' bordercolor='#333333'><strong><font color='#000099' size='4'>Valor ");
        out.println("                Total</font></strong></td>");
        out.println("            </tr>");

        double total=0;

        for (int cont1 = 0; cont1 < cookies.length; cont1++) {
            Cookie esteCookie = cookies[cont1];

            String Cod_Itinerario = esteCookie.getName();
            String Qtd = esteCookie.getValue();
            if (Qtd.equals("")){
                Qtd = "0";
            }

                out.println("<tr> ");
                for(int cont2=0;cont2<Itinerario.length;cont2++){
                    if (Cod_Itinerario.equals(Itinerario[cont2][0])){ // Procura a posição na matriz do Itinerario

                        for(int cont3=0;cont3<Rotas.length;cont3++){
                              if (Itinerario[cont2][1].equals(Rotas[cont3][0])){ // Procura a Rota para determinar a cidade de Origem
                                  for(int cont4=0;cont4<Cidades.length;cont4++){
                                      if (Rotas[cont3][1].equals(Cidades[cont4][0])){ // Procura o nome da Cidade de Origem
                                          out.println("<td bordercolor='#333333'><font size='3'><strong><font color='#000099'>&nbsp;" + Cidades[cont4][1] + "</font></strong></font></td>");
                                          break;
                                      }
                                   }
                              }
                        }

                        for(int cont3=0;cont3<Rotas.length;cont3++){
                              if (Itinerario[cont2][1].equals(Rotas[cont3][0])){ // Procura a Rota para determinar a cidade de Origem
                                  for(int cont4=0;cont4<Cidades.length;cont4++){
                                      if (Rotas[cont3][2].equals(Cidades[cont4][0])){ // Procura o nome da Cidade de Destino
                                          out.println("<td bordercolor='#333333'><font size='3'><strong><font color='#000099'>&nbsp;" + Cidades[cont4][1] + "</font></strong></font></td>");
                                          break;
                                      }
                                   }
                              }
                        }

                        for(int cont3=0;cont3<Empresa.length;cont3++){
                              if (Itinerario[cont1][2].equals(Empresa[cont3][0])){ // Procura a Empresa de Ônibus
                                out.println("<td bordercolor='#333333'><strong><font color='#000099' size='3'>" + Empresa[cont3][1] + "</font></strong></td>");
                                break;
                              }
                        }

                        out.println("<td bordercolor='#333333'><strong> ");
                        out.println("<div align='center'><font color='#000099' size='3'>" + Itinerario[cont1][3] + "</font></div>");
                        out.println("</strong></td>");


                        out.println("<td bordercolor='#333333'><strong> ");
                        out.println("<div align='center'><font color='#000099' size='3'>" + Itinerario[cont1][4] + "</font></div>");
                        out.println("</strong></td>");

                        for(int cont3=0;cont3<TipoOnibus.length;cont3++){
                              if (Itinerario[cont1][5].equals(TipoOnibus[cont3][0])){ // Procura o tipo de ônibus
                                out.println("<td bordercolor='#333333'><strong><font color='#000099' size='3'>" + TipoOnibus[cont3][1] +  "</font></strong></td>");
                                break;
                              }
                        }

                        out.println("<td bordercolor='#333333'><strong><font color='#000099' size='3'>" + Itinerario[cont1][6] + "</font></strong></td>");
                        out.println("<td bordercolor='#333333'><div align='center'><font size='3'><strong><font color='#000099'>" + Qtd + "</font></strong></font></div></td>");
                        out.println("<td bordercolor='#333333'><strong><font color='#000099' size='3'> R$ " +  (double) ( (int) (  ( Double.parseDouble(Itinerario[cont1][7]) * Integer.parseInt(Qtd) ) * 100 )) / 100 + "</font></strong></td>");
                        total=total + Double.parseDouble(Itinerario[cont1][7]) * Integer.parseInt(Qtd);
                        out.println("</tr>");
                    };
                };
        };
        out.println("            <tr> ");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("<td bordercolor='#333333'><strong><font color='#000099' size='3'> Total: </font></strong></td>");
        out.println("<td bordercolor='#333333'><strong><font color='#000099' size='3'> R$ " + (double) ((int) (total * 100) ) /100 + "</font></strong></td>");
        out.println("            </tr>");

        out.println("            <tr> ");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td><p>&nbsp;</p></td>");
        out.println("            </tr>");
        out.println("            <tr> ");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td> &nbsp;&nbsp; </td>");
        out.println("              <td> &nbsp;&nbsp; </td>");
        out.println("              <td><input type='button' name='btnVoltar' value='Voltar' onClick='javascript:history.back(1)'></td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("            </tr>");
        out.println("            </table>");

        out.println("        </td>");
        out.println("    </tr>");
        out.println("		</form>");
        out.println("      </table>");
        out.println("      <p>&nbsp;</p>");
        out.println("      </td>");
        out.println("  </tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    } catch (Exception E) {

        out.println("            <tr> ");
        out.println("              <td colspan='9'><div align='center'><strong><font color='#CC3300' size='6'>Não Existem Passagens Reservadas </font><font color='#CC3300' size='5'><br>");
        out.println("            </tr>");
        out.println("            <tr>");
        out.println("              <td height='20'>&nbsp;</td>");
        out.println("              <td colspan='8'>&nbsp;</td>");
        out.println("            </tr>");
        out.println("            <tr> ");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td> &nbsp;&nbsp; </td>");
        out.println("              <td> &nbsp;&nbsp; </td>");
        out.println("              <td><input type='button' name='btnVoltar' value='Voltar' onClick='javascript:history.back(1)'></td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("              <td>&nbsp;</td>");
        out.println("            </tr>");

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
  };

  public void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    resultado(request, response);
  }
}
