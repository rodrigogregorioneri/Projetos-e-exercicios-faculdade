package projetofigurasgeometricas;


import java.text.DecimalFormat;
import javax.swing.*;

public class ProjetoFigurasGeometricas {

    public static void main(String[] args) {        
        
        //Vetor de objetos polimorfos para testar:
        Ponto fig [] = {
            new Ponto(45,65), new Circulo(5, 5, 35.0f), 
            new Retangulo(100, 100, 70.0f, 80.0f),
            new Circulo(20, 30, 20.0f), new Ponto(0,0),
            new Retangulo(15, 15, 10.0f, 3.0f), new Circulo(0, 0, 1.0f) 
        };
        
        DecimalFormat fmt = new DecimalFormat("0.00");
        
        //Mostrar todas as figuras registradas por este programa:
        String str = "";
        for(int i=0; i<fig.length; i++) {
            str += fig[i].toString() + "\n";
        }
        JTextArea outputArea = new JTextArea(15,80);  //15 linhas e 40 colunas
        outputArea.setText(str);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Dados de todas as figuras registradas",
	                    JOptionPane.INFORMATION_MESSAGE);
        
        //Calcula a soma das áreas das figuras registradas:
        float somaAreas = 0.0f;
        for(int i=0; i<fig.length; i++) {
            somaAreas += fig[i].getArea();
        }
        JOptionPane.showMessageDialog(null, "Soma das áreas das figuras registradas: " +
                fmt.format(somaAreas),
                "Soma das áreas das figuras registradas", JOptionPane.INFORMATION_MESSAGE);
        
        //Figura com maior perímetro:
        float maiorPerim = 0.0f;  int pos = 0;
        for(int i=0; i<fig.length; i++) {
            if(fig[i].getPerimetro() > maiorPerim) {
                maiorPerim = fig[i].getPerimetro();
                pos = i;
            }
        }
        JOptionPane.showMessageDialog(null,"Figura com maior perímetro: " + fig[pos].toString(),
                "Figura com maior perímetro: " 
                 +  fmt.format(maiorPerim), JOptionPane.INFORMATION_MESSAGE);
       
        //Círculo com maior diâmetro:
        float maiorDiam = 0.0f;  int poscirc = -1;
        for(int i=0; i<fig.length; i++) {
            if(fig[i] instanceof Circulo) {
                if( ((Circulo)fig[i]).getDiametro() > maiorDiam) {
                    maiorDiam = ((Circulo)fig[i]).getDiametro();
                    poscirc = i;
                }
            }
        }
        if(poscirc != -1){
            JOptionPane.showMessageDialog(null,"Círculo com maior diâmetro: " + fig[poscirc].toString(),
                "Círculo com maior diâmetro: " 
                        +  fmt.format(maiorDiam), JOptionPane.INFORMATION_MESSAGE);
        }
               
    }
    
}
