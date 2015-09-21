import java.util.Arrays;

public class ArraySimples {

	public static void main(String[] args) {
		
		int[] impares = new int [5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		String[] paises = {"Brasil", "Rússia", "Índia", "China"};
		
		System.out.println(paises[0]);
		System.out.println(paises.length);
		System.out.println(Arrays.toString(paises));//do importas
		
		int posicao = Arrays.binarySearch(paises, "Rússia");
		System.out.println(posicao);
		
		Arrays.sort(paises, 0, paises.length);
		System.out.println(Arrays.toString(paises));
		
		Double[] valores = {12.35, 3456.3456};
		System.out.println(valores[0].doubleValue());
	}
}