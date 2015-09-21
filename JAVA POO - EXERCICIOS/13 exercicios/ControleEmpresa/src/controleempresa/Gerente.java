package controleempresa;

public class Gerente extends Funcionario implements Autenticavel{
    
    public Gerente(String nome, String cpf, double salario)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    
    @Override
    public double getBonificacao()
    {
        return this.salario * 1.4 + 1000;
    }
    
    @Override
    public boolean autentica()
    {
        if(this.nome.equals("admin"))
        {
            return true;
        } else {
            return false;
        }
    }
    
}
