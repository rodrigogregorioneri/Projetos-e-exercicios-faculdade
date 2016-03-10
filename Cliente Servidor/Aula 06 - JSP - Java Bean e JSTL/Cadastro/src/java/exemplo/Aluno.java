package exemplo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Bean Aluno. 
 * Possui dois atributos: nome e endereco de email e data de criacao.
 */
public class Aluno implements Comparable {
	
	/* nome do aluno */
	private String nome;
	
	/* email do aluno */
	private String email;

	/* data do cadastro */
	private String data;

	/**
	 * Construtor do bean Aluno.
	 * @param nome Nome do Aluno.
	 * @param email Email do Aluno.
	 * @throws CadastroException  Lancada quando o email especificado
	 *                            eh null, ou vazio, ou numerico ou mal
	 *                            formado.
	 */
	public Aluno( String nome, String email ) throws CadastroException  {
		this.nome = nome;
		
		/* verifica se o email eh bem formado */
		this.email = verificaEmail( email );
		
		/* this.data recebe a data de hoje formatada */
		this.data = getDataFormatada( new Date() );
	}

	/*
	 * Verifica se o email especificado eh null, vazio numerico
	 * e mal formado. Em caso afirmativo lanca excecao. Caso negativo
	 * retorna o email especificado.
	 */
	private String verificaEmail( String email ) throws CadastroException {
		/* email null, vazio, numerico, mal formado */
		if ( email == null || "".equals( email ) 
				|| email.matches( ".*[0123456789].*" )
				|| !email.matches( "....*@........*" ) ) {
			
			throw new CadastroException( "Email inválido !" ); 
		}
		
		return email;
	}

	/**
	 * Retorna o email do aluno.
	 * @return Email do aluno.
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Altera o email do aluno para o email especificado.
	 * @param email Novo email do aluno.
	 * @throws CadastroException Caso o novo email seja mal formado
	 *                           ou null ou vazio; 
	 */
	public void setEmail( String email ) throws CadastroException {
		this.email = verificaEmail( email );
	}

	/**
	 * Retorna o nome do aluno.
	 * @return Nome do aluno.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Altera o nome do aluno para o nome especificado.
	 * @param nome Novo nome do aluno.
	 */
	public void setNome( String nome ) {
		this.nome = nome;
	}

	/**
	 * Retorna a data do cadastro do aluno no formato
	 * dd/MM/yyyy. Exemplo 30/05/2013
	 * @return Data do cadastro do aluno.
	 */
	public String getData() {
		return data;
	}

	/**
	 * Altera a data para o valor especificado.
	 * @param data Nova data.
	 */
	public void setData( Date data ) {
		this.data = getDataFormatada( data );
	}
	
	/**
	 * Imprime o nome e o email do aluno
	 * no formato: nome::email::data
	 * Exemplo: Luiz::luiz.carlos.reis@gmail.com::25/12/2012
	 */
	public String toString() {
		return this.nome + "::" + this.email + "::" + this.data; 
	}
	
	/*
	 * Formata a data para dd/MM/yyyy.
	 * Exemplo: 25/12/2012
	 */
	private String getDataFormatada( Date data ) {
		/* exemplo do formato 25/12/2012 */
		//String formatoData = "dd/MM/yyyy hh:mm:ss";
		String formatoData = "dd/MM/yyyy";
		SimpleDateFormat formatador = new SimpleDateFormat( formatoData );
		
		/* formate a data especificada */
		return formatador.format( data );
	}

	/*
	 * Para uso do Collections.sort
	 */
	public int compareTo( Object o ) {
		return toString().compareTo( o.toString() );
	}

}