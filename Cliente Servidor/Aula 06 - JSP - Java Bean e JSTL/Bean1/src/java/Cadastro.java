import java.io.*;
import java.net.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import beans.Alunos;

public class Cadastro extends HttpServlet {
	ArrayList relacao = new ArrayList();

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	    if (req.getParameter("acao").equals("CADASTRAR"))
	    	cadastrar(req, res);
	    else
	    	listar(req, res);

	}

  	private void cadastrar(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		Alunos alunos = new Alunos();

		alunos.setRgm(req.getParameter("rgm"));
                alunos.setNome(req.getParameter("nome"));
		relacao.add(alunos);
		RequestDispatcher rd = req.getRequestDispatcher("/Cadastrado.html");
                rd.forward(req, res);
  	}

  	private void listar(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	   	req.setAttribute("relacao",relacao);
	   	RequestDispatcher rd = req.getRequestDispatcher("/RelacaoAlunos.jsp");
	   	rd.forward(req, res);
	   	//request.getRequestDispatcher("../JSP3/RelacaoAlunos.jsp").forward(request,response);
  	}
}

