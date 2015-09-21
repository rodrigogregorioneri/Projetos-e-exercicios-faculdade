package cadastrodeartistas;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class CadastroDeArtistas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Artista artistas[];
        int quant = Integer.parseInt(JOptionPane.showInputDialog("Quantos artistas deseja cadastrar?"));
        artistas = new Artista[quant];
        
        for(int i=0; i<quant; i++)
        {
            String nome = JOptionPane.showInputDialog("Nome do artista "+(i+1));
            String cidade = JOptionPane.showInputDialog("Cidade do artista "+(i+1));
            String sexo = JOptionPane.showInputDialog("Sexo do artista "+(i+1)+" (M ou F)");
            String modalidade = JOptionPane.showInputDialog("Modalidade do artista "+(i+1)+" (Ator ou Apresentador)");
            int tempoTV = Integer.parseInt(JOptionPane.showInputDialog("Quanto tempo o artista "+(i+1)+" atua na TV?"));
            artistas[i] = new Artista(nome, cidade, sexo, modalidade, tempoTV);
        }
        
        mostraAtrizTempo(artistas);
        mediaTempoApresentador(artistas);
    }
    
    public static void mostraAtrizTempo(Artista[] artistas)
    {
        int pos = -1;
        for(int i = 0; i<artistas.length; i++)
        {
            String sexo = artistas[i].getSexo();
            String modalidade = artistas[i].getModalidade();
            int tempoTV = artistas[i].getTempoTV();
            
            int maior = artistas[0].getTempoTV();
            
            if(sexo.equalsIgnoreCase("F") && modalidade.equalsIgnoreCase("ATOR") && tempoTV > maior)
            {
                maior = tempoTV;
                pos = i;
            }
        }
            System.out.println("Atriz com mais tempo de atuação na TV:\n");
        if(pos!=-1){
            artistas[pos].mostra();
        } else {
            System.out.println("Nenhum artista que preenche os requisitos foi cadastrad0!");
        }
    }
    
    public static void mediaTempoApresentador(Artista[] artistas)
    {
        int quant = 0;
        float soma = 0;
        
        for(int i = 0; i<artistas.length; i++)
        {
            String sexo = artistas[i].getSexo();
            String modalidade = artistas[i].getModalidade();
            String cidade = artistas[i].getCidade();
            int tempoTV = artistas[i].getTempoTV();

            if(sexo.equalsIgnoreCase("M") && modalidade.equalsIgnoreCase("APRESENTADOR") && cidade.equalsIgnoreCase("SÃO PAULO"))
            {
                soma += tempoTV;
                quant++;
            }
        }
        
        float media = soma/quant;
        System.out.println("\nA média do tempo de atuação dos apresentadores homens de São Paulo é: "+media);
    }
    
}
