package controleempresa;


public class SecretarioAgencia extends Secretario{
    
    public SecretarioAgencia(String nome, String cpf, double salario)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    @Override
    public double getBonificacao()
    {
        return this.salario * 1.2;
    }
    
}
