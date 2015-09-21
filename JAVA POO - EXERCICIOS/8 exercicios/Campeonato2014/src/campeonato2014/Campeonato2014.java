package campeonato2014;
import javax.swing.*;

public class Campeonato2014 {
    //private Atleta atlet[];
    //private int N;
    
    //para testar, valores fixos e não chamaremos o método leituraDeDados();    
    Atleta a1 = new Atleta("Judy Bennet", "USA", "100m", 'F', 12.50f);
    Atleta a2 = new Atleta("Simone Gethz", "Bélgica", "100m", 'F', 11.50f);
    Atleta a3 = new Atleta("Adriane Lopes", "Brasil", "100m", 'F', 13.40f);
    Atleta a4 = new Atleta("Fernando Silva", "Brasil", "100m", 'M', 10.90f);
    Atleta a5 = new Atleta("Edson Nunes", "Brasil", "100m", 'M', 12.00f);    
    Atleta a6 = new Atleta("Luiz Bezerra", "Brasil", "200m", 'M', 11.00f);    
    Atleta a7 = new Atleta("Pedro Vargas", "Brasil", "200m", 'M', 10.00f);    
    Atleta a8 = new Atleta("Luis Simón Álvarez", "Peru", "200m", 'M', 12.10f);    
    
    private Atleta atlet[] = {a1,a2,a3,a4,a5,a6,a7,a8};    
    private int N=8;

    public static void main(String[] args) {
      Campeonato2014 camp = new Campeonato2014();
      System.exit(0);
    }
    
    public Campeonato2014(){
        	//leituraDeDados();
                mostraAtletas();
                JOptionPane.showMessageDialog(null, mulherMenorTempo(), 
                        "Mulher com melhor tempo em 100m", 
                        JOptionPane.INFORMATION_MESSAGE);
                mediaTempoBrasileiros200m();                
    }
    
    public void leituraDeDados() {
	String nome,pais,modalidade; float tempo; char sexo; int i;
        N = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite a quantidade de Atletas"));
        atlet = new Atleta[N];   //aloca memória para o vetor

        for (i=0; i<N; i++){
	      nome  = JOptionPane.showInputDialog( "Digite o nome do atleta " + (i+1) + ": ");
              pais  = JOptionPane.showInputDialog( "Digite o país do atleta " + (i+1) + ": ");
              modalidade = JOptionPane.showInputDialog( "Digite a modalidade deste atleta  (digite 100m ou 200m): ");
	      sexo= JOptionPane.showInputDialog( "Digite o sexo deste atleta (M ou F): ").charAt(0);
	      sexo = Character.toUpperCase(sexo);
              tempo  = Float.parseFloat(JOptionPane.showInputDialog( "Digite o tempo do atleta (em segundos): "));
              atlet[i] = new Atleta(nome,pais,modalidade,sexo,tempo); //aloca memória para o objeto (e executa o método construtor com parâmetros)
        }
}

    public void mostraAtletas () {
        String cad = "";
        for (int i=0; i<N; i++) {
          cad +=  atlet[i].toString()+ "\n";
        }

        JTextArea outputArea = new JTextArea(15,40); 
        outputArea.setText(cad);
            JScrollPane rolagem = new JScrollPane(outputArea);
            JOptionPane.showMessageDialog(null,rolagem,"Dados dos atletas cadastrados",
                                JOptionPane.INFORMATION_MESSAGE);
    }

    public String mulherMenorTempo() {
        float menorTempo = 99999999;
        int posM = 0;
        for (int i=0; i<N; i++) {
            if(atlet[i].getSexo()=='F' 
                    && atlet[i].getModalidade().equalsIgnoreCase("100m") 
                    && atlet[i].getTempo() < menorTempo) {
                menorTempo = atlet[i].getTempo();
                posM= i;
            }
        }
        if (menorTempo != 99999999){
                return ( "A mulher com menor tempo nos 100 m rasos é " 
                        + atlet[posM].toString() );
        } else{
                return " Não existe nenhuma mulher cadastrada nos 100 m rasos.";
        }
    }
    
    public void mediaTempoBrasileiros200m()  {
        int quantbrasileiros = 0;
        float soma = 0;
        for (int i=0; i<N; i++) {
             if(atlet[i].getSexo()=='M' 
                     && atlet[i].getModalidade().equalsIgnoreCase("200m") 
                     && atlet[i].getPais().equalsIgnoreCase("Brasil")) {
               soma += atlet[i].getTempo();
               quantbrasileiros++;
            }
        }
        if (quantbrasileiros != 0) {
                    JOptionPane.showMessageDialog(null,
                        "A média dos tempos dos atletas brasileiros masculinos, na modalidade 200 m rasos, é "
                        + soma/quantbrasileiros + " s.", "Média dos tempos dos brasileiros em 200m", JOptionPane.INFORMATION_MESSAGE);
        } else {
             JOptionPane.showMessageDialog(null,
                     "Nenhum atleta brasileiro encontrado nos 200 m rasos.", 
                     "Média dos tempos Brasileiros",JOptionPane.INFORMATION_MESSAGE);
        }        
    }
    
}