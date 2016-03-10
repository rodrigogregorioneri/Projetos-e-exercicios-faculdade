package exemplo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Controlador de operacoes do cadastro de alunos e emails. 
 */
public class ControladorCadastro extends HttpServlet {
	
	private CadastroIF cadastro;
	
	public void init() {
		cadastro = new CadastroAlunoEmail();
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		processRequest(request, response);
	}
	
	/* (non-Javadoc)
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {
		processRequest(request, response);
	}

	/**
	 * Processa requisicoes redirecionando o request para o metodo especifico.
	 * @param request Requisicao web.
	 * @throws IOException Lancada pelo servlet.
	 * @throws ServletException Lancada pelo servlet. 
	 */
	public void processRequest( HttpServletRequest request, HttpServletResponse 
	response ) throws ServletException, IOException {
		
		String jsp = null;
		
		try {
			
	        // encaminha o request para o metodo que sabe trata-la
	        if ( request.getRequestURI().endsWith( "cadastrarAluno" ) )
	            jsp = cadastraAluno( request );
	        
	        else if ( request.getRequestURI().endsWith( "removerAluno" ) )
	            jsp = removeAluno( request );
	        
	        else if ( request.getRequestURI().endsWith( "listarAlunos" ) )
	        	jsp = listaAlunos( request );
	        
		} catch ( CadastroException e ) {
			jsp = redirecionaPaginaErro( e.getMessage(), request );
		} catch ( Exception e ) {
			e.printStackTrace();
			jsp = redirecionaPaginaErro( "Problemas técnicos.", request );
		}
		
        // caso a operacao nao seja tratada devidamente envia a resposta para a pagina de erro. 
        if ( jsp == null ) {
        	jsp = redirecionaPaginaErro( "Página não encontrada !", request );
        } 

        request.getRequestDispatcher( jsp ).forward( request, response );
	}

	private String cadastraAluno( HttpServletRequest request ) 
	throws CadastroException {
		
		/* get parametros da requisicao */
		String nome = request.getParameter( "nome" );
		String email = request.getParameter( "email" );
		
		/* cadastra */
		cadastro.cadastra( nome, email );
		
		/*  put lista ordenada de alunos da sessao */
		List listaOrdenadaDeAlunos = getColecaoOrdenada( cadastro.getValores() );
		request.getSession().setAttribute( "alunos", listaOrdenadaDeAlunos );
		
		/* envia resposta para a pagina */
		return "listaAlunos.jsp";
	}

	private String removeAluno( HttpServletRequest request ) 
	throws CadastroException {

		/* get parametros da requisicao */
		String nome = request.getParameter( "nome" );

		/* remove do cadastro */
		cadastro.remove( nome );
		
		/*  put lista ordenada de alunos da sessao */
		List listaOrdenadaDeAlunos = getColecaoOrdenada( cadastro.getValores() );
		request.getSession().setAttribute( "alunos", listaOrdenadaDeAlunos );
		
		/* envia resposta para a pagina */
		return "listaAlunos.jsp";
	}
	
	private String listaAlunos( HttpServletRequest request ) {
		/*  put lista ordenada de alunos da sessao */
		List listaOrdenadaDeAlunos = getColecaoOrdenada( cadastro.getValores() );
		request.getSession().setAttribute( "alunos", listaOrdenadaDeAlunos );
		
		/* envia resposta para a pagina */
		return "listaAlunos.jsp";
	}
	
	private List getColecaoOrdenada( Collection alunos ) {
		List listaOrdenada = new ArrayList();
		
		/* cria nova colecao com os alunos da colecao especificada */
		Iterator<Aluno> i = alunos.iterator();
		while ( i.hasNext() ) {
			Aluno aluno = i.next();
			listaOrdenada.add( aluno );
		}
		
		/* ordena colecao */
		Collections.sort( listaOrdenada );
		
		return listaOrdenada;
	}

	private String redirecionaPaginaErro( String mensagemErro, 
		HttpServletRequest request ) {
		
        request.getSession().setAttribute( "mensagem", mensagemErro );
        return "error.jsp";
	}

}