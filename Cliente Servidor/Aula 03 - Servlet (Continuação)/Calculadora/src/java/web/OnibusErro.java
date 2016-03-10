package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OnibusErro extends HttpServlet {

    private String cidades[] = {"Araraquara", "Bertioga", "Caraguatatuba", "Natal", "Belém", "Santarém", "Belo Horizonte", "Óbidos"};

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String origem = request.getParameter("OPCOES0");
        String destino = request.getParameter("OPCOES1");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD>");
        out.println("<TITLE>Pagina de erro</TITLE>");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("<H1 style='font-face:arial; color:blue'>As cidades de origem "
                + cidades[Integer.parseInt(origem)] + " e destino nao podem ser iguais!!!!</H1>");
        out.println("</BODY>");
        out.println("</HTML>");
    }

}
