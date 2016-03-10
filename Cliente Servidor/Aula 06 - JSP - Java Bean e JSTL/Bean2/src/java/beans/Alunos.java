package beans;
import java.io.Serializable;
public class Alunos implements Serializable{
  private String rgm;
  private String nome;

  public Alunos() {
    rgm = null;
    nome = null;
  }
  public void setRgm(String rgm){
    this.rgm = rgm;
  }

  public String getRgm(){
    return rgm;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getNome(){
    return nome;
  }
}