import java.util.Scanner;
public class OperadoresEspeciais {

	public static void main(String[] args){
	
		//int idade = 6;
		//String x = (idade >=18) ? "Maior de Idade" : "Menor de Idade";
		
		//String sexo = "M", pais = "Brasil";// mesma vari�vel String
		Scanner s = new Scanner(System.in);
		System.out.println("Informe o Raio");
		double raio = s.nextDouble();
		//Di�metro : 2r
		//double raio = 10;
		double diametro = 2 * raio;
		System.out.println("Diametro="+diametro);
		//Circunfer�ncia : 2 PI r
		double pi = Math.PI;
		double circunferencia = 2 * pi * raio;
		System.out.println("Circunferencia="+circunferencia);
		//�rea PI r2
		double area = pi * (raio * raio);
		System.out.println("area="+area);
		
	}
}