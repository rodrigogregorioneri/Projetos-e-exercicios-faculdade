package testevetores;

public class TesteVetores {


    public static void main(String[] args) {
            
        String vetor1[] = {"0", "1", "2", "Pedro"};
        String vetor2[] = new String[4];
        vetor2[0] = "0";
        vetor2[1] = "1";
        vetor2[2] = "2";
        vetor2[3] = "Pedro";
        
        int vetor3[] = {0 ,1, 29, 347};
        
        for(int i=0; i<vetor1.length; i++)
        {
            System.out.println( vetor1[i] );
        }
        /*
        for(String str : vetor1)
        {
            System.out.println(str);
        }
        */
        
        int vetor4[][] = {   {1, 2, 29, 347}, 
                             {0, 1, 2 , 3  }, 
                             {4, 5, 6 , 7  }  };
        
        //System.out.println(vetor4[2][3]);
        for(int i=0; i < 3; i++)//percorre as linhas
        {
            String linha = "";
            for(int j=0; j<4; j++)//percorre as colunas
            {
                linha += vetor4[i][j] + " ";
            }
            System.out.println(linha);
            System.out.println("---");
        }
        
        
        
        
        
    }
    
}
