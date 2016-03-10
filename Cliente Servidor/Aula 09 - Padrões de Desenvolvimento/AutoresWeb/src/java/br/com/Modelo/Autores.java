package br.com.Modelo;

import java.sql.*;
public class Autores {

    private int idAutores;
    private String primeiroNome;
    private String segundoNome;

    public Autores() {
        this.idAutores = 0;
        this.primeiroNome = "";
        this.segundoNome = "";
    }

    public Autores(int idAutores, String primeiroNome, String segundoNome) {
        this.idAutores = idAutores;
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
    }

    public Autores(int idAutores) {
        this.idAutores = idAutores;
    }

    public Autores(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public Autores(String primeiroNome, String segundoNome) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
    }

    public int getIdAutores() {
        return idAutores;
    }

    public void setIdAutores(int idAutores) {
        this.idAutores = idAutores;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }
    
    public ResultSet consultar(String sql){
        ResultSet resultado;
    	try {
            // Carregar Driver do MySQL
            Class.forName("com.mysql.jdbc.Driver");
            //Fazer a conexao
            //Verifique se o usuario root e a senha root sao iguais na maquina de teste
            //caso contrario, altere na linha abaixo.
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "root");
 	    //Criar o fluxo para mandar comando sql o banco
            Statement stmt = con.createStatement();
            // Executa o comando SQL
            resultado = stmt.executeQuery(sql);

            return resultado;

        } catch (Exception ex) {
            return null;
        }


    }
}
