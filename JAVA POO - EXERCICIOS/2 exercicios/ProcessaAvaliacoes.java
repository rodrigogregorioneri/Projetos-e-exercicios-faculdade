import javax.swing.*;
//Rodrigo Gregorio Neri - Estudante de Analise e Desenvolvimento de Sistemas
class Avaliacao {

	private String nome;
	private String tipoavaliacao;
	private float notamaxima;

	public Avaliacao() {
		nome = "-";
		tipoavaliacao = "-";
		notamaxima = 0;
	}

	public Avaliacao(String inNome, String inTipoavaliacao, float inNotamaxima) {
		nome = inNome;
		tipoavaliacao = inTipoavaliacao;
		notamaxima = inNotamaxima;
	}

	public String toString(){
		return (nome + ", tipo de avalia��o: " + tipoavaliacao + ", nota m�xima: " + notamaxima + ", percentual da nota final: " + perc() + "%");
	}

	public float perc(){
		return ((notamaxima / 10.0f)*100.0f);
	}

}

public class ProcessaAvaliacoes {

	public static void main (String[] args) {

			String nomeava1 = JOptionPane.showInputDialog(null, "Digite o nome da avalia��o: ",
						"Nome da 1� Avali��o", JOptionPane.INFORMATION_MESSAGE);

			String tipoavaliacaoava1 = JOptionPane.showInputDialog(null, "Digite o tipo de avalia��o: ",
						"Tipo da 1� avalia��o", JOptionPane.INFORMATION_MESSAGE);

			float notamaximaava1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota m�xima: ",
						"Nota m�xima", JOptionPane.INFORMATION_MESSAGE));

			Avaliacao ava1 = new Avaliacao(nomeava1, tipoavaliacaoava1, notamaximaava1);

			JOptionPane.showMessageDialog(null, "Primeira avalia��o: " + ava1.toString(), "Dados",
										JOptionPane.INFORMATION_MESSAGE);

		 	//-----------

			String nomeava2 = JOptionPane.showInputDialog(null, "Digite o nome da avalia��o: ",
						"Nome da 2� Avali��o", JOptionPane.INFORMATION_MESSAGE);

			String tipoavaliacaoava2 = JOptionPane.showInputDialog(null, "Digite o tipo de avalia��o: ",
						"Tipo da 2� avalia��o", JOptionPane.INFORMATION_MESSAGE);

			float notamaximaava2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota m�xima: ",
						"Nota m�xima", JOptionPane.INFORMATION_MESSAGE));

			Avaliacao ava2 = new Avaliacao(nomeava2, tipoavaliacaoava2, notamaximaava2);

			JOptionPane.showMessageDialog(null, "Segunda avalia��o: " + ava2.toString(), "Dados",
										JOptionPane.INFORMATION_MESSAGE);

		 	//-----------

			String nomeava3 = JOptionPane.showInputDialog(null, "Digite o nome da avalia��o: ",
						"Nome da 3� Avali��o", JOptionPane.INFORMATION_MESSAGE);

			String tipoavaliacaoava3 = JOptionPane.showInputDialog(null, "Digite o tipo de avalia��o: ",
						"Tipo da 3� avalia��o", JOptionPane.INFORMATION_MESSAGE);

			float notamaximaava3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota m�xima: ",
						"Nota m�xima", JOptionPane.INFORMATION_MESSAGE));

		    Avaliacao ava3 = new Avaliacao (nomeava3, tipoavaliacaoava3, notamaximaava3);

			JOptionPane.showMessageDialog(null, "Terceira avalia��o: " + ava3.toString(), "Dados",
											JOptionPane.INFORMATION_MESSAGE);
	}

}