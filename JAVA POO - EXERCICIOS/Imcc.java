import javax.swing.*;

public class Imcc {

    /**
     * Creates a new instance of <code>Imcc</code>.
     */
    public Imcc() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float  p, e, imc, resp;
   p = Float.parseFloat(
                 JOptionPane.showInputDialog (null,
                 "digite seu peso: ",
                 "Dado", JOptionPane.INFORMATION_MESSAGE) );
  e = Float.parseFloat(
                 JOptionPane.showInputDialog (null,
                 "digite a sua estatura ",
                 "Dado", JOptionPane.INFORMATION_MESSAGE) );
 imc= imcr(p,e);
   JOptionPane.showMessageDialog (null,
                 "o imc é"+ imc + " kg/m²",
                 "Resultado", JOptionPane.INFORMATION_MESSAGE );


}

static float imcr(float  peso, float estatura)
{
	float resp;
  float res;
  res = peso/(estatura*estatura);
    if (res < 18.5)
  	 JOptionPane.showMessageDialog (null,
                 "você está abaixo do peso", "resultado"
               , JOptionPane.INFORMATION_MESSAGE );
                 else if( res > 18.5 & res < 25)
                 	JOptionPane.showMessageDialog (null,
                 "você está no peso normal", "resultado"
               , JOptionPane.INFORMATION_MESSAGE );
                else if( res >= 25 && res < 30)
                 	JOptionPane.showMessageDialog (null,
                 "acima do peso", "resultado"
               , JOptionPane.INFORMATION_MESSAGE );
               else if (res > 30)
               		JOptionPane.showMessageDialog (null,
                 "obeso", "resultado"
               , JOptionPane.INFORMATION_MESSAGE );

return(res);
    }
}
