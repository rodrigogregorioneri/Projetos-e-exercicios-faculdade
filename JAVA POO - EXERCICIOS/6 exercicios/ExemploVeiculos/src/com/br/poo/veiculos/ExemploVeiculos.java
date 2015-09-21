package com.br.poo.veiculos;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class ExemploVeiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ---- Cria o veículo 1 ----
        //Cria um veículo padrão
        Veiculo v1 = new Veiculo();
        //mostra os valores
        //System.out.println( v1.toString() );
        //muda a placa
        v1.setPlaca("ABC-1234");
        //mostra de novo
        //System.out.println( v1.toString() );

        // ---- Cria o veículo 2 ----
        //Criar um veículo específico
        Veiculo v2 = new Veiculo("DEF-5678", "Volkswagen", "GOL", 2012, 23000.00, 0);
        //System.out.println( v2.toString() );
        
        //---- Cria o veículo 3 ----
        Veiculo v3 = new Veiculo("CKF-7864","Volvo","660", 1992, 12588.00, 1);
        
        //---- Cria o veículo 4 ----
        Veiculo v4 = new Veiculo("ABC-4579","Honda","Biz", 2001, 10645.99, 2);
        
        //TODO Colocar os veículos como leitura
        int tamanho = 4;
        Veiculo listaVeiculos[] = {v1, v2, v3, v4};
        
        double media = calcMediaCaminhoes(listaVeiculos);
        System.out.println("A média dos caminhões é: "+media+"\n");
        
        String dadosMaior = getMaiorPreco(listaVeiculos);
        System.out.println("O veículo de maior preço é: "+dadosMaior+"\n");
        
        String dadosMenor = getMenorPreco(listaVeiculos);
        System.out.println("O veículo de menor preço é: "+dadosMenor+"\n");
  
        String resultado = JOptionPane.showInputDialog("Qual o tipo desejado? (0,1,2)") ;
        int tipoDesejado = Integer.parseInt( resultado  ); 
        double med = calcMedia(listaVeiculos, tipoDesejado);
        System.out.println("A média do tipo "+tipoDesejado+" é: "+med+"\n");
        
        mostraTodos(listaVeiculos);
        
        
        
    }
    
    public static double calcMediaCaminhoes(Veiculo lista[])
    {
        double media = 0.0;
        double soma = 0.0;
        int qtde = 0;
        
        for( int i = 0; i<lista.length; i++)
        {
            //verifica se é caminhão
            if( lista[i].getTipo() == 1 )
            {
                soma += lista[i].getPreco();
                qtde++;
            }
        }
        
        media = soma / qtde;
        return media;
    }
    
    public static double calcMedia( Veiculo lista[] , int tipo)
    {
        double media = 0.0;
        double soma = 0.0;
        int qtde = 0;
        
        for( int i = 0; i<lista.length; i++)
        {
            //verifica se é caminhão
            if( lista[i].getTipo() == tipo )
            {
                soma += lista[i].getPreco();
                qtde++;
            }
        }
        
        media = soma / qtde;
        return media;
    }
    
    public static String getMaiorPreco(Veiculo lista[])
    {
        String resposta = "";
        double maior = lista[0].getPreco();
        int posicao = 0;
        for(int i=0; i<lista.length; i++)
        {
                if( lista[i].getPreco() > maior )
                {
                        maior = lista[i].getPreco();
                        posicao = i;
                }
        }
        resposta = lista[posicao].toString();
        return resposta;
    }
    
    public static String getMenorPreco(Veiculo lista[])
    {
        String resposta = "";
        double menor = lista[0].getPreco();
        int posicao = 0;
        for(int i=0; i<lista.length; i++)
        {
                if( lista[i].getPreco() < menor )
                {
                        menor = lista[i].getPreco();
                        posicao = i;
                }
        }
        resposta = lista[posicao].toString();
        return resposta;
    }
    
    public static void mostraTodos( Veiculo lista[] )
    {
        System.out.println("----------- VEÍCULOS -------------");
        for(int i =0; i<lista.length; i++)
        {
            System.out.println( lista[i].toString() );
        }
        System.out.println("----------------------------------------");
    }
    
    
}
