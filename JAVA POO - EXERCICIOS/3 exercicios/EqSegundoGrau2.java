import javax.swing.*;
//Rodrigo Gregorio Neri - Estudante de Analise e Desenvolvimento de Sistemas
//--------  classe principal com o m�todo main  ------------

public class EqSegundoGrau2 {

    public static void main (String args[]) {
       //Criamos um objeto da classe Equacao. Seu m�todo
       //construtor sem par�metros ser� executado:
       Equacao eq = new Equacao();
    }

} // fim da classe



//--------  classe Equacao  ------------

class Equacao {

	private  double  a, b, c;

	public Equacao () {  // m�todo construtor da classe Equacao

	   a = Double.parseDouble(
	                 JOptionPane.showInputDialog (null,
	                 "Digite o coeficiente a: ",
	                 "Dado", JOptionPane.INFORMATION_MESSAGE) );
	   b = Double.parseDouble(
	                 JOptionPane.showInputDialog (null,
	                 "Digite o coeficiente b: ",
	                 "Dado", JOptionPane.INFORMATION_MESSAGE) );
	   c = Double.parseDouble(
	                 JOptionPane.showInputDialog (null,
	                 "Digite o coeficiente c: ",
	                 "Dado", JOptionPane.INFORMATION_MESSAGE) );

	   if ( getDelta(a,b,c) >= 0 ) {
			      JOptionPane.showMessageDialog (null,
			                 "O valor de X1 � " + getX1(a,b,c),
			                 "X1", JOptionPane.INFORMATION_MESSAGE);
			      JOptionPane.showMessageDialog (null,
			                 "O valor de X2 � " + getX2(a,b,c),
			                 "X2", JOptionPane.INFORMATION_MESSAGE);
	   }
	   else {
			      JOptionPane.showMessageDialog (null,
			                 "Delta � negativo, n�o calcularemos as ra�zes. Delta = " + getDelta(a,b,c),
			                 "O valor de delta � negativo!", JOptionPane.INFORMATION_MESSAGE);
	   }
	}

	double getDelta (double a, double b, double c) {
	  double d;
	  d = b * b - 4 * a * c;
	  return (d);
	}

	double getX1 (double a, double b, double c) {
	  return (  (-b + Math.sqrt(getDelta(a,b,c)) ) / (2*a) );
	}

	double getX2 (double a, double b, double c) {
	  return (  (-b - Math.sqrt(getDelta(a,b,c)) ) / (2*a) );
	}

	//obs.: estes tr�s m�todos anteriores (fun��es) poderiam ser sem par�metros

} // fim da classe Equacao




// Dica: teste com: x� - 5x + 6 = 0, ou seja: a=1, b=-5, c=6 (as ra�zes ser�o 3 e 2)










