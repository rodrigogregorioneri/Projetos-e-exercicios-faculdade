package exemplo1;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class Trabalhador extends Pessoa{
    private String ctps;
    private double salario;
    private float ch;
    
    public Trabalhador()    
    {
        super();
        this.ctps = "00000-0";
        this.salario = 0.0;
        this.ch = 0.0f;
    }
    
    public Trabalhador(String n, String r, String c, int a, String ctps, double sal, float ch)
    {
        super(n,r,c,a);
        this.ctps = ctps;
        this.salario = sal;
        this.ch = ch;
    }
    
    public double calculaSalario()
    {
        return 13*this.salario;
    }
    
    public String toString()
    {
        String resultado = super.toString();
        resultado += "\nCTPS: "+this.ctps
                   + "\nSalario mensal: "+this.salario
                   + "\nCarga Horária: "+this.ch+"\n";
        return resultado;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public float getCh() {
        return ch;
    }

    public void setCh(float ch) {
        this.ch = ch;
    }
    
    
}
