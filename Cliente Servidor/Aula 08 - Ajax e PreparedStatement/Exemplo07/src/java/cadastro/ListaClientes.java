/*
* ListaClientes.java
*
*/

package cadastro;

import java.sql.*;

public class ListaClientes {

    private String strId;
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

    private ResultSet rs;

    public ListaClientes() {
    }

    private String isNull(String param) {
        if (param.equals("null"))
            return "";
        else
            return param;
    }

    public boolean consultar() {
        Connection con;
		Statement stm;
		String sql;
		String url = "jdbc:mysql://localhost/aula";
        try {
            // Conexão para ODBC
            Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,"root","root");
			stm = con.createStatement();

            rs = stm.executeQuery("SELECT * FROM clientes;");

        } catch (Exception ex) {
            System.out.println("Erro SQL: " + ex.getMessage());
            return(false);
        }

        return(true);
    }

    public boolean proximoCliente() {

        try {
            if (!rs.next()) {
                return (false);
            } else {
                strId           = rs.getString("id");
                strNome         = rs.getString("nome");
                strEndereco     = rs.getString("endereco");
                strCidade       = rs.getString("cidade");
                strCep          = rs.getString("cep");
                strEstado       = rs.getString("estado");
                strEmail        = rs.getString("email");
                strCliente      = rs.getString("cliente");
                strEstadoCivil  = isNull(rs.getString("estadocivil"));
                strInteresse1   = isNull(rs.getString("interesse1"));
                strInteresse2   = isNull(rs.getString("interesse2"));
                strInteresse3   = isNull(rs.getString("interesse3"));
                strInteresse4   = isNull(rs.getString("interesse4"));
                strComentario   = isNull(rs.getString("comentario"));
                return (true);
            }
        } catch (Exception ex) {
            System.out.println("Erro SQL: " + ex.getMessage());
            return(false);
        }
    }

    public String getId() {
        return strId;
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

}