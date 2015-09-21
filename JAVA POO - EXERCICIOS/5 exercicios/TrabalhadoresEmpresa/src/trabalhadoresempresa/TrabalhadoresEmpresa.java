package trabalhadoresempresa;
import javax.swing.*;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class TrabalhadoresEmpresa {
    //Armazenaremos os dados dos trabalhores da empresa em um vetor:
    private Trabalhador trab[];
    int N;
    
public static void main(String[] args) {
    TrabalhadoresEmpresa principal = new TrabalhadoresEmpresa();
}

public TrabalhadoresEmpresa () {
	leituraDeDados() ;
	mostraTrabalhadoresCadastrados();
	calculaMediaSalarios();
	mediaSalariosMuheres();
	trabalhadorComMaiorSalario();
	mulherComMenorSalario();
	trabalhadoresComSalarioMenor();
	buscaTextoNosNomesDosTrabalhadores();
        contarMulheresInferiorAoSalarioMinimo();
}

public void leituraDeDados() {
    String umNome; float umSalario;  char umSexo;
    N = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de trabalhadores:"));
    trab = new Trabalhador[N];   //aloca memória para o vetor

    for (int i=0; i<N; i++){
	      umNome = JOptionPane.showInputDialog( "Digite o nome do trabalhador " + (i+1) + ": ");
	      umSalario = Float.parseFloat(JOptionPane.showInputDialog( "Digite o salário de " + umNome + ": "));
	      umSexo= JOptionPane.showInputDialog( "Digite o sexo deste trabalhador: ").charAt(0);
	      umSexo = Character.toUpperCase(umSexo);
    	  trab[i] = new Trabalhador(umNome, umSalario, umSexo); //aloca memória para o objeto (e executa o método construtor com parâmetros)
    	  //o comando anterior poderia ser em etapas:
    	  //	trab[i] = new Trabalhador();  //usando o construtor sem parâmetros
    	  //	trab[i].setNome(umNome);
    	  //	trab[i].setSalario(umSalario);
    	  //	trab[i].setSexo(umSexo);
    }
}

public void mostraTrabalhadoresCadastrados () {
    String cad = "";
    for (int i=0; i<N; i++) {
      cad +=  trab[i].toString()+ "\n";
    }

    JTextArea outputArea = new JTextArea(15,40);  //15 linhas e 40 colunas
    outputArea.setText(cad);
	JScrollPane rolagem = new JScrollPane(outputArea);
	JOptionPane.showMessageDialog(null,rolagem,"Dados dos trabalhadores cadastrados",
	                    JOptionPane.INFORMATION_MESSAGE);
}

public void calculaMediaSalarios () {
    float soma = 0.0f;
    for (int i=0; i<N; i++)  soma += trab[i].getSalario();
	JOptionPane.showMessageDialog(null,"A média dos salários dos trabalhores cadastrados é R$ "
		           + soma/N, "Média",JOptionPane.INFORMATION_MESSAGE);
}

public void mediaSalariosMuheres () {
    float soma = 0.0f;  int quantmulh = 0;
    for (int i=0; i<N; i++)  {
    	if(trab[i].getSexo()=='F') {
    		soma += trab[i].getSalario();
    		quantmulh++;
    	}
    }
    if (quantmulh==0)
   	    JOptionPane.showMessageDialog(null,"Não existem mulheres cadastradas...",
    	    "Média dos salários das mulheres",JOptionPane.INFORMATION_MESSAGE);
    else
       JOptionPane.showMessageDialog(null,"A média dos salários das mulheres cadastradas é R$ "
		   + soma/quantmulh, "Média dos salários das mulheres",JOptionPane.INFORMATION_MESSAGE);
}

public void trabalhadorComMaiorSalario() {
    float maior = trab[0].getSalario();  //suponhamos o 1º trabalhador
    int pos = 0;  //suponhamos o 1º trabalhador
    for (int i=1; i<N; i++)  {  //começamos pelo 2º trabalhador
    	 if(trab[i].getSalario() > maior) {
    		   maior = trab[i].getSalario();
    		   pos = i;  //guardamos a posição
     	}
    }
    JOptionPane.showMessageDialog(null,"O trabalhador com maior salário é "
    	    + trab[pos].toString(), "Maior salário",JOptionPane.INFORMATION_MESSAGE);
}

public void mulherComMenorSalario() {
	//não podemos supor o 1º trabalhador, porque poderia ser um homem
    float menor = 999999;
    int pos = 0;
    for (int i=0; i<N; i++)  {  //começamos pelo 1º trabalhador
    	 if( trab[i].getSalario() < menor && trab[i].getSexo()=='F' ) {
    		   menor = trab[i].getSalario();
    		   pos = i;  //guardamos a posição
     	}
    }
    if (menor == 999999)
      	  JOptionPane.showMessageDialog(null,"Não existem mulheres cadastradas...",
    	    "Mulher com menor salário",JOptionPane.INFORMATION_MESSAGE);
  	else
    	  JOptionPane.showMessageDialog(null,"A mulher com menor salário é "
    	    + trab[pos].toString(), "Mulher com menor salário",JOptionPane.INFORMATION_MESSAGE);
}

public void trabalhadoresComSalarioMenor() {
	String cad = "";
	float salref = Float.parseFloat(JOptionPane.showInputDialog("Digite o salário para comparação:"));
	for (int i=0; i <N; i++){
		if( trab[i].getSalario() < salref ){
		     cad+= trab[i].toString() + "\n";
		}
	}
	JOptionPane.showMessageDialog(null,"Os trabalhadores que recebem um salário menor que o digitado são: \n\n"
	    	    + cad, "Salários menores", JOptionPane.INFORMATION_MESSAGE);
}

public void buscaTextoNosNomesDosTrabalhadores () {
	String cad = "";
	String txtProcurado = JOptionPane.showInputDialog("Digite texto para buscar nos nomes dos trabalhadores:").toUpperCase();
	for (int i=0; i <N; i++) { //usamos toUpperCase() porque indexOf diferencia maiúsculas/minúsculas
		if( trab[i].getNome().toUpperCase().indexOf(txtProcurado)!=-1 ) {
		     cad+= trab[i].toString() + "\n";
		}
	}
	JOptionPane.showMessageDialog(null,"Os trabalhadores com esse texto no nome são: \n\n"
	    	    + cad, "Encontrados", JOptionPane.INFORMATION_MESSAGE);
}

public void contarMulheresInferiorAoSalarioMinimo() {
    int cont = 0;
    for (int i=0; i<N; i++)  {
    	 if( trab[i].getSalario() < 724.0f  && trab[i].getSexo()=='F' ) {
    		   cont++;
     	}
    }
    if (cont == 0)
      	  JOptionPane.showMessageDialog(null,"Não existem mulheres com salário inferior ao salário mínimo (R$724.00)",
    	    "Mulheres",JOptionPane.INFORMATION_MESSAGE);
  	else
    	  JOptionPane.showMessageDialog(null,"A quantidade de mulheres com salário inferior ao salário mínimo (R$724.00) é "
    	    + cont, "Mulheres com salário inferior ao mínimo",JOptionPane.INFORMATION_MESSAGE);
}

}
