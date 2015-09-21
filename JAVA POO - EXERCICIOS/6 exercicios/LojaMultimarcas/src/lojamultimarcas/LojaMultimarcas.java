
package lojamultimarcas;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class LojaMultimarcas {
    private Veiculo veic[];
    private int N;
         
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LojaMultimarcas loja = new LojaMultimarcas();
        System.exit(0);
    }
    
    public LojaMultimarcas() {
        leituraDeDados();
        mediaPrecosCaminhoesVendidos();
        veiculoMaisCaroMaisBarato();
        mediaPrecosDeUmTipoDeVeiculo();
        listarTodosOsVeiculosDaLoja();
    }
    
public void leituraDeDados() {
    String placa,marca,modelo,tipo; int ano; float preco;
    N = Integer.parseInt(JOptionPane.showInputDialog(
            "Digite a quantidade de veículos:"));
    veic = new Veiculo[N];   //aloca memória para o vetor
    for (int i=0; i<N; i++){
	 placa = JOptionPane.showInputDialog( "Digite a placa do veículo " + (i+1) + ": ").toUpperCase();
	 marca = JOptionPane.showInputDialog( "Digite a marca  do veículo " + (i+1) + ": ");
	 modelo = JOptionPane.showInputDialog( "Digite o modelo  do veículo " + (i+1) + ": ");
	 ano = Integer.parseInt(JOptionPane.showInputDialog( "Digite o ano: "));
	 preco = Float.parseFloat(JOptionPane.showInputDialog( "Digite o preço: "));
 	 tipo = JOptionPane.showInputDialog( "Digite o tipo (carro, moto, caminhão) do veículo " + (i+1) + ": ").toLowerCase();
  	 veic[i] = new Veiculo(placa,marca,modelo,ano,preco,tipo); 
    }
}

public void mediaPrecosCaminhoesVendidos () {
    float soma = 0.0f;  int cont = 0;
    for(int i=0; i<N; i++) {
        if( veic[i].getTipo().equalsIgnoreCase("caminhão") ) {
            soma += veic[i].getPreco();
            cont++;
        }
    }
    if(cont!=0){
       JOptionPane.showMessageDialog(null,"Médias dos preços dos caminhões: R$"
	  + soma/cont, "Média dos preços dos caminhões",JOptionPane.INFORMATION_MESSAGE);        
    }
    else {
       JOptionPane.showMessageDialog(null,"Não existem caminhões na loja", 
            "Média preços dos caminhões",JOptionPane.INFORMATION_MESSAGE);        
    }
}

public void veiculoMaisCaroMaisBarato() {
    float caro = veic[0].getPreco(), barato = veic[0].getPreco();  
    int poscaro = 0, posbarato=0;
    for(int i=1; i<N; i++) { //começamos pelo 2º veículo
        if( veic[i].getPreco() > caro ) {
            caro = veic[i].getPreco();
            poscaro = i;
        }
        if( veic[i].getPreco() < barato ) {
            barato = veic[i].getPreco();
            posbarato = i;
        }
    } 
    JOptionPane.showMessageDialog(null,
            "Mais caro: " + veic[poscaro].toString()
	    + "\nMais barato: " + veic[posbarato].toString(), 
            "Veículo mais caro e mais barato",JOptionPane.INFORMATION_MESSAGE);        
}
    

public void mediaPrecosDeUmTipoDeVeiculo () {
    float soma = 0.0f;  int cont = 0; String tipo;
    tipo = JOptionPane.showInputDialog( "Digite o tipo de veículo (carro, moto, caminhão) que deseja analisar: ").toLowerCase();
    for(int i=0; i<N; i++) {
        if( veic[i].getTipo().equalsIgnoreCase(tipo) ) {
            soma += veic[i].getPreco();
            cont++;
        }
    }
    if(cont!=0){
       JOptionPane.showMessageDialog(null,"Médias dos preços dos veículos de tipo " + tipo + ": R$"
	  + soma/cont, "Média dos preços deste tipo de veículo",JOptionPane.INFORMATION_MESSAGE);        
    }
    else {
       JOptionPane.showMessageDialog(null,"Não existem veículos desse tipo na loja", 
            "Média preços deste tipo de veículo",JOptionPane.INFORMATION_MESSAGE);        
    }
}

public void listarTodosOsVeiculosDaLoja() {
    String cad = "";
    for(int i=0; i<N; i++) {
            cad += veic[i].toString() + "\n";
    }
    JOptionPane.showMessageDialog(null,"Veículos cadastrados:\n" + cad, 
            "Dados de todos os veículos da loja",JOptionPane.INFORMATION_MESSAGE);  
}

}
