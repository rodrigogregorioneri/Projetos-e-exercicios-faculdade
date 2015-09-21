import java.util.*;
//Rodrigo Gregorio Neri - Estudante de Analise e Desenvolvimento de Sistemas
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

public class Trab0 {

  public static void main(String[] args) {
    System.out.print("Hoje: ");
    System.out.println(new Date());
    System.out.println("\n\n");

    Trabalhador trabA = new Trabalhador();
    trabA.mostra();

    Trabalhador trabB = new Trabalhador("Joao Silva", 1500.75f);
    trabB.mostra();

    Trabalhador trabC = new Trabalhador("Ana Souza", 1000f);
    trabC.mostra();
    System.out.println("\n\n");
  }

}

