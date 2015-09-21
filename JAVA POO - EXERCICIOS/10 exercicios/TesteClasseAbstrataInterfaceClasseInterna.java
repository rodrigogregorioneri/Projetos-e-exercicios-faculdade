// Rodrigo Gregorio Neri
abstract class Classeabstrata extends Object {

	public double metodoA( ) { //metodo concreto
	   return(3.12*9);
	}

	public void metodoB( ){
	   		//..... metodo concreto
	}

	public abstract String metodoC( );  //este método abstrato deverá ser definido nas subclasses

}



class Classederivada extends Classeabstrata {

   public String metodoC( ){    //redefine o método abstrato metodoC
       return "Uma string e executa um metodo concreto herdado que retorna "
                  + metodoA();
   }

}


interface Umainterface {
  public final int constanteA=6;  //se for: public final int constanteA;  provocaria o erro '= expected'
  public abstract double metodoA();
  public abstract void metodoB();

  // provocará o erro: "interface methods cannot have body"
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

  //Esta classe deverá definir os métodos da interface ou ser
  //declarada como classe abstract ou teremos o erro "Subclasse
  //is not abstract and does not override abstract method
  //metodoA() in Umainterface"

  public double metodoA(){
  	return (4*5*constanteA);  //utiliza a constante da interface
  }

  public void metodoB(){
  	//...
  }

  //Redefine um dos métodos da classe base:
  public void metodoD(){
   	 //...
  }

}



//  abstract class UmaClasseAbstrata extends Classebase {
          // o compilador não acusa erro, mas não teria sentido
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

        // mas, obe.metodoJ(); provocaria erro de compilação "cannot find symbol".
        // Também,    ClasseInterna obi = new ClasseInterna();  provocará erro,
        // porque a ClasseInterna e seus métodos são para uso exclusivo da ClasseExterna

     }

}
