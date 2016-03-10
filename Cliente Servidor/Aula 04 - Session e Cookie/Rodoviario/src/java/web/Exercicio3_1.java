package web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Exercicio3_1 extends HttpServlet {
  // Chave, codigo da Rota, Empresa, Hora Saida, Hora Chegada, Tipo de Onibus, Valor
  private String Itinerario[][] = {{"001","01","1","15:00","20:00","1","R$ 62,50","62.50"},
                                   {"002","02","1","12:00","23:00","2","R$ 88,99","88.99"},
                                   {"003","03","1","08:45","14:45","3","R$ 95,32","95.32"},
                                   {"004","04","2","15:00","20:00","1","R$ 33,44","33.44"},
                                   {"005","05","2","12:00","23:00","2","R$ 75,99","75.99"},
                                   {"006","06","2","08:45","14:45","3","R$ 132,99","132.99"},
                                   {"007","07","3","15:00","20:00","1","R$ 62,33","62.33"},
                                   {"008","08","3","12:00","23:00","2","R$ 32,35","32.35"},
                                   {"009","09","3","08:45","14:45","3","R$ 125,54","125,54"},
                                   {"010","01","2","15:30","20:30","2","R$ 52,50","52.50"},
                                   {"011","01","1","12:00","23:00","2","R$ 88,99","88.99"},
                                   {"012","01","1","08:45","14:45","3","R$ 95,32","95.32"},
                                   {"013","04","2","15:00","20:00","1","R$ 33,44","33.44"},
                                   {"014","05","2","12:00","23:00","2","R$ 75,99","75.99"},
                                   {"015","06","2","08:45","14:45","3","R$ 132,99","132.99"},
                                   {"016","07","3","15:00","20:00","1","R$ 62,33","62.33"},
                                   {"017","08","3","12:00","23:00","2","R$ 32,35","32.35"},
                                   {"018","09","3","08:45","14:45","3","R$ 125,54","125.54"},
                                   {"019","10","2","15:00","20:00","1","R$ 33,44","33.44"},
                                   {"020","10","2","12:00","23:00","2","R$ 75,99","75.99"},
                                   {"021","11","2","08:45","14:45","3","R$ 132,99","132.99"},
                                   {"022","12","3","15:00","20:00","1","R$ 62,33","62.33"},
                                   {"023","13","3","12:00","23:00","2","R$ 32,35","32.35"},
                                   {"024","14","3","08:45","14:45","3","R$ 125,54","125.54"},
                                   {"025","15","2","15:30","20:30","2","R$ 52,50","52.50"},
                                   {"026","16","1","12:00","23:00","2","R$ 88,99","88.99"},
                                   {"027","17","1","08:45","14:45","3","R$ 95,32","95.32"},
                                   {"028","18","2","15:00","20:00","1","R$ 33,44","33.44"},
                                   {"029","19","2","12:00","23:00","2","R$ 75,99","75.99"},
                                   {"030","20","2","08:45","14:45","3","R$ 132,99","132.99"},
                                   {"031","20","3","15:00","20:00","1","R$ 62,33","62.33"},
                                   {"032","20","3","12:00","23:00","2","R$ 32,35","32.35"},
                                   {"033","21","3","08:45","14:45","3","R$ 125,54","125.54"}
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
    HttpSession session = request.getSession();

    String v_origem = "";
    response.setContentType("text/html; charset=iso-8859-1");
    PrintWriter out = response.getWriter();

    out.println("<html>");
    out.println("<head>");

    out.println("<script>");
    out.println("function atualizar(){");
    out.println("document.frmpesquisa.acao.value='ATUALIZAR';");
    out.println("document.frmpesquisa.action='Exercicio3_1';");
    out.println("document.frmpesquisa.submit();");
    out.println("}");

    out.println("function finalizar(){");
    out.println("document.frmpesquisa.action='Exercicio3_1_Finalizar';");
    out.println("document.frmpesquisa.submit();");
    out.println("}");

    out.println("function pesquisar(){");
    out.println("document.frmpesquisa.acao.value='PESQUISAR';");
    out.println("document.frmpesquisa.action='Exercicio3_1';");
    out.println("document.frmpesquisa.submit();");
    out.println("}");
    out.println("</script>");

    out.println("<title>Análise e Desenvolvimento de Sistemas</title>");
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
    out.println("	<form name='frmpesquisa' method='post' action='Exercicio3_1'>");
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
    out.println("                  <td><input type='button' name='btnpesquisar' value='Pesquisar Passagens' onClick='javascript:pesquisar()'>&nbsp;&nbsp;&nbsp;");
    out.println("                    </td>");
    out.println("                  <td> <input type='reset' name='btnlimpar' value='Limpar'>&nbsp; </td>");
    out.println("                  <td><input type='button' name='btnfinalizar' value='Finalizar Compra' onClick='javascript:finalizar()'></td>");
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
    session.setAttribute("Itinerario", Itinerario);
    session.setAttribute("Empresa", Empresa);
    session.setAttribute("TipoOnibus", TipoOnibus);
    session.setAttribute("Rotas", Rotas);
    session.setAttribute("Cidades", Cidades);
  }


   private void resultado(HttpServletRequest request, HttpServletResponse response,
    boolean withErrorMessage)
    throws ServletException, IOException {
    HttpSession session = request.getSession();

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

    out.println("<title>Análise e Desenvolvimento de Sistemas</title>");
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
    out.println("	<form name='frmresultado' method='post' action='Exercicio3_1_Compra'>");
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
    out.println("                  <td width='5%'>&nbsp;</td>");
    out.println("                  <td width='16%'>&nbsp;</td>");
    out.println("                  <td width='10%'>&nbsp;</td>");
    out.println("                  <td width='10%'>&nbsp;</td>");
    out.println("                  <td width='12%'>&nbsp;</td>");
    out.println("                  <td width='20%'>&nbsp;</td>");
    out.println("                  <td width='20%'>&nbsp;</td>");
    out.println("                </tr>");
    out.println("                <tr> ");
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td colspan='2'><div align='left'><strong><font color='#CC3300' size='4'>Origem:&nbsp"+ Cidades[Integer.parseInt(request.getParameter("origem"))-1][1] +"</font></strong></div></td>");
    out.println("                  <td colspan='2' width='23%'><div align='left'><strong><font color='#CC3300' size='4'>Destino:&nbsp"+ Cidades[Integer.parseInt(request.getParameter("destino"))-1][1] +"</font></strong></div></td>");
    out.println("                  <td width='20%'>&nbsp;</td>");
    out.println("                  <td width='10%'>&nbsp;</td>");
    out.println("                </tr>");
    out.println("                <tr>");
    out.println("                  <td>&nbsp;</td>");
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
    out.println("                  <td><div align='center'><strong><font color='#000099' size='5'>Sa&iacute;da</font></strong></div></td>");
    out.println("                  <td><div align='center'><strong><font color='#000099' size='5'>Chegada</font></strong></div></td>");
    out.println("                  <td><strong><font color='#000099' size='5'>Valor</font></strong></td>");
    out.println("                  <td><strong><font color='#000099' size='5'>Tipo de &Ocirc;nibus</font></strong></td>");
    out.println("                  <td><strong><font color='#000099' size='5'>Qtd.</font></strong></td>");
    out.println("                </tr>");
    for(int cont=0;cont<Itinerario.length;cont++){
          if (Cod_Rota.equals(Itinerario[cont][1])){ // Procura a posição na matriz do Itinerario
              out.println("<tr> ");
              out.println("<td>&nbsp;</td>");
              for(int cont2=0;cont2<Empresa.length;cont2++){
                    if (Itinerario[cont][2].equals(Empresa[cont2][0])){ // Procura a Empresa de Ônibus
                      out.println("<td><strong><font color='#000099' size='4'>" + Empresa[cont2][1] +  "</font></strong></td>");
                      break;
                    }
              }
              out.println("<td><strong><div align='center'><font color='#000099' size='4'>" + Itinerario[cont][3] +  "</font></div></strong></td>");
              out.println("<td><strong><div align='center'><font color='#000099' size='4'>" + Itinerario[cont][4] +  "</font></div></strong></td>");
              out.println("<td><strong><font color='#000099' size='4'>" + Itinerario[cont][6] +  "</font></strong></td>");
              for(int cont3=0;cont3<TipoOnibus.length;cont3++){
                    if (Itinerario[cont][5].equals(TipoOnibus[cont3][0])){ // Procura o tipo de ônibus
                      out.println("<td><strong><font color='#000099' size='4'>" + TipoOnibus[cont3][1] +  "</font></strong></td>");
                      break;
                    }
              }

              String qtd = "''";
/*              for(int cont2=0;cont2<Pedido.length;cont2++){*/

              Cookie[] cookies = request.getCookies();
              for (int cont2 = 0; cont2 < cookies.length; cont2++) {
                    Cookie esteCookie = cookies[cont2];

                    String Cod_Itinerario = esteCookie.getName();
                    String Qtd_Itinerario = esteCookie.getValue();
                    if (Itinerario[cont][0].equals(Cod_Itinerario)){ // Procura o Itinerario no Pedido
                        if (!Qtd_Itinerario.equals("")) {
                           qtd = Qtd_Itinerario;
                        }
                        break;
                    }
              }
              out.println("<td><input name='txt_passagens' value=" + qtd + " type='text' size='2' maxlength='2'></td>");
              out.println("<td><input name='txt_passagenscod' value=" + Itinerario[cont][0] + " type='hidden' size='2' maxlength='2'></td>");
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
    out.println("                  <td>&nbsp;</td>");
    out.println("                  <td><input name='btn_comprar' type='submit' id='btn_comprar' value='Comprar'></td>");
    out.println("                  <td><input type='button' name='btnvoltar' value='Voltar' onClick='javascript:history.back(1)'></td>");
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
    session.setAttribute("Itinerario", Itinerario);
    session.setAttribute("Empresa", Empresa);
    session.setAttribute("TipoOnibus", TipoOnibus);
    session.setAttribute("Rotas", Rotas);
    session.setAttribute("Cidades", Cidades);
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
