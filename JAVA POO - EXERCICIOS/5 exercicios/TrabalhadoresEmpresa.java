//Rodrigo Gregorio Neri - Estudante de Analise e Desenvolvimento de Sistemas

import javax.swing.*;

class Trabalhador {

   private String nome;
   private float salario;
   private char sexo;

   public Trabalhador(){
      nome = "-";
      salario = 0;
      sexo = '-';
   }

   public Trabalhador(String inNome, float inSalario,
   	                  char inSexo) {
      setNome(inNome);
      setSalario(inSalario);
      setSexo(inSexo);
   }

   public void setNome(String inNome) {
      nome = inNome;
   }

   public void setSalario(float inSalario) {
      if (inSalario>0) salario = inSalario; else salario=0;
   }

   public void setSexo(char inSexo) {
   	   sexo = '-';
       if(inSexo=='F' || inSexo=='M') sexo = inSexo;
   }


  public String getNome() {
  	return nome;  //ou this.nome
  }

  public float getSalario() {
  	return salario;  //ou this.salario
  }

  public String getSalarioStr() {
  	return "R$" + salario;
  }

  public char getSexo() {
  	return sexo;
  }

   public String toString()  {
       return(getNome() + ", salário mensal: R$" + getSalario()
       	    + ", salário anual: R$" + salarioAnual()
       		+ ", sexo: " + getSexo());
       //ou:  return(nome + ", salário mensal:" + salario + ", salário anual:" + salarioAnual() + ", sexo:" + sexo);
   }

   public float salarioAnual()  {
   	  return(salario * 13 + salario/3);
   }

} //fim da classe Trabalhador

//--------------------------------------------

public class TrabalhadoresEmpresa {
	//para guardar os dados dos trabalhores da empresa usamos um vetor:
    private Trabalhador trab[];
    int N;

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

 public static void main(String[] args) {
      TrabalhadoresEmpresa  principal = new TrabalhadoresEmpresa();
      System.exit(0);
 }

public void leituraDeDados() {
	String umNome; float umSalario;  char umSexo;
    N = Integer.parseInt(JOptionPane.showInputDialog(
    	"Digite a quantidade de trabalhadores:"));
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
    	    "Mulher",JOptionPane.INFORMATION_MESSAGE);
  	else
    	  JOptionPane.showMessageDialog(null,"A quantidade de mulheres com salário inferior ao salário mínimo (R$724.00) é "
    	    + cont, "Mulheres com salário inferior ao mínimo",JOptionPane.INFORMATION_MESSAGE);
}

}



