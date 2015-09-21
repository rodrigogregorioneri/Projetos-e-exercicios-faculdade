import javax.swing.*;

public class Imc {  //guardar este programa no arquivo Imc.java

 public static void main (String arg[])
 {
     float  peso, estatura, imc;

     peso = Float.parseFloat(
                 JOptionPane.showInputDialog (null, "Digite o peso (em Kg): ",
                 "Peso", JOptionPane.INFORMATION_MESSAGE) );
     estatura = Float.parseFloat(
                 JOptionPane.showInputDialog (null, "Digite a estatura (em m): ",
                 "Estatura", JOptionPane.INFORMATION_MESSAGE) );
     imc = peso / (estatura*estatura);
     JOptionPane.showMessageDialog (null, "Seu IMC é: " + imc + " Kg/m²",
                "IMC", JOptionPane.INFORMATION_MESSAGE);
 }

}
