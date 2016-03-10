import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.*; 
import javax.servlet.http.*;
import java.util.*;

public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            response.setContentType("text/html");
            String title = "Exemplo do objeto HttpSession";
            HttpSession session = request.getSession();
            String heading;
            Integer cont = (Integer) session.getAttribute("contador");
            if (cont == null) {
                cont = new Integer(1);
                heading = "Bem-vindo,novato";
            } else {
                cont = new Integer(cont.intValue() + 1);
                heading = "Bem-vindo de novo!";
            }
            session.setAttribute("contador", cont);
            out.println("<html><head>" + title + "</head>"
                    + "<BODY BGCOLOR=\"#FDF5E6\">\n"
                    + "<H1 ALIGN=\"CENTER\">" + heading
                    + "</H1>\n"
                    + "<H2>Informações sobre sua sessão:</H2>\n"
                    + "<TABLE BORDER=1 ALIGN=\"CENTER\">\n"
                    + "<TR BGCOLOR=\"#FFAD00\">\n"
                    + "  <TH>Tipo de Informação<TH>Valor \n"
                    + "<TR>\n"
                    + "  <TD>ID\n" + "  <TD>" + session.getId()
                    + "\n"
                    + "<TR>\n" + "  <TD>Creation Time\n"
                    + "  <TD>" + new Date(session.getCreationTime())
                    + "\n"
                    + "<TR>\n"
                    + "  <TD>Último acesso:\n"
                    + "  <TD>" + new Date(session.getLastAccessedTime()) + "\n"
                    + "<TR>\n"
                    + "  <TD>Qtde. de Acessos: \n"
                    + "  <TD>" + cont.intValue() + "\n"
                    + "</TABLE>\n"
                    + "</BODY></html>");
        }
    }

    @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
