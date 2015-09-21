/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodispositivos;


public class Notebook extends DispositivoMovel{
    
    private int hd, memoriaRAM;

    public Notebook(int hd, int memoriaRAM, int id, String marca, String modelo, double preco, int anoFabricacao, int processador) {
        super(id, marca, modelo, preco, anoFabricacao, processador);
        this.hd = hd;
        this.memoriaRAM = memoriaRAM;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }
    
    @Override
    public int calculaTempoVida()
    {
        return this.getAnoFabricacao()+10;
    }
    
    public void salvaDocumentos()
    {
        System.out.println("salvando documento!");
    }
 
    public String toString()
    {
        return super.toString()+"hd: "+this.hd+"\n"
                + "memória RAM: "+this.memoriaRAM+"\n";
    }
    
}
