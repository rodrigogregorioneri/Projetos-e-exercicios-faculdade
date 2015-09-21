package exercicio1;
//Rodrigo Gregorio Neri - Estudante de Analise e Desenvolvimento de Sistemas
import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
        
        int quant = 1;
        Trabalhador lista[];
        lista = new Trabalhador[quant]; 
        
        for(int i=0; i<quant; i++)
        {
            String nome = JOptionPane.showInputDialog(null,"Qual o nome do trabalhador número "+i);
            String cpf = JOptionPane.showInputDialog(null,"Qual o CPF do trabalhador número "+i);
            int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"Qual a idade do trabalhador número "+i));
            String sexo = JOptionPane.showInputDialog(null,"Qual o sexo do trabalhador número "+i);
            String endereco = JOptionPane.showInputDialog(null,"Qual o endereço do trabalhador número "+i);
            float salario = Float.parseFloat(JOptionPane.showInputDialog(null,"Qual o salário do trabalhador número "+i));
            
            lista[i] = new Trabalhador(nome, cpf, idade, sexo, endereco, salario);
        }
        
        
        for(int j=0; j<lista.length; j++)
        {
            System.out.println(lista[j].mostra());
        }
        
        //mostraMulheres(lista);
        
        abacaxi(lista,"Cacique");
        
    }
    
    public static void mostraMulheres(Trabalhador lista2[])
    {
        for(int i=0; i<lista2.length; i++)
        {
            String sexo = lista2[i].getSexo();
            if( sexo.equalsIgnoreCase("F") ) System.out.println(lista2[i].mostra());
        }
    }
    
    
    public static void mostraHomens(Trabalhador lista2[])
    {
        for(int i=0; i<lista2.length; i++)
        {
            String sexo = lista2[i].getSexo();
            if( sexo.equalsIgnoreCase("H") ) System.out.println(lista2[i].mostra());
        }
    }
    
    public static void mostraMenorSalario(Trabalhador lista2[])
    {
        int pos = 0;
        float menor = lista2[pos].getSalario();
        for(int i=0; i<lista2.length; i++)
        {
            if(lista2[i].getSalario() < menor)
            {
                menor = lista2[i].getSalario();
                pos = i;
            }
        }
        System.out.println("---- Menor salário ----\n");
        System.out.println(lista2[pos].mostra());
    }
    
    public static void mediaSalarios(Trabalhador lista2[])
    {
        float soma = 0.0f;
        for(int i=0; i<lista2.length; i++)
        {
            soma += lista2[i].getSalario();
        }
        float media = soma / lista2.length;
        System.out.println("A média dos salários é: "+media);
    }
    
    public static void mediaSalariosHomens(Trabalhador lista2[])
    {
        float soma = 0.0f;
        int numHomens = 0;
        for(int i=0; i<lista2.length; i++)
        {
            if(lista2[i].getSexo().equalsIgnoreCase("M"))
            {
                soma += lista2[i].getSalario();
                numHomens++;
            }
            
        }
        float media = soma / numHomens;
        System.out.println("A média dos salários é: "+media);
    }
    
    public static void abacaxi(Trabalhador lista2[], String texto)
    {
        System.out.println("ABACAXI");
        for(int i=0; i<lista2.length; i++)
        {
            String nome = lista2[i].getNome();
            if( nome.indexOf(texto) != -1)
            {
                System.out.println(lista2[i].mostra());
            }
        }
    }
    
    
    
}
