//CLASSE FILHA DE DispositivoMovel

package dispositivosmoveis_a12;

public class Tablet extends DispositivoMovel {
    //Os acelerometro e gps (e respectivos métodos get/set) estão repetidos
    //nas classes Smartphone e Tablet. Poderíamos criar uma classe intermediária
    //(por exemplo, DispositivoMovelPortatil) que seria classe mãe de Smartphone e Tablet.

    private boolean acelerometro;
    private boolean gps;
    
    public Tablet(){
    super();
    acelerometro = false;
    gps = false;
    }
    
    public Tablet(int inID, String inMarca, String inModelo, double inPreco, int inAno, int inProcessador,
            boolean inAcelerometro, boolean inGPS){
    super(inID, inMarca, inModelo, inPreco, inAno, inProcessador);
    setAcelerometro (inAcelerometro);
    setGps (inGPS);
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
        return("\nTablet: " + super.toString() +
                "  Acelerômetro: " + isAcelerometro() +
                "\n  GPS: " + isGps() + "\n");
    }
    
    //metodo calcular temo util
    public int calculaTempoVida(){
      return 4;
    }
    
}//FIM---
