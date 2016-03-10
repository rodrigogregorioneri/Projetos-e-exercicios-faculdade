package br.com.Controle;

import br.com.Modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RemoverAutores extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession(true);
            //se for uma nova sessão, reescreve a URL do cliente
            if (session.isNew()) {
                //obtem a URL
                String incomingURL = request.getRequestURL().toString();
                //codifica a URL e adiciona o ID da sessão do cliente
                String URLwithID = response.encodeURL(incomingURL);
                //devolve o cabeçalho para o cliente
                response.setHeader("Custom-newURL", URLwithID);
            }
            int  id = Integer.parseInt(request.getParameter("id"));
            Autores autores = new Autores(id);
            AutoresDAO autoresDAO = new AutoresDAO();
            autoresDAO.excluiAutores(autores);
            String url = "/OK.jsp";
            ServletContext sc = getServletContext();
            RequestDispatcher rd = sc.getRequestDispatcher(url);
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
            String url = "/Erro.jsp";
            ServletContext sc = getServletContext();
            RequestDispatcher rd = sc.getRequestDispatcher(url);
            rd.forward(request, response);
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
    }

}
