/*
* IncluiClientes.java
*
*/

package cadastro;

import java.sql.*;

public class IncluiClientes {

    private String strNome;
    private String strEndereco;
    private String strCidade;
    private String strEstado;
    private String strCep;
    private String strEmail;
    private String strCliente;
    private String strEstadoCivil;
    private String strInteresse1;
    private String strInteresse2;
    private String strInteresse3;
    private String strInteresse4;
    private String strComentario;

    private PreparedStatement pstm;

    public IncluiClientes() {
    }

    private String isNull(String param) {
        if (param.equals("null"))
            return "";
        else
            return param;
    }

    public boolean incluir() {
    	Connection con;
		String url = "jdbc:mysql://localhost/aula";
        try {
            //carregar o drive do mysql
			Class.forName("com.mysql.jdbc.Driver");
			//conexão com a base de dados aula
		    con = DriverManager.getConnection(url,"root","root");

            String strSQL = "insert into clientes (nome,endereco,cidade,estado,cep,email," +
                    "cliente,estadocivil,interesse1,interesse2,interesse3,interesse4,comentario)" +
                    " values (?,?,?,?,?,?,?,?,?,?,?,?,?)";

			pstm = con.prepareStatement(strSQL);

			//configura os parâmetros indicados por ?
			pstm.setString(1,getNome());
			pstm.setString(2,getEndereco());
			pstm.setString(3,getCidade());
			pstm.setString(4,getEstado());
			pstm.setString(5,getCep());
			pstm.setString(6,getEmail());
			pstm.setString(7,getCliente());
			pstm.setString(8,""+getEstadocivil());
			pstm.setString(9,""+getInteresse1());
			pstm.setString(10,""+getInteresse2());
			pstm.setString(11,""+getInteresse3());
			pstm.setString(12,""+getInteresse4());
			pstm.setString(13,""+getComentario());

			//chamamos o método para gravar dados no banco
			int retorno = pstm.executeUpdate();

            // Executa o comando SQL
            System.out.println("*** Debug *** " + strSQL);

            con.close();
            con = null;

        } catch (Exception ex) {
            System.out.println("Erro SQL: " + ex.getMessage());
            return(false);
        }

        return(true);
    }

    public String getNome() {
        return strNome;
    }

    public String getEndereco() {
        return strEndereco;
    }

    public String getCidade() {
        return strCidade;
    }

    public String getEstado() {
        return strEstado;
    }

    public String getCep() {
        return strCep;
    }

    public String getEmail() {
        return strEmail;
    }

    public String getCliente() {
        return strCliente;
    }

    public String getEstadocivil() {
        return strEstadoCivil;
    }

    public String getInteresse1() {
        return strInteresse1;
    }

    public String getInteresse2() {
        return strInteresse2;
    }

    public String getInteresse3() {
        return strInteresse3;
    }

    public String getInteresse4() {
        return strInteresse4;
    }

    public String getComentario() {
        return strComentario;
    }

    public void setNome(String nome) {
        strNome = isNull(nome);
    }

    public void setEndereco(String endereco) {
        strEndereco = isNull(endereco);
    }

    public void setCidade(String cidade) {
        strCidade = isNull(cidade);
    }

    public void setEstado(String estado) {
        strEstado = isNull(estado);
    }

    public void setCep(String cep) {
        strCep = isNull(cep);
    }

    public void setEmail(String email) {
        strEmail = isNull(email);
    }

    public void setCliente(String cliente) {
        strCliente = isNull(cliente);
    }

    public void setEstadocivil(String estadoCivil) {
        strEstadoCivil = isNull(estadoCivil);
    }

    public void setInteresse1(String interesse1) {
        strInteresse1 = isNull(interesse1);
    }

    public void setInteresse2(String interesse2) {
        strInteresse2 = isNull(interesse2);
    }

    public void setInteresse3(String interesse3) {
        strInteresse3 = isNull(interesse3);
    }

    public void setInteresse4(String interesse4) {
        strInteresse4 = isNull(interesse4);
    }

    public void setComentario(String comentario) {
        strComentario = isNull(comentario);
    }


}