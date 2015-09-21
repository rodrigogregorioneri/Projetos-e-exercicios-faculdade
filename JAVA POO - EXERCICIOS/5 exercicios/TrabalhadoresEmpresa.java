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
       return(getNome() + ", sal�rio mensal: R$" + getSalario()
       	    + ", sal�rio anual: R$" + salarioAnual()
       		+ ", sexo: " + getSexo());
       //ou:  return(nome + ", sal�rio mensal:" + salario + ", sal�rio anual:" + salarioAnual() + ", sexo:" + sexo);
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
    trab = new Trabalhador[N];   //aloca mem�ria para o vetor

    for (int i=0; i<N; i++){
	      umNome = JOptionPane.showInputDialog( "Digite o nome do trabalhador " + (i+1) + ": ");
	      umSalario = Float.parseFloat(JOptionPane.showInputDialog( "Digite o sal�rio de " + umNome + ": "));
	      umSexo= JOptionPane.showInputDialog( "Digite o sexo deste trabalhador: ").charAt(0);
	      umSexo = Character.toUpperCase(umSexo);
    	  trab[i] = new Trabalhador(umNome, umSalario, umSexo); //aloca mem�ria para o objeto (e executa o m�todo construtor com par�metros)
    	  //o comando anterior poderia ser em etapas:
    	  //	trab[i] = new Trabalhador();  //usando o construtor sem par�metros
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
	JOptionPane.showMessageDialog(null,"A m�dia dos sal�rios dos trabalhores cadastrados � R$ "
		           + soma/N, "M�dia",JOptionPane.INFORMATION_MESSAGE);
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
   	    JOptionPane.showMessageDialog(null,"N�o existem mulheres cadastradas...",
    	    "M�dia dos sal�rios das mulheres",JOptionPane.INFORMATION_MESSAGE);
    else
       JOptionPane.showMessageDialog(null,"A m�dia dos sal�rios das mulheres cadastradas � R$ "
		   + soma/quantmulh, "M�dia dos sal�rios das mulheres",JOptionPane.INFORMATION_MESSAGE);
}

public void trabalhadorComMaiorSalario() {
    float maior = trab[0].getSalario();  //suponhamos o 1� trabalhador
    int pos = 0;  //suponhamos o 1� trabalhador
    for (int i=1; i<N; i++)  {  //come�amos pelo 2� trabalhador
    	 if(trab[i].getSalario() > maior) {
    		   maior = trab[i].getSalario();
    		   pos = i;  //guardamos a posi��o
     	}
    }
    JOptionPane.showMessageDialog(null,"O trabalhador com maior sal�rio � "
    	    + trab[pos].toString(), "Maior sal�rio",JOptionPane.INFORMATION_MESSAGE);
}

public void mulherComMenorSalario() {
	//n�o podemos supor o 1� trabalhador, porque poderia ser um homem
    float menor = 999999;
    int pos = 0;
    for (int i=0; i<N; i++)  {  //come�amos pelo 1� trabalhador
    	 if( trab[i].getSalario() < menor && trab[i].getSexo()=='F' ) {
    		   menor = trab[i].getSalario();
    		   pos = i;  //guardamos a posi��o
     	}
    }
    if (menor == 999999)
      	  JOptionPane.showMessageDialog(null,"N�o existem mulheres cadastradas...",
    	    "Mulher com menor sal�rio",JOptionPane.INFORMATION_MESSAGE);
  	else
    	  JOptionPane.showMessageDialog(null,"A mulher com menor sal�rio � "
    	    + trab[pos].toString(), "Mulher com menor sal�rio",JOptionPane.INFORMATION_MESSAGE);
}

public void trabalhadoresComSalarioMenor() {
	String cad = "";
	float salref = Float.parseFloat(JOptionPane.showInputDialog("Digite o sal�rio para compara��o:"));
	for (int i=0; i <N; i++){
		if( trab[i].getSalario() < salref ){
		     cad+= trab[i].toString() + "\n";
		}
	}
	JOptionPane.showMessageDialog(null,"Os trabalhadores que recebem um sal�rio menor que o digitado s�o: \n\n"
	    	    + cad, "Sal�rios menores", JOptionPane.INFORMATION_MESSAGE);
}

public void buscaTextoNosNomesDosTrabalhadores () {
	String cad = "";
	String txtProcurado = JOptionPane.showInputDialog("Digite texto para buscar nos nomes dos trabalhadores:").toUpperCase();
	for (int i=0; i <N; i++) { //usamos toUpperCase() porque indexOf diferencia mai�sculas/min�sculas
		if( trab[i].getNome().toUpperCase().indexOf(txtProcurado)!=-1 ) {
		     cad+= trab[i].toString() + "\n";
		}
	}
	JOptionPane.showMessageDialog(null,"Os trabalhadores com esse texto no nome s�o: \n\n"
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
      	  JOptionPane.showMessageDialog(null,"N�o existem mulheres com sal�rio inferior ao sal�rio m�nimo (R$724.00)",
    	    "Mulher",JOptionPane.INFORMATION_MESSAGE);
  	else
    	  JOptionPane.showMessageDialog(null,"A quantidade de mulheres com sal�rio inferior ao sal�rio m�nimo (R$724.00) � "
    	    + cont, "Mulheres com sal�rio inferior ao m�nimo",JOptionPane.INFORMATION_MESSAGE);
}

}



