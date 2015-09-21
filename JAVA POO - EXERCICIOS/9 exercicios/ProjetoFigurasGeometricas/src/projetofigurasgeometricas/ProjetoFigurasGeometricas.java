package projetofigurasgeometricas;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class ProjetoFigurasGeometricas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ponto pt1 = new Ponto(45,65);
        JOptionPane.showMessageDialog(null, pt1.toString(), "Ponto", 
                JOptionPane.INFORMATION_MESSAGE);
      
        Circulo c1 = new Circulo(0, 0, 1.0f);
        Circulo c2 = new Circulo(20, 30, 20.0f);
        
        JOptionPane.showMessageDialog(null, c1.toString(), "1º círculo", 
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, c2.toString(), "2º círculo", 
                JOptionPane.INFORMATION_MESSAGE);
        
        Retangulo ret = new Retangulo(10.0f, 3.0f);
        JOptionPane.showMessageDialog(null, "" + ret.toString(), 
                "Retângulo", 
                JOptionPane.INFORMATION_MESSAGE);       
        JOptionPane.showMessageDialog(null, "" + ret.getArea(), 
                "Área do retângulo antes mostrado", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
