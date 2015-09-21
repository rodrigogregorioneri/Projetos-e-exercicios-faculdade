// Rodrigo Gregorio Neri
abstract class Classeabstrata extends Object {

	public double metodoA( ) { //metodo concreto
	   return(3.12*9);
	}

	public void metodoB( ){
	   		//..... metodo concreto
	}

	public abstract String metodoC( );  //este m�todo abstrato dever� ser definido nas subclasses

}



class Classederivada extends Classeabstrata {

   public String metodoC( ){    //redefine o m�todo abstrato metodoC
       return "Uma string e executa um metodo concreto herdado que retorna "
                  + metodoA();
   }

}


interface Umainterface {
  public final int constanteA=6;  //se for: public final int constanteA;  provocaria o erro '= expected'
  public abstract double metodoA();
  public abstract void metodoB();

  // provocar� o erro: "interface methods cannot have body"
  //      public void metodoDefinido(){
  //	       System.out.println("Visualizando em metodoDefinido()");
  //      }
}


class Classebase {
   public void metodoC(){
   	 //...
   }
   public void metodoD(){
   	 //...
   }
}


class Subclasse extends Classebase implements Umainterface {

  //Esta classe dever� definir os m�todos da interface ou ser
  //declarada como classe abstract ou teremos o erro "Subclasse
  //is not abstract and does not override abstract method
  //metodoA() in Umainterface"

  public double metodoA(){
  	return (4*5*constanteA);  //utiliza a constante da interface
  }

  public void metodoB(){
  	//...
  }

  //Redefine um dos m�todos da classe base:
  public void metodoD(){
   	 //...
  }

}



//  abstract class UmaClasseAbstrata extends Classebase {
          // o compilador n�o acusa erro, mas n�o teria sentido
          // ter uma classe abstrata derivada de uma concreta
//  }



class ClasseExterna {

   public void metodoF(){
   	  ClasseInterna obj = new ClasseInterna();
       obj.metodoJ();
   }

   class ClasseInterna {
		   public void metodoJ(){
		   	   //...
		   }
   }

}



public class TesteClasseAbstrataInterfaceClasseInterna {

     public static void main (String args[]) {
  	//A seguir, provocaria um erro: "Classeabstrata is abstract; cannot be instantiated":
	//          Classeabstrata a = new Classeabstrata();

	Classederivada b =  new Classederivada();
	System.out.println(b.metodoC());

	Subclasse c = new Subclasse();
	System.out.println("Executamos o metodoA que retorna " + c.metodoA());
	//Provocaria o erro "Umainterface is abstract; cannot be instantiated":
	//        Umainterface d = new Umainterface();

      ClasseExterna obe = new ClasseExterna();
      obe.metodoF();  // permitido

        // mas, obe.metodoJ(); provocaria erro de compila��o "cannot find symbol".
        // Tamb�m,    ClasseInterna obi = new ClasseInterna();  provocar� erro,
        // porque a ClasseInterna e seus m�todos s�o para uso exclusivo da ClasseExterna

     }

}
