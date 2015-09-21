import javax.swing.*;
//Rodrigo Gregorio Neri - Estudante de Analise e Desenvolvimento de Sistemas
//--------  classe principal com o método main  ------------

public class EqSegundoGrau0 {

    public static void main (String args[]) {
		   double  a, b, c, d;

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

			d = b * b - 4 * a * c;   // calculamos delta
		 	if ( d >= 0 ) {
				      JOptionPane.showMessageDialog (null,
				                 "O valor de X1 é " +  (-b + Math.sqrt(d) ) / (2*a),
				                 "X1", JOptionPane.INFORMATION_MESSAGE);
				      JOptionPane.showMessageDialog (null,
				                 "O valor de X2 é " + (-b - Math.sqrt(d) ) / (2*a),
				                 "X2", JOptionPane.INFORMATION_MESSAGE);
		   }
		   else {
				      JOptionPane.showMessageDialog (null,
				                 "Delta é negativo, não calcularemos as raízes. Delta = " + d,
				                 "O valor de delta é negativo!", JOptionPane.INFORMATION_MESSAGE);
		   }
   }

} // fim da classe



// Dica: teste com: x² - 5x + 6 = 0, ou seja: a=1, b=-5, c=6 (as raízes serão 3 e 2)




