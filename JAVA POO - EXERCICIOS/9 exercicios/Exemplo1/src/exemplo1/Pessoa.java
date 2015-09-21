package exemplo1;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class Pessoa {
    private String nome, rg, cpf;
    private int anoNasc;
    
    public Pessoa()
    {
        this.nome = "Sem nome";
        this.rg = "00.000-000";
        this.cpf = "000.000.000-00";
        this.anoNasc = 1980;
    }
    
    public Pessoa(String n, String r, String c, int a)
    {
        this.nome = n;
        this.rg = r;
        this.cpf = c;
        this.anoNasc = a;
    }
    
    public int calculaIdade()
    {
        int idade = 2014-anoNasc;
        return idade;
    }
    
    @Override
    public String toString()
    {
        String resultado = "--- PESSOA ---"
        + "\nNome: "+this.nome
        + "\nRG: "+this.rg
        + "\nCPF: "+this.cpf
        + "\nIdade: "+this.calculaIdade()+"\n";
        return resultado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }
    
    
    
}
