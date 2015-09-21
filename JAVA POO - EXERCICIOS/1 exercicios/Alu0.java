//Solução do Exercício solicitado na Aula 2 - POO
//baseada na solução do aluno Roberto Aparecido de Oliveira

import java.util.*;
import javax.swing.*;

class Aluno{

	private String rgm;
	private String nome;
	private String sexo;
	private float notaA;
	private float notaB;
	private float notaC;
	private float notaD;

	public Aluno(){
		rgm = "-";
		nome = "-";
		sexo = "-";
		notaA = 0;
		notaB = 0;
		notaC = 0;
		notaD = 0;
	}

	public Aluno(String inRgm, String inNome, String inSexo, float inNotaA, float inNotaB, float inNotaC, float inNotaD){
		rgm = inRgm;
		nome = inNome;
		sexo = inSexo;
		notaA = inNotaA;
		notaB = inNotaB;
		notaC = inNotaC;
		notaD = inNotaD;
	}

	public void mostra(){
		System.out.print("RGM: " + rgm);
		System.out.print(", Nome: " + nome);
		System.out.print(", Sexo: " + sexo);
		System.out.println(", Media: " + media());
	}

	public String toString(){
		return ( "RGM: " + rgm + ", nome: " + nome + ", sexo: " + sexo + ", média: " + media() );
	}

	public float media(){
		return ((notaA + notaB + notaC + notaD)/4);
	}
} // Fim da Classe Aluno

public class Alu0{

	public static void main(String[] args){
	    System.out.print("Hoje: ");
		System.out.println(new Date());

		String rgmalnA = JOptionPane.showInputDialog (null,
						"Digite o rgm", "Rgm",
						JOptionPane.INFORMATION_MESSAGE);

		String nomealnA = JOptionPane.showInputDialog (null,
						"Digite o nome", "Nome",
						JOptionPane.INFORMATION_MESSAGE);

		String sexoalnA = JOptionPane.showInputDialog (null,
						"Digite o Sexo", "Sexo",
						JOptionPane.INFORMATION_MESSAGE);

		float notaAalnA = Float.parseFloat(JOptionPane.showInputDialog (null,
						"Digite a Nota A", "NotaA",
						JOptionPane.INFORMATION_MESSAGE));

		float notaBalnA = Float.parseFloat(JOptionPane.showInputDialog (null,
						"Digite a Nota B", "NotaB",
						JOptionPane.INFORMATION_MESSAGE));

		float notaCalnA = Float.parseFloat(JOptionPane.showInputDialog (null,
						"Digite a Nota C", "NotaC",
						JOptionPane.INFORMATION_MESSAGE));

		float notaDalnA = Float.parseFloat(JOptionPane.showInputDialog (null,
						"Digite a Nota D", "NotaD",
						JOptionPane.INFORMATION_MESSAGE));

		Aluno alunA = new Aluno(rgmalnA, nomealnA, sexoalnA, notaAalnA, notaBalnA, notaCalnA, notaDalnA);
		alunA.mostra();

	    String rgmalnB = JOptionPane.showInputDialog (null,
						"Digite o rgm", "Rgm",
						JOptionPane.INFORMATION_MESSAGE);

		String nomealnB = JOptionPane.showInputDialog (null,
						"Digite o nome", "Nome",
						JOptionPane.INFORMATION_MESSAGE);

		String sexoalnB = JOptionPane.showInputDialog (null,
						"Digite o Sexo", "Sexo",
						JOptionPane.INFORMATION_MESSAGE);

		float notaAalnB = Float.parseFloat(JOptionPane.showInputDialog (null,
						"Digite a Nota A", "NotaA",
						JOptionPane.INFORMATION_MESSAGE));

		float notaBalnB = Float.parseFloat(JOptionPane.showInputDialog (null,
						"Digite a Nota B", "NotaB",
						JOptionPane.INFORMATION_MESSAGE));

		float notaCalnB = Float.parseFloat(JOptionPane.showInputDialog (null,
						"Digite a Nota C", "NotaC",
						JOptionPane.INFORMATION_MESSAGE));

		float notaDalnB = Float.parseFloat(JOptionPane.showInputDialog (null,
						"Digite a Nota D", "NotaD",
						JOptionPane.INFORMATION_MESSAGE));

		Aluno alunB = new Aluno(rgmalnB, nomealnB, sexoalnB, notaAalnB, notaBalnB, notaCalnB, notaDalnB);
		alunB.mostra();

		System.out.println("\n\n");

		//Outra forma melhor para visualizar os dados de um aluno (observe o método toString()):
        JOptionPane.showMessageDialog (null,
              "Dados do 2º aluno:  " + alunB.toString(), "Dados do 2º aluno",
              JOptionPane.INFORMATION_MESSAGE);


	}

} // Fim da Claase Alu0