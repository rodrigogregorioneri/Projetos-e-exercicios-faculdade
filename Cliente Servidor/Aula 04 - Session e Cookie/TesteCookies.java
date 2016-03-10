
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class TesteCookies extends HttpServlet {

    public void doGet(HttpServletRequest solicitacao,
            HttpServletResponse resposta) throws IOException, ServletException {

        resposta.setContentType("text/html");
        PrintWriter out = resposta.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<center>");
        out.println("<h1>Insira os dados para a criação do cookie</h1>");
        out.println("</center>");
        out.println("<table border='0' width='400'>");
        out.println("<tr>");
        out.println("<td>");
        out.println("<form method='post' action='ExemploCookies'>");
        out.println("<font face='verdana' size='2'>");
        out.println("Nome do cookie:&nbsp;&nbsp;&nbsp;< / font >        ");
        out.println("<input type='text' name='nome' size =        '20'>");
        out.println("<br>");
        out.println("<font face='verdana' size='2'>");
        out.println("Valor do cookie:&nbsp;&nbsp;&nbsp;&nbsp;< / font >        ");
        out.println("<input type='text' name='valor' size ='20'><br >        ");
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td align='center'>");
        out.println("<input type='submit' value='Criar' name =        'S1'>");
        out.println("&nbsp;");
        out.println("<input type='reset' value='Limpar' name =        'S2'>");
        out.println("</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");

    }
}
