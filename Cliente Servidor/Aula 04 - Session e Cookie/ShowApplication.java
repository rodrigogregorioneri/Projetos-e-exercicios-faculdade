import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import java.io.*;

public class ShowApplication extends HttpServlet {
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
                    throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Exemplo do objeto HttpSession";
        String title2 = "Exemplo do objeto Application";
        HttpSession session = request.getSession();
        String heading, heading2;
        Integer cont1 = (Integer) session.getAttribute("contador1");
        Integer cont2 = (Integer) getServletContext().getAttribute("contador2");
        if (cont1 == null) {
            cont1 = new Integer(1);
            heading = "Bem-vindo,novato";
        } else {
            cont1 = new Integer(cont1.intValue() + 1);
            heading = "Bem-vindo de novo!";
        }

        if (cont2 == null) {
            cont2 = new Integer(1);
            heading2 = "Bem-vindo,novato";
        } else {
            cont2 = new Integer(cont2.intValue() + 1);
            heading2 = "Bem-vindo de novo!";
        }


        session.setAttribute("contador1", cont1);
        getServletContext().setAttribute("contador2", cont2);
        out.println("<html><head>" + title + "</head>" +
           "<BODY BGCOLOR=\"#FDF5E6\">\n" + "<H1 ALIGN=\"CENTER\">" + heading +
               "</H1>\n" + "<H2>Informações sobre sua sessão:</H2>\n" +
                 "<TABLE BORDER=1 ALIGN=\"CENTER\">\n" + "<TR BGCOLOR=\"#FFAD00\">\n" +
                 "  <TH>Tipo de Informação<TH>Valor \n" + "<TR>\n" +
                 "  <TD>ID\n" +  "  <TD>" + session.getId() + "\n" +
                 "<TR>\n" +  "  <TD>Creation Time\n" + "  <TD>" +  
                 new Date(session.getCreationTime()) + "\n" + "<TR>\n" +
                 "  <TD>Último acesso:\n" + "  <TD>" +   new
                 Date(session.getLastAccessedTime()) + "\n"
                 + "<TR>\n" + "  <TD>Qtde. de Acessos: \n" +
                 "  <TD>" + cont1.intValue() + "\n" + "</TABLE>\n");
        
        out.println("<br><br><br><br>" + title2 + 
               "<BODY BGCOLOR=\"#FDF5E6\">\n" + "<H1 ALIGN=\"CENTER\">" + heading2 +
               "</H1>\n" + "<H2>Informações sobre sua sessão:</H2>\n" +
                 "<TABLE BORDER=1 ALIGN=\"CENTER\">\n" + "<TR BGCOLOR=\"#FFAD00\">\n" +
                 "  <TH>Tipo de Informação<TH>Valor \n" + 
                 "\n" + "<TR>\n" + "  <TD>Qtde. de Acessos: \n" +
                 "  <TD>" + cont2.intValue() + "\n" + "</TABLE>\n" +
                 "</BODY></html>");
    }
}
