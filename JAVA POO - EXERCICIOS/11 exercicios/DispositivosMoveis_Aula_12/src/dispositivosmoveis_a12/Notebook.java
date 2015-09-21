//CLASSE FILHA DE DispositivoMovel
package dispositivosmoveis_a12;

public class Notebook extends DispositivoMovel{
    
    private int hd;
    private int memoriaRAM;
    
    public Notebook(){
        super();
        hd = 0;
        memoriaRAM = 0;
    }
    
    public Notebook (int inID, String inMarca, String inModelo, double inPreco, int inAno, int inProcessador,
            int inHD, int inMemoriaRAM){
        super(inID, inMarca, inModelo, inPreco, inAno, inProcessador);
        setHd (inHD);
        setMemoriaRAM (inMemoriaRAM);
    }
    
    //get e set

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
    
    public String toString(){
        return ("\nNotebook: " + super.toString() +
                "  HD: " + getHd() +
                "\n  Memória RAM: " + getMemoriaRAM() + "\n");
    }

    //método - salvar docs
    public void salvaDocumentos(){
    
    }
    
    //metodo vida útil
    public int calculaTempoVida(){
      return 10;
    }
}//fim---
