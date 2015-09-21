import javax.swing.JOptionPane;

public class EntradaGraficaDados {

	public static void main(String[] args){
	
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null, nome);
	}
}