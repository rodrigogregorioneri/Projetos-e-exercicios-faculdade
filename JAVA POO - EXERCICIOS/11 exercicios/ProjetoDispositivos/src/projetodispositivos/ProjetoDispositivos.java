/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodispositivos;

/**
 *
 * @author 
 */
public class ProjetoDispositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DispositivoMovel vetor[] = new DispositivoMovel[10];
        
        vetor[0] = new Smartphone(1234, true, true, 0, "Samsung", "Galaxy 5", 1890.00, 2014, 2);
        vetor[1] = new Smartphone(345, true, true, 1, "Samsung", "Galaxy Note II", 890.00, 2013, 4);
        vetor[2] = new Smartphone(546, true, true, 2, "Samsung", "Galaxy Note", 540.00, 2013, 2);
        vetor[3] = new Smartphone(98, true, true, 3, "Samsung", "Galaxy", 390.00, 2012, 2);
        vetor[4] = new Smartphone(123, true, true, 4, "Samsung", "Galaxy 3", 1890.00, 2014, 2);
        vetor[5] = new Tablet(true, true, 5, "Apple", "ipad", 2476.90, 2014, 4);
        vetor[6] = new Tablet(true, true, 6, "Apple", "ipad 2", 1566.00, 2014, 4);
        vetor[7] = new Tablet(true, true, 7, "Apple", "ipad mini", 1200.90, 2014, 4);
        vetor[8] = new Notebook(520, 4, 8, "Dell", "Inspiron", 4000.00, 2010, 4);
        vetor[9] = new Notebook(720, 4, 9, "HP", "Pavillion", 3200.00, 2012, 4);
        
        mostraObjetosLimite(700.00, vetor);
        mostraMaiorTempoVida(vetor);
    }
    
    public static void mostraObjetosLimite(double limite, DispositivoMovel[] vetor)
    {
        System.out.println("DISPOSITIVOS COM PREÇO MAIOR QUE "+limite+":\n");
        for(int i=0; i<vetor.length; i++)
        {
            if(vetor[i].getPreco()>=limite) System.out.println(vetor[i].toString());
        }
    }
    
    public static void mostraMaiorTempoVida(DispositivoMovel[] vetor)
    {
        System.out.println("DISPOSITIVO COM MAIOR TEMPO DE VIDA:\n");
        int maior = 0;
        int pos = -1;
        for(int i=0; i<vetor.length; i++)
        {
            int tempo = vetor[i].calculaTempoVida();
            if(tempo>=maior){
                maior = tempo;
                pos = i;
            }
        }
        System.out.println(vetor[pos].toString());
    }
    
}
