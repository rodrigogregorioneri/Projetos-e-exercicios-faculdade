import java.util.*;
import javax.swing.*;

class Trabalhador {

   private String nome;
   private float salario;

   public Trabalhador(){
      nome = "-";
      salario = 0;
   }

   public Trabalhador(String inNome, float inSalario){
      nome = inNome;
      salario = inSalario;
   }

   public void mostra()
   {
     System.out.print(nome);
     System.out.print(", mensal: R$" + salario);
     System.out.println(", anual: R$" + calculaSalarioAnual());
   }

   public float calculaSalarioAnual()
   {
     return (salario * 13 + salario/3);
   }

} // fim da classe

public class Trab1 {

  public static void main(String[] args) {
    System.out.print("Hoje: ");
    System.out.println(new Date());
    System.out.println("\n\n");

    Trabalhador trabA = new Trabalhador();
    trabA.mostra();

    Trabalhador trabB = new Trabalhador("Joao Silva", 1500.75f);
    trabB.mostra();

    String nomePessoa = JOptionPane.showInputDialog (null,
                      "Por favor, digite o nome do trabalhador", "Nome",
                      JOptionPane.INFORMATION_MESSAGE);

    float salarioPessoa = Float.parseFloat(
                      JOptionPane.showInputDialog (null,
                      "Digite o salário do trabalhador", "Salário",
                      JOptionPane.INFORMATION_MESSAGE) );

    Trabalhador trabC = new Trabalhador(nomePessoa, salarioPessoa);
    trabC.mostra();

    System.out.println("\n\n");
  }

}

