package controleempresa;

//Gerenciador de Bonificações
public class GereneciadorBon {
    
    protected double totalBonificacoes = 0;
    
    public GereneciadorBon()
    {
        
    }
    
    public void registra(Funcionario f)
    {
        this.totalBonificacoes += f.getBonificacao();
    }
    
    public double getTotalBonificacoes()
    {
        return this.totalBonificacoes;
    }
    
}
