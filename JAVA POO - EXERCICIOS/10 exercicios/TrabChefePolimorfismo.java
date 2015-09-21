// Rodrigo Gregorio Neri

import java.util.*;

class Trabalhador {

   private String nome;
   private float salario;

   public Trabalhador(){
      nome = "-";
      salario = 0;
   }

   public Trabalhador(String inNome, float inSalario){
      setNome(inNome);
      setSalario(inSalario);
   }

   public String getNome(){
   	return nome;
   }

   public float getSalario(){
   	return salario;
   }

   public void setNome(String inNome){
      nome = inNome;
   }

   public void setSalario(float inSalario){
      salario = inSalario;
      if (salario<0)salario=0;
   }

   public void mostra()   //m�todo polimorfo, veja na subclasse tamb�m
   {
     System.out.println();
     System.out.print(nome);
     System.out.print(", Salario mensal:" + salario);
     //na seguinte linha ser� executado o m�todo polimorfo salarioAnual(),
     //mas veja que ser� executado o salarioAnual() da classe Chefe se for
     //um objeto da classe Chefe e ser� executado salarioAnual() da classe
     //Trabalhador se for dessa classe!!!
     System.out.println(", Salario anual:" + salarioAnual());
   }

   public float salarioAnual()  //m�todo polimorfo, veja na subclasse tamb�m
   {
   	  return(salario * 13 + salario/3);
   }

}

//--------------------------------------------

class Chefe extends Trabalhador{

     private float pgtoAdicional;
     private String cargo;

     public Chefe(){
        super();
        pgtoAdicional = 0.0f;
        cargo = "-";
     }

     public Chefe(String inNome, float inSalario, float inPgtoAdicional, String inCargo){
		super(inNome,inSalario);  //executa o construtor da classe base
		setPgtoAdicional(inPgtoAdicional);
		setCargo(inCargo);
     }

     public float getPgtoAdicional(){
     	return pgtoAdicional;
     }

     public void setPgtoAdicional(float inPgtoAdicional){
     	pgtoAdicional = inPgtoAdicional;
     }

     public String getCargo(){
     	return cargo;
     }

     public void setCargo(String inCargo){
     	cargo = inCargo;
     }

     public float salarioAnual()  //m�todo polimorfo
     {
     	return(getSalario() * 13 + getSalario()/3 + getPgtoAdicional() * 12);
     }

     public void mostra()  //m�todo polimorfo
     {
     	super.mostra();  //executa o m�todo da classe base
        System.out.println("   --> Pgto. adicional mensal como chefe:" + pgtoAdicional );
     }

}

//--------------------------------------------

public class TrabChefePolimorfismo {

  public static void main(String[] args) {
    System.out.println(new Date());
    System.out.println("\n\n\n\n");

    Trabalhador trab[]; //declaramos um vetor de objetos da classe Trabalhador
    //observe que o vetor ser� da classe Trabalhador e n�o da classe
    //Chefe, ou seja, utilizamos a classe base
    trab = new Trabalhador[20];   //aloca mem�ria para o vetor

    int N=4;

    //aloca mem�ria para cada objeto (e executa o construtor com par�metros):
    trab[1] = new Trabalhador("Luiz A. Alves", 1000.0f);
    trab[2] = new Chefe("Ana Lopes", 1000.0f, 400.0f, "Diretor");
    trab[3] = new Trabalhador("Pedro Bertolini",670.0f);
    trab[4] = new Chefe("Rosa Batista", 750.0f, 600.0f, "Chefe Depto.");
    //observe que criamos uma cole��o de "objetos polimorfos", ou seja,
    //nesta cole��o (vetor) armazenaremos objetos de diferentes classes (de
    //diferentes formas => polimorfismo); observe que o vetor trab foi declarado
    //da classe base da hierarquia: Trabalhador

	//veja que o seguinte ciclo executar� o m�todo mostra adequado (da classe
	//Trabalhador ou Chefe) dependendo do tipo do objeto em trab[i]
    for (int i=1; i<=N; i++){
       trab[i].mostra();

       //Um exemplo interessante, para indentificar a classe de um objeto
       //e executar m�todos que somente existem em classes derivadas. Por
       //exemplo, o m�todo getCargo() s� existe na classe Chefe, ent�o precisamos
       //fazer uma convers�o de tipo (casting) para poder executar esse m�todo,
       //mas somente se o objeto trab[i] � uma inst�ncia da classe Chefe, o que
       //foi verificado com o comando if e o operador instanceof.
       if(trab[i] instanceof Chefe){
         System.out.println( "Cargo: " +  ((Chefe)trab[i]).getCargo()  );
       }
    }

    System.out.println();
    System.out.println();
  }

}


