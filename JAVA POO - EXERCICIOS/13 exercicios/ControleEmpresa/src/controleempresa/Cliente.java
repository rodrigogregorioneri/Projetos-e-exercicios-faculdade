package controleempresa;


public class Cliente implements Autenticavel{
    
    protected String nome;
    protected String cpf;
    
    public Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String toString()
    {
        return "Cliente: "+this.nome+", "+this.cpf;
    }
    
    @Override
    public boolean autentica()
    {    
        if(this.nome.equals("Pedro")) return true;
        else return false;
    }
    
}
