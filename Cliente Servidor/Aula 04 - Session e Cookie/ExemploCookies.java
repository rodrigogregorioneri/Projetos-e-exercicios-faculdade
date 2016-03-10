
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ExemploCookies extends HttpServlet {

    public void doPost(HttpServletRequest solicitacao,
            HttpServletResponse resposta) throws IOException, ServletException {

        String nome = solicitacao.getParameter("nome");
        String valor = solicitacao.getParameter("valor");

        Cookie cookie = new Cookie(nome, valor);

        resposta.setContentType("text/html");
        PrintWriter out = resposta.getWriter();

        if (nome.length() == 0 || valor.length() == 0) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet para criação de cookies</title>");
            out.println("<meta http-equiv='refresh' content='4; url=javascript:window.history.go(-1);'>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1>Preencha todos os campos!</h1>");
            out.println("</center>");
            out.println("</body>");
            out.println("</html>");
        } else {
            resposta.addCookie(cookie);
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet para criação de cookies</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<center>");
            out.println("<h1>Parabéns!</br>Você acabou de criar um novo cookie</h1>");
            out.println("</center>");
            out.println("<p>");
            try {
                Cookie[] cookies = solicitacao.getCookies();
                for (int i = 0; i < cookies.length; i++) {
                    Cookie esteCookie = cookies[i];
                    out.println("<br>");
                    out.println("<font face='verdana' size='2'>");
                    out.print("O " + (i + 1) + "º cookie da lista é <b>" + esteCookie);
                    out.println("</b>");
                    out.println("</font>");
                }
                out.println("<p><hr>");
                out.println("<table border='1'>");
                out.println("<tr>");
                out.println("<td colspan='3' align='center'>");
                out.println("<font face='verdana' size='4'>");
                out.println("<b>");
                out.println("Dados dos cookies armazenados");
                out.println("</b>");
                out.println("</font>");
                out.println("</td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td width='50'>&nbsp;</td>");
                out.println("<td align='center'><font face='verdana' size='2'><b>Nome do cookie</b></font></td>");
                out.println("<td align='center'><font face='verdana' size='2'><b>Valor do cookie</b></font></td>");
                out.println("</tr>");
                for (int i = 0; i < cookies.length; i++) {
                    Cookie esteCookie = cookies[i];
                    out.println("<tr>");
                    out.println("<td width='50' align='center'><font face='verdana size='2'>");
                    out.println(i + 1);
                    out.println("º</font></td>");
                    out.println("<td><font face='verdana size='2'>");
                    out.println(esteCookie.getName());
                    out.println("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font></td>");
                    out.println("<td><font face='verdana size='2'>");
                    out.println(esteCookie.getValue());
                    out.println("</font></td>");
                    out.println("</tr>");
                }
                out.println("</table>");
            } catch (Exception E) {
                out.println("<Não há cookies>");
            }
            out.println("<p>");
            out.print("<a href='javascript:history.back(-1)'>Voltar</a>&nbsp;");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
