/*
 *
 */
package dispositivosmoveis_a12;

import java.util.Scanner;
import javax.swing.*;


public class DispositivosMoveis_a12 {
  
        //criar vetor de objetos polimorfos - 10
        DispositivoMovel dm [] = {
            new Smartphone(118072481, "Sony", "Xperia E1", 395.12f, 2013, 12, 4837, true, true),
            new Tablet(3846381, "CCE", "TS72", 399.00f, 2013, 999, true, true),
            new Notebook(117479828, "Samsung", "ATIV Book 2", 1044.05f, 2014, 1007, 500, 4),
            new Smartphone(440188, "LG", "L40", 299.00f, 2014, 44, 7563, false, true),
            new Tablet(117682746, "Samsung", "Tab 3 Lite T110N", 390.13f, 2014, 12, true, false),
            new Notebook(3386850, "HP", "Pavilion x360", 1407.12f, 2013, 2820, 500, 4)
        };
    
        public DispositivosMoveis_a12(){
            mostraDados();
            precoMaior();
            maiorVida();
        }
        
        
    public static void main(String[] args) {
        new DispositivosMoveis_a12();
    }
        
    public void mostraDados(){
       String str = "";
       for (int i=0; i<dm.length; i++){
           str = str + dm[i].toString();
       }
        System.out.println("Dados de todos os Dispositivos ---" + str);
    }//------------------------------------
    
   public void precoMaior(){ 
        float maiorPreco = 0;
        int obj = 0;
        String str = "";
   
   float limite;
   System.out.print("Digite o limite para mostrar aparelhos com preço maior:" );
   Scanner sc = new Scanner(System.in); 
   limite = sc.nextFloat();
   
   for(int i=0; i<dm.length; i++){
       if(dm[i].getPreco() > limite){
        str = str + dm[i].toString();
        obj = obj + 1;
       }
    }
       System.out.println("----------");
       System.out.println("Há " + obj + " objetos acima de R$" + limite + "." +
               "\nSendo os seguintes:\n" + str);
   }//--------------------------------
   
   public void maiorVida(){
       int maiorV = 0;
       String str = "";
       
       //como poderiam ser vários dispositivos, primeiro calculamos
       //o maior tempo de vida:
       for(int i=0; i<dm.length; i++){
           if(dm[i].calculaTempoVida()> maiorV){
             maiorV = dm[i].calculaTempoVida();
           }
        }
 
        //e depois listamos os dispositivos que têm esse tempo de vida:
        for(int i=0; i<dm.length; i++){
           if(dm[i].calculaTempoVida() == maiorV){
             str += dm[i].toString();
           }
        }
        System.out.println("Os dispositivos com maior tempo útil de vida são: \n" + str);
              
   }//--------------------------------
   
    }//fim---
