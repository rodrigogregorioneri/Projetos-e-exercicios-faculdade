//Rodrigo Gregorio Neri - Estudante de Analise e Desenvolvimento de Sistemas

public class MatrizTransposta {

      static int mat [ ] [ ] = {		  // declaramos, alocamos memória e inicializamos uma
        {1, 2, 3, 4 },          				// matriz com elementos inteiros
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}
      };

  public static void  visualiza (int[][] a) {
  	  int tam = a[0].length;
  	  for(int i=0; i<tam; i++) {
	  	  for(int j=0; j<tam; j++) {
	  	  	  System.out.print(a[i][j] + "  ");
	  	  }
	  	  System.out.println();
  	  }
  }

  public static void transposta (int[][] a) {
  	  int tam = a[0].length, aux;
  	  for(int i=0; i<tam; i++) {
	  	  for(int j=0; j<i; j++) {
	  	  	  aux = a[i][j];
	  	  	  a[i][j] = a[j][i];
	  	  	  a[j][i] = aux;
	  	  }
  	  }
 }

 public static void multiplicaPorEscalar ( int  a[][] ,   int m,  int escalar ) {
	   for ( int i = 0; i < m; i++ ) {
	        for ( int j = 0; j < m; j++ ) {
	           a[i][j]  =   escalar *  a[i][j];
	       }
	   }
 }

 public static void main( String args[]) {

       System.out.println("Matriz original:");
       visualiza(mat);

       transposta(mat);

       System.out.println("\nMatriz transposta:");
       visualiza(mat);

       System.out.println("\nMatriz anterior multiplicada pelo escalar 2:");
       multiplicaPorEscalar (mat, 4, 2);   //4 linhas e colunas, escalar 2
       visualiza(mat);

 }

}