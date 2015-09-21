import javax.swing.*;
//Rodrigo Gregorio Neri - Estudante de Analise e Desenvolvimento de Sistemas
//--------  classe principal com o m�todo main  ------------

public class EqSegundoGrau1 {

    public static void main (String args[]) {
		   double  a, b, c;

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

	// Estes tr�s m�todos dever�o ter o atributo static, para serem chamados
	// pelo m�todo main, que � est�tico:

	static double getDelta (double a, double b, double c) {
	  double d;
	  d = b * b - 4 * a * c;
	  return (d);
	}

	static double getX1 (double a, double b, double c) {
	  return (  (-b + Math.sqrt(getDelta(a,b,c)) ) / (2*a) );
	}

	static double getX2 (double a, double b, double c) {
	  return (  (-b - Math.sqrt(getDelta(a,b,c)) ) / (2*a) );
	}

} // fim da classe



// Dica: teste com: x� - 5x + 6 = 0, ou seja: a=1, b=-5, c=6 (as ra�zes ser�o 3 e 2)




