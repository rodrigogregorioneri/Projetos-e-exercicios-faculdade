package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GetAtributo extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Compartilha Dados</title></head><body>");

        out.println ("GetAtributo (Usuário): " + request.getAttribute("usuario")+"<br>");
        out.println ("GetAtributo (Senha): " + request.getAttribute("senha")+"<br>");
        
        request.setAttribute ("senha", "SenhaMudada");
        
        out.println ("<br>");
        out.println ("<br>");
        out.println ("GetAtributo (Usuário): " + request.getAttribute("usuario")+"<br>");
        out.println ("GetAtributo (Senha): " + request.getAttribute("senha")+"<br>");

        out.println("</body></html>");
    }


    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    

}
