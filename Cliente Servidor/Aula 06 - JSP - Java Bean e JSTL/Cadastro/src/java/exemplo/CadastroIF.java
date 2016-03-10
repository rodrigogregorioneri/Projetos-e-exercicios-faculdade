package exemplo;

import java.util.Collection;

/**
 * Interface do cadastrador de valores do sistema. 
 */
public interface CadastroIF {
	
	/**
	 * Cadastra um valor no banco associado a chave especificada.
	 * @param chave Chave de acesso ao valor.
	 * @param valor Valor a ser cadastrado.
	 * @return True caso a operacao seja realizada com sucesso.
	 * @throws CadastroException Lancada quando algum parametro especificado
	 *                           eh invalido ou quando a chave ja existe no banco.
	 */
	public boolean cadastra( String chave, String valor ) throws CadastroException;

	/**
	 * Remove um valor do banco associado a chave especificada.
	 * @param chave Chave de acesso ao valor.
	 * @return True caso a operacao seja realizada com sucesso.
	 * @throws CadastroException Lancada quando algum parametro especificado
	 *                           eh invalido ou quando a chave nao existe no banco.
	 */
	public boolean remove( String chave ) throws CadastroException;
	
	/**
	 * Retorna uma colecao contendo todas os valores cadastrados no banco.
	 * @return A colecao contendo todas os valores cadastrados no banco.
	 */
	public Collection getValores();
	
	/**
	 * Retorna uma colecao contendo todas as chaves cadastradas no banco.
	 * @return A colecao contendo todas as chaves cadastradas no banco.
	 */
	public Collection getChaves();

	/**
	 * Retorna um valor cadastrado para a chave especificada.
	 * Caso a chave nao seja encontrada lanca excecao.
	 * Se a chave for nula ou vazia lanca a excecao.
	 * @param nome Chave de acesso ao valor cadastrado.
	 * @return Valor cadastrado.
	 * @throws CadastroException Caso a chave nao seja encontrada lanca excecao.
	 *                           Se a chave for nula ou vazia lanca a excecao.
	 */
	public Object getValor( String chave ) throws CadastroException;

}
