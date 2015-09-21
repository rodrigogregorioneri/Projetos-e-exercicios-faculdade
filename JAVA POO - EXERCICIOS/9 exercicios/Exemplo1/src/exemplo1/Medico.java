package exemplo1;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class Medico extends Trabalhador{
    private String crm;
    
    public Medico()
    {
        super();
        this.crm = "00000000-000";
    }
    
    public Medico(String n, String r, String c, int a, String ctps, double salario, float ch, String crm)
    {
        super(n, r, c, a, ctps, salario, ch);
        this.crm = crm;
    }
    
    public double calculaBonus()
    {
        return 0.1*this.getSalario();
    }
    
    public double calculaSalario()
    {
        return this.getSalario()*13 + calculaBonus();
    }        
    
    public String toString()
    {
        String res = super.toString();
        res += "\nCRM: "+this.crm+"\n";
        return res;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
            
    
}
