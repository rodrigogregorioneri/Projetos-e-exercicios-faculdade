package meusBeans;
import java.io.Serializable;
public class PessoaBean implements Serializable{
  private String nome;
  private String email;

  public PessoaBean() {
    nome = null;
    email = null;
  }
  public void setNome(String nome){
    this.nome = nome;
  }

  public void setEmail(String email){
    this.email = email;
  }

  public String getNome(){
    return nome;
  }
  public String getEmail(){
    return email;
  }

}