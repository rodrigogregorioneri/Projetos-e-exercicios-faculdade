import javax.swing.JOptionPane;

/**
* Calcular o IMC
* IMC = pesoEmQuiloGramas / (alturaEmMetros * alturaEmMetros)
*/
public class IMC {

	public static void main(String[] args){
		String peso = JOptionPane.showInputDialog("Qual seu peso em Quilogramas?");
		String altura = JOptionPane.showInputDialog("Qual sua altura em metros?");
		
		
		double pesoEmQuiloGramas = Double.parseDouble(peso);
		double  alturaEmMetros = Double.parseDouble(altura);
		double imc = pesoEmQuiloGramas / (alturaEmMetros * alturaEmMetros);
		
		String msg = (imc >= 20 && imc <= 25) ? "Peso Ideal" : "Fora do peso Ideal";
		msg = "IMC = " + imc + "\n" + msg;
		
		JOptionPane.showMessageDialog(null, msg);
		System.out.println("IMC = " + imc);
		System.out.println(msg);
		
	}
}