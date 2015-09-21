package controleempresa;


public class SecretarioAdm extends Secretario{
    
    public SecretarioAdm(String nome, String cpf, double salario)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    @Override
    public double getBonificacao()
    {
        return this.salario * 1.2 + 100.00;
    }
    
    
}
