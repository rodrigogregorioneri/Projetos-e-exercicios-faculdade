package calculadora;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Exemplo02 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                try (PrintWriter out = response.getWriter()) {
            out.println("<HTML>");
            out.println("<HEAD>");
            out.println("<TITLE>Método GET</TITLE>");
            out.println("</HEAD>");
            out.println("<BODY>");
            out.println("O servlet recebeu um GET. " +
                        "Agora, clique no botão abaixo.");
            out.println("<BR>");
            out.println("<FORM METHOD=POST>");
            out.println("<INPUT TYPE=SUBMIT VALUE=Submit>");
            out.println("</FORM>");
            out.println("</BODY>");
            out.println("</HTML>");
        }
    }

     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            out.println("<HTML>");
            out.println("<HEAD>");
            out.println("<TITLE>Método POST</TITLE>");
            out.println("</HEAD>");
            out.println("<BODY>");
            out.println("O servlet recebeu um POST.");
            out.println("</BODY>");
            out.println("</HTML>");
        }
    }
}
