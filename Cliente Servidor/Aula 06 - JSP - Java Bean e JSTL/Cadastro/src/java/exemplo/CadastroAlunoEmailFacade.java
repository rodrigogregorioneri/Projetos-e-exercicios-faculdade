package exemplo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Facade para testes do sistema, usando framework de testes
 * de aceitacao easyaccept.jar. Cada metodo delega a execucao
 * da chamada para o metodo da business logic.
 */
public class CadastroAlunoEmailFacade {
	
	private CadastroIF cadastro;
	
	public CadastroAlunoEmailFacade() {
		cadastro = new CadastroAlunoEmail( );
	}
	
	public boolean adicionaAlunoNaLista( String nomeAluno, String emailAluno ) 
	throws CadastroException {
		
		return cadastro.cadastra( nomeAluno, emailAluno );
	}
	
	public String getListaDeAlunos( ) {
		Collection<Aluno> alunos = cadastro.getValores(); 
		return getListaDeNomes( alunos );
	}
	
	/*
	 * Retorna uma string em forma de lista de nomes de alunos.
	 */
	private String getListaDeNomes( Collection<Aluno> alunos ) {
		List nomes = new ArrayList();
		
		/* cria nova colecao com os nomes da colecao de alunos*/
		Iterator<Aluno> i = alunos.iterator();
		while ( i.hasNext() ) {
			Aluno aluno = i.next();
			nomes.add( aluno.getNome() );
		}
		
		/* ordena colecao de nomes*/
		Collections.sort( nomes );
		
		return nomes.toString();
	}
	
	public String getListaDeEmails( ) {
		Collection<Aluno> alunos = cadastro.getValores(); 
		return getListaDeEmails( alunos );
	}

	/*
	 * Retorna uma string em forma de lista de email de alunos.
	 */
	private String getListaDeEmails( Collection<Aluno> alunos ) {
		List emails = new ArrayList();
		
		/* cria nova colecao com os emails da colecao de alunos*/
		Iterator<Aluno> i = alunos.iterator();
		while ( i.hasNext() ) {
			Aluno aluno = i.next();
			emails.add( aluno.getEmail() );
		}
		
		/* ordena colecao de emails */
		Collections.sort( emails );
		
		return emails.toString();
	}
	
	public boolean removeAlunoDaLista( String nome ) throws CadastroException {
		return cadastro.remove( nome );
	}
	
	public String getDataDoDia() {
		/* exemplo do formato 25/12/2012 */
		//String formatoData = "dd/MM/yyyy hh:mm:ss";
		String formatoData = "dd/MM/yyyy";
		SimpleDateFormat formatador = new SimpleDateFormat( formatoData );
		
		/* hoje */
		Date data = new Date();
		
		/* formate a data hoje */
		return formatador.format( data );
	}
	
	public String getDataDoCadastro( String nome ) throws CadastroException {
		Aluno aluno = (Aluno) cadastro.getValor( nome );
		return aluno.getData();
	}
	
	public String getCadastrado( String nome ) throws CadastroException {
		return cadastro.getValor( nome ).toString();
	}

}