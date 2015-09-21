package exemplo1;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class Secretario extends Trabalhador {
    
    public Secretario()
    {
        super();
    }
    
    public Secretario(String n, String r, String c, int a, String ctps, double salario, float ch)
    {
        super(n, r, c, a, ctps, salario, ch);
    }
    
    public double calculaSalario()
    {
        return 14*this.getSalario();
    }
    
}
