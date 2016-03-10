package web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Passagens extends HttpServlet {
  // Descrição do Itinerario
  // codigo da Rota, Empresa, Hora Saida, Hora Chegada, Tipo de Onibus, Valor
  private String Itinerario[][] = {{"01","1","15:00","20:00","1","R$ 62,50"},
                                   {"02","1","12:00","23:00","2","R$ 88,99"},
                                   {"03","1","08:45","14:45","3","R$ 95,32"},
                                   {"04","2","15:00","20:00","1","R$ 33,44"},
                                   {"05","2","12:00","23:00","2","R$ 75,99"},
                                   {"06","2","08:45","14:45","3","R$ 132,99"},
                                   {"07","3","15:00","20:00","1","R$ 62,33"},
                                   {"08","3","12:00","23:00","2","R$ 32,35"},
                                   {"09","3","08:45","14:45","3","R$ 125,54"},
                                   {"01","2","15:30","20:30","2","R$ 52,50"},
                                   {"01","1","12:00","23:00","2","R$ 88,99"},
                                   {"01","1","08:45","14:45","3","R$ 95,32"},
                                   {"04","2","15:00","20:00","1","R$ 33,44"},
                                   {"05","2","12:00","23:00","2","R$ 75,99"},
                                   {"06","2","08:45","14:45","3","R$ 132,99"},
                                   {"07","3","15:00","20:00","1","R$ 62,33"},
                                   {"08","3","12:00","23:00","2","R$ 32,35"},
                                   {"09","3","08:45","14:45","3","R$ 125,54"},
                                   {"10","2","15:00","20:00","1","R$ 33,44"},
                                   {"10","2","12:00","23:00","2","R$ 75,99"},
                                   {"11","2","08:45","14:45","3","R$ 132,99"},
                                   {"12","3","15:00","20:00","1","R$ 62,33"},
                                   {"13","3","12:00","23:00","2","R$ 32,35"},
                                   {"14","3","08:45","14:45","3","R$ 125,54"},
                                   {"15","2","15:30","20:30","2","R$ 52,50"},
                                   {"16","1","12:00","23:00","2","R$ 88,99"},
                                   {"17","1","08:45","14:45","3","R$ 95,32"},
                                   {"18","2","15:00","20:00","1","R$ 33,44"},
                                   {"19","2","12:00","23:00","2","R$ 75,99"},
                                   {"20","2","08:45","14:45","3","R$ 132,99"},
                                   {"20","3","15:00","20:00","1","R$ 62,33"},
                                   {"20","3","12:00","23:00","2","R$ 32,35"},
                                   {"21","3","08:45","14:45","3","R$ 125,54"}
                                  };

  private String Empresa[][] = {{"1","Itapemirim"},
                                {"2","Cometa"},
                                {"3","Santa Rita"}
                               };

  private String TipoOnibus[][] = {{"1","Leito"},
                                   {"2","Convencional"},
                                   {"3","Luxo"}
                                  };

  private String Rotas[][] = {{"01","1","2"},
                              {"02","1","3"},
                              {"03","1","4"},
                              {"04","1","5"},
                              {"05","1","6"},
                              {"06","1","7"},
                              {"07","1","8"},
                              {"08","1","9"},
                              {"09","2","1"},
                              {"10","2","3"},
                              {"11","2","4"},
                              {"12","9","2"},
                              {"13","9","3"},
                              {"14","9","4"},
                              {"15","3","2"},
                              {"16","3","1"},
                              {"17","3","7"},
                              {"18","3","8"},
                              {"19","4","9"},
                              {"20","4","3"},
                              {"21","4","5"},
                              {"22","5","6"},
                              {"23","5","7"},
                              {"24","6","7"},
                              {"25","7","9"},
                              {"26","7","4"},
                              {"27","7","3"},
                              {"28","8","2"},
                              {"29","8","1"},
                              {"30","8","2"}
                             };

  private String Cidades[][] = {{"1","São Paulo"},
                                {"2","Rio de Janeiro"},
                                {"3","Espirito Santo"},
                                {"4","Rio Grande do Sul"},
                                {"5","Paraná"},
                                {"6","Santa Catarina"},
                                {"7","Minas Gerais"},
                                {"8","Goiás"},
                                {"9","Brasília"}
                               };

  private void fazerpesquisa(HttpServletRequest request, HttpServletResponse response,
    boolean withErrorMessage)
    throws ServletException, IOException {

    String v_origem = "";
    response.setContentType("text/html; charset=iso-8859-1");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");

    out.println("<script>");
    out.println("function atualizar(){");
    out.println("document.frmpesquisa.acao.value='ATUALIZAR';");
    out.println("document.frmpesquisa.submit();");
    out.println("}");

    out.println("function pesquisar(){");
    out.println("document.frmpesquisa.acao.value='PESQUISAR';");
    out.println("document.frmpesquisa.submit();");
    out.println("}");
    out.println("</script>");

    out.println("<title>Passagens</title>");
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
    out.println("                <td width='36%' height='19'><strong><font color='#FFFFFF' size='4'><br>Análise e Desenvolvimento de Sistemas<br>");
    out.println("                  <br>");
    out.println("                  </font></strong></td>");
    out.println("                <td width='35%'><div align='center'><font color='#FFFFFF' size='5' face='Verdana, Arial, Helvetica, sans-serif'><strong>Universidade Cruzeiro do Sul</strong></font></div></td>");
    out.println("                <td width='29%'><div align='right'><font color='#FFFFFF' size='4' face='Verdana, Arial, Helvetica, sans-serif'><strong>Cliente/Servidor</strong></font></div></td>");
    out.println("              </tr>");
    out.println("            </table>");
    out.println("            </td>");
    out.println("        </tr>");
    out.println("	<form name='frmpesquisa' method='post' action='Passagens'>");
    out.println("	<input type='hidden' name='acao' value='" + request.getParameter("acao") + "'>");
    out.println("        <tr> ");
    out.println("          <td>");
    out.println("		<table width='100%' border='0' cellspacing='0' cellpadding='0'>");
    out.println("                <tr> ");
    out.println("                  <td colspan='5'><div align='center'><strong><font color='#CC3300' size='6'>Sistema ");
    out.println("                      para Busca de Passagens</font><font color='#CC3300' size='5'><br>");
    out.println("                      <br>");
    out.println("                      <br>");
    out.println("                      </font></strong></div></td>");
    out.println("                </tr>");
    out.println("                <tr> ");
    out.println("                  <td width='0%'>&nbsp;</td>");
    out.println("                  <td width='31%'><div align='right'><strong><font color='#CC3300' size='5'>Origem:</font></strong></div></td>");

    v_origem = request.getParameter("origem");
    if (v_origem == null){
       v_origem=Cidades[0][0];
    }
    out.println("                  <td width='17%'><select name='origem' onChange='javascript:atualizar()'>");
    for(int cont=0;cont<Cidades.length;cont++){
        out.println("<option value='" + Cidades[cont][0] + "'" + ((Cidades[cont][0].equals(v_origem))?"selected":"") + ">" +
                     Cidades[cont][1] + "</option>");
    }

    out.println("                    </select></td>");
    out.println("                  <td width='10%'><div align='right'><strong><font color='#CC3300' size='5'>Destino:</font></strong></div></td>");
    out.println("                  <td width='42%'><select name='destino' onChange=''>");
    int vtotcid = 0;
    for(int cont=0;cont<Rotas.length;cont++){
          if (v_origem.equals(Rotas[cont][1])){ // Código de origem
             for(int cont2=0;cont2<Cidades.length;cont2++){
                if (Rotas[cont][2].equals(Cidades[cont2][0])){ // Código de destino
                    out.println("                      <option value='" +
                                  Cidades[cont2][0] + "'>" +
                                  Cidades[cont2][1] + "</option>");
                    vtotcid ++;
                    break;
                }
             }
          }
    }
    if (vtotcid == 0){
       out.println("<option value=''>Não existem passagens partindo desta cidade</option>");
    }
    out.println("                    </select></td>");
    out.println("                </tr>");
    out.println("                <tr> ");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                </tr>");
    out.println("                <tr>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                </tr>");
    out.println("                <tr>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td><p>&nbsp;</p></td>");
    out.println("                </tr>");
    out.println("                <tr> ");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td><input type='button' name='btnpesquisar' value='Pesquisar' onClick='javascript:pesquisar()'>");
    out.println("                    &nbsp;&nbsp; ");
    out.println("                    <input type='reset' name='btnlimpar' value='Limpar'></td>");
    out.println("                  <td> &nbsp;&nbsp; </td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                </tr>");
    out.println("              </table>");
    out.println("            <p>&nbsp;</p>");
    out.println("              <p><br>");
    out.println("                <br>");
    out.println("                <br>");
    out.println("                <br>");
    out.println("              </p>");
    out.println("            <p>&nbsp;</p></td>");
    out.println("        </tr>");
    out.println("		</form>");
    out.println("      </table>");
    out.println("      <p>&nbsp;</p>");
    out.println("      </td>");
    out.println("  </tr>");
    out.println("</table>");
    out.println("</body>");
    out.println("</html>");
  }


  private void resultado(HttpServletRequest request, HttpServletResponse response,
    boolean withErrorMessage)
    throws ServletException, IOException {

    String Cid_origem = request.getParameter("origem");
    String Cid_destino = request.getParameter("destino");
    String Cod_Rota = "";

    for(int cont=0;cont<Rotas.length;cont++){
          if (Cid_origem.equals(Rotas[cont][1]) && Cid_destino.equals(Rotas[cont][2]) ){ // Código de origem  e Destino
              Cod_Rota = Rotas[cont][0];
          }
    }

    response.setContentType("text/html; charset=iso-8859-1");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");

    out.println("<title>Passagens</title>");
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
    out.println("                <td width='36%' height='19'><strong><font color='#FFFFFF' size='4'><br>Análise e Desenvolvimento de Sistemas<br>");
    out.println("                  <br>");
    out.println("                  </font></strong></td>");
    out.println("                <td width='35%'><div align='center'><font color='#FFFFFF' size='5' face='Verdana, Arial, Helvetica, sans-serif'><strong>Universidade Cruzeiro do Sul</strong></font></div></td>");
    out.println("                <td width='29%'><div align='right'><font color='#FFFFFF' size='4' face='Verdana, Arial, Helvetica, sans-serif'><strong>Cliente/Servidor</strong></font></div></td>");
    out.println("              </tr>");
    out.println("            </table>");
    out.println("            </td>");
    out.println("        </tr>");
    out.println("	<form name='frmresultado' method='post' action='Passagens'>");
    out.println("	<input type='hidden' name='acao' value='" + request.getParameter("acao") + "'>");
    out.println("        <tr> ");
    out.println("          <td>");
    out.println("              <table width='100%' border='0' cellspacing='0' cellpadding='0'>");
    out.println("                <tr> ");
    out.println("                  <td colspan='6'><div align='center'><strong><font color='#CC3300' size='6'>Sistema ");
    out.println("                      para Busca de Passagens</font><font color='#CC3300' size='5'><br>");
    out.println("                      <br>");
    out.println("                      </font></strong></div></td>");
    out.println("                </tr>");
    out.println("                <tr> ");
    out.println("                  <td width='4%' height='20'>&nbsp;</td>");
    out.println("                  <td colspan='5'><div align='center'><strong><font color='#006600' size='6'>PASSAGENS ");
    out.println("                      DISPON&Iacute;VEIS</font></strong></div></td>");
    out.println("                </tr>");
    out.println("                <tr>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                </tr>");
    out.println("                <tr> ");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td width='20%'>&nbsp;</td>");
    out.println("                  <td><div align='right'><strong><font color='#000099' size='4'>Origem:&nbsp"+ Cidades[Integer.parseInt(request.getParameter("origem"))-1][1] +"</font></strong></div></td>");
    out.println("                  <td width='23%'><div align='right'><strong><font color='#000099' size='4'>Destino:&nbsp"+ Cidades[Integer.parseInt(request.getParameter("destino"))-1][1] +"</font></strong></div></td>");
    out.println("                  <td width='14%'>&nbsp;</td>");
    out.println("                  <td width='20%'>&nbsp;</td>");
    out.println("                </tr>");
    out.println("                <tr>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                </tr>");
    out.println("                <tr> ");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td><strong><font color='#000099' size='5'>Empresa</font></strong></td>");
    out.println("                  <td><strong><font color='#000099' size='5'>Horario de Sa&iacute;da</font></strong></td>");
    out.println("                  <td><strong><font color='#000099' size='5'>Hor&aacute;rio de Chegada</font></strong></td>");
    out.println("                  <td><strong><font color='#000099' size='5'>Valor</font></strong></td>");
    out.println("                  <td><strong><font color='#000099' size='5'>Tipo de &Ocirc;nibus</font></strong></td>");
    out.println("                </tr>");
    for(int cont=0;cont<Itinerario.length;cont++){
          if (Cod_Rota.equals(Itinerario[cont][0])){ // Procura a posição na matriz do Itinerario
              out.println("<tr> ");
              out.println("<td>&nbsp;</td>");
              for(int cont2=0;cont2<Empresa.length;cont2++){
                    if (Itinerario[cont][1].equals(Empresa[cont2][0])){ // Procura a Empresa de Ônibus
                      out.println("<td><strong><font color='#000099' size='4'>" + Empresa[cont2][1] +  "</font></strong></td>");
                      break;
                    }
              }
              out.println("<td><strong><div align='center'><font color='#000099' size='4'>" + Itinerario[cont][2] +  "</font></div></strong></td>");
              out.println("<td><strong><div align='center'><font color='#000099' size='4'>" + Itinerario[cont][3] +  "</font></div></strong></td>");
              out.println("<td><strong><font color='#000099' size='4'>" + Itinerario[cont][5] +  "</font></strong></td>");
              for(int cont3=0;cont3<TipoOnibus.length;cont3++){
                    if (Itinerario[cont][4].equals(TipoOnibus[cont3][0])){ // Procura o tipo de ônibus
                      out.println("<td><strong><font color='#000099' size='4'>" + TipoOnibus[cont3][1] +  "</font></strong></td>");
                      break;
                    }
              }
              out.println("</tr>");
          }
    }
    out.println("                <tr> ");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                </tr>");
    out.println("                </tr>");
    out.println("                <tr> ");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td> &nbsp;&nbsp; </td>");
    out.println("                  <td><input type='button' name='btnvoltar' value='Voltar' onClick='javascript:history.back(1)'></td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td>&nbsp;</td>");
    out.println("                </tr>");
    out.println("              </table>");
    out.println("            <p>&nbsp;</p>");
    out.println("              <p><br>");
    out.println("                <br>");
    out.println("                <br>");
    out.println("                <br>");
    out.println("              </p>");
    out.println("            <p>&nbsp;</p></td>");
    out.println("        </tr>");
    out.println("		</form>");
    out.println("      </table>");
    out.println("      <p>&nbsp;</p>");
    out.println("      </td>");
    out.println("  </tr>");
    out.println("</table>");
    out.println("</body>");
    out.println("</html>");
  }

  public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    fazerpesquisa(request, response, false);
  }

  public void doPost(HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    String acao = request.getParameter("acao");
    if (acao!=null && acao.equals("ATUALIZAR")) {
      fazerpesquisa(request, response, true);
    }else{ // PESQUISAR
      resultado(request, response, true);
    }
  }
}
