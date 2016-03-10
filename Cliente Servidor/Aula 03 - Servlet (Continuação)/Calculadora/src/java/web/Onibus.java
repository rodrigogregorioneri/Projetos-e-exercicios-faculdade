package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;


public class Onibus extends HttpServlet {
    private String cidades[]={"Araraquara","Bertioga","Caraguatatuba","Natal","Belém","Santarém","Belo Horizonte","Óbidos"};


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter	out=response.getWriter();
            out.println("<FORM METHOD=POST ACTION='Onibus'>");

            for (int j=0;j<2;j++)
            {	out.println("<SELECT NAME='OPCOES"+j+"'>");
                    for (int i=0;i<cidades.length;i++)
                            out.println("<OPTION VALUE="+i+">"+cidades[i]+"</OPTION>");
                    out.println("</SELECT>");
            }
            out.println("Quantidade: <INPUT TYPE='TEXT' SIZE=2 NAME='QTD'>");
            out.println("<INPUT TYPE='SUBMIT'>");
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String origem = request.getParameter("OPCOES0");
            String destino = request.getParameter("OPCOES1");
            if (origem.equals(destino))
            {
              RequestDispatcher rd = request.getRequestDispatcher("OnibusErro");
              rd.forward(request, response);
                  return;
            }
            else {
              Comprar(request, response);
            }
    }

     private void Comprar(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
            String origem = rq.getParameter("OPCOES0");
            String destino = rq.getParameter("OPCOES1");
            rs.setContentType("text/html");
            PrintWriter out = rs.getWriter();
            out.println("<HTML>");
            out.println("<HEAD>");
            out.println("<TITLE>Finalizando Compra</TITLE>");
            out.println("</HEAD>");
            out.println("<BODY>");

            out.println("<BR>");
            out.println("<BR>Você comprou " + rq.getParameter("QTD") + " Passagens de: " +
                cidades[Integer.parseInt(origem)] + ", com destino a: " + cidades[Integer.parseInt(destino)]);
            out.println("<input type='button' name='btnvoltar' value='Voltar' onClick='javascript:history.back(1)'>");
            out.println("</BODY>");
            out.println("</HTML>");
    }


}
