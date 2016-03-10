package exemplo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Cadastro de alunos. Fornece metodos para manutencao 
 * do cadastro de alunos, tais como: adicao, remocao, listagem
 * dos valores cadastrados. Dependendo da operacao, lanca excecao
 * de cadastro.
 */
public class CadastroAlunoEmail implements CadastroIF {
	
	/* banco do sistema */
	private Map< String, Aluno > mapaAlunoEmail;
	
	/* construtor da classe */
	public CadastroAlunoEmail() {
		mapaAlunoEmail = new HashMap < String, Aluno > ();
	}

	/*
	 * (non-Javadoc)
	 * @see exemplo.CadastroIF#cadastra(java.lang.String, java.lang.String)
	 */
	public boolean cadastra( String nome, String email ) 
	throws CadastroException {
		
		/* aluno null ou vazio */
		if ( nome == null || "".equals( nome ) ) {
			throw new CadastroException( "Nome do aluno não pode ser vazio !" );
		}
		
		/* padroniza todos os nomes chaves em maiusculas */
		String nomeFormatoOriginal = nome;
		nome = nome.toUpperCase();
		
		/* aluno já cadastrado */
		Aluno alunoCadastrado = mapaAlunoEmail.get( nome );
		if ( alunoCadastrado != null ) {
			throw new CadastroException( "Aluno já cadastrado !" );
		}
		
		/* novo cadastro */
		Aluno aluno = criaAluno( nomeFormatoOriginal, email ); 
		mapaAlunoEmail.put( nome, aluno );
		return true; 
	}

	/*
	 * Factory method de um aluno.
	 */
	private Aluno criaAluno( String nome, String email ) throws CadastroException {
		return new Aluno( nome, email );
	}

	/*
	 * (non-Javadoc)
	 * @see exemplo.CadastroIF#remove(java.lang.String)
	 */
	public boolean remove( String nome ) throws CadastroException {

		/* aluno null ou vazio */
		if ( nome == null || "".equals( nome ) ) {
			throw new CadastroException( "Nome do aluno não pode ser vazio !" );
		}
		
		/* padroniza todos os nomes chaves em maiusculas */
		nome = nome.toUpperCase();
		
		/* aluno já cadastrado */
		Aluno alunoCadastrado = mapaAlunoEmail.get( nome );
		if ( alunoCadastrado == null ) {
			throw new CadastroException( "Aluno não cadastrado !" );
		}
		
		/* remove do cadastro */
		mapaAlunoEmail.remove( nome );
		return true; 
	}

	/*
	 * (non-Javadoc)
	 * @see exemplo.CadastroIF#getValores()
	 */
	public Collection getValores() {
		return mapaAlunoEmail.values(); 
	}

	/*
	 * (non-Javadoc)
	 * @see exemplo.CadastroIF#getChaves()
	 */
	public Collection getChaves() {
		return mapaAlunoEmail.keySet(); 
	}

	/*
	 * (non-Javadoc)
	 * @see exemplo.CadastroIF#getCadastrado(java.lang.String)
	 */
	public Object getValor( String nome ) throws CadastroException {
		/* aluno null ou vazio */
		if ( nome == null || "".equals( nome ) ) {
			throw new CadastroException( "Nome do aluno não pode ser vazio !" );
		}
		
		/* padroniza todos os nomes chaves em maiusculas */
		nome = nome.toUpperCase();
		
		/* aluno nao cadastrado */
		Aluno alunoCadastrado = mapaAlunoEmail.get( nome );
		if ( alunoCadastrado == null ) {
			throw new CadastroException( "Aluno não cadastrado !" );
		}

		/* retorna cadastrado */
		return alunoCadastrado;
	}

}