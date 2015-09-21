//É UMA CLASSE FILHA DE DispositivoMovel
package dispositivosmoveis_a12;

public class Smartphone extends DispositivoMovel{
    public int numeroChip;
    //Os acelerometro e gps (e respectivos métodos get/set) estão repetidos
    //nas classes Smartphone e Tablet. Poderíamos criar uma classe intermediária
    //(por exemplo, DispositivoMovelPortatil) que seria classe mãe de Smartphone e Tablet.
    private boolean acelerometro;
    private boolean gps;
    
    public Smartphone(){
        super();
        numeroChip = 0;
        acelerometro = false;
        gps = false;
    }
    
    public Smartphone(int inID, String inMarca, String inModelo, double inPreco, int inAno, int inProcessador, 
            int inNumeroChip, boolean inAcelerometro, boolean inGPS){
        super(inID, inMarca, inModelo, inPreco, inAno, inProcessador);
        numeroChip = inNumeroChip;
        setAcelerometro (inAcelerometro);
        setGps(inGPS);
    }
    
    //get e set

    public boolean isAcelerometro() {
        return acelerometro;
    }

    public void setAcelerometro(boolean acelerometro) {
        this.acelerometro = acelerometro;
    }

    public boolean isGps() {
        return gps;
    }

 
    public void setGps(boolean gps) {
        this.gps = gps;
    }
    
    public String toString(){
        return ("\nSmartphone: " + super.toString() + 
                "  Número do Chip: " + numeroChip + 
                "\n  Acelerômetro: " + isAcelerometro() +
                "\n  GPS: " + isGps() + "\n");
    }
    
    //metodo tempo vida
    public int calculaTempoVida(){
        return 3;
    }
    
    //método camada
    public void realizaChamada(int num){
        System.out.println(num);
    }
    
    //método sms
    public String enviaSMS(int num, String text){
    return "Número: " + num +  " - Texto: " + text;
    }
}//fim---
