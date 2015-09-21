/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodispositivos;


public class Tablet extends DispositivoMovel {
    
    private boolean acelerometro;
    private boolean gps;

    public Tablet(boolean acelerometro, boolean gps, int id, String marca, String modelo, double preco, int anoFabricacao, int processador) {
        super(id, marca, modelo, preco, anoFabricacao, processador);
        this.acelerometro = acelerometro;
        this.gps = gps;
    }
    
    @Override
    public int calculaTempoVida()
    {
        return this.getAnoFabricacao()+3;
    }

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
    
    
    public String toString()
    {
        return super.toString()+"aceletrômetro: "+this.acelerometro+"\n"
                + "gps: "+this.gps+"\n";
    }
    
}
