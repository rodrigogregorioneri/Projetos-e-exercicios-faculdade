/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodispositivos;


public class Smartphone extends DispositivoMovel {

    public int numeroChip;
    private boolean acelerometro;
    private boolean gps;

    public Smartphone(int numeroChip, boolean acelerometro, boolean gps, int id, String marca, String modelo, double preco, int anoFabricacao, int processador) {
        super(id, marca, modelo, preco, anoFabricacao, processador);
        this.numeroChip = numeroChip;
        this.acelerometro = acelerometro;
        this.gps = gps;
    }
    
    @Override
    public int calculaTempoVida()
    {
        return this.getAnoFabricacao()+2;
    }
    
    public void realizaChamada(int num)
    {
        System.out.println("Chamando "+num+"...");
    }
    
    public void enviaSMS(int num, String text)
    {
        System.out.println("Enviando SMS "+num+":\n"+text);
    }

    public int getNumeroChip() {
        return numeroChip;
    }

    public void setNumeroChip(int numeroChip) {
        this.numeroChip = numeroChip;
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
                + "gps: "+this.gps+"\n"
                + "número chip: "+this.numeroChip+"\n";
    }
}
