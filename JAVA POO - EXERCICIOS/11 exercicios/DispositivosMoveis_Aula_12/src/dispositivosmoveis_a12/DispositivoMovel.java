//DISPOSITIVO MÓVEL É UMA CLASSE MÃE!!!
package dispositivosmoveis_a12;

public abstract class DispositivoMovel {
    //atributos
    public int id;
    private String marca;
    private String modelo;
    private double preco;
    private int anoFabricacao;
    private int processador;
    
    //método construtor vazio
    public DispositivoMovel(){
        id = 0;
        marca = "-";
        modelo = "-";
        preco =0;
        anoFabricacao = 0;
        processador = 0;
    }
    
    public DispositivoMovel (int inID, String inMarca, String inModelo, double inPreco, int inAno, int inProcessador){
        id = inID;
        setMarca (inMarca);
        setModelo (inModelo);
        setPreco (inPreco);
        setAnoFabricacao (inAno);
        setProcessador (inProcessador);
    }
    
    //get e set dos privados

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

 
    public String getModelo() {
        return modelo;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getProcessador() {
        return processador;
    }

    public void setProcessador(int processador) {
        this.processador = processador;
    }
    
    //método - visualização to string
    public String toString(){
        return ("\n  ID: " + id +
                "\n  Marca: " + getMarca() +
                "\n  Modelo: " + getModelo() +
                "\n  Preço: " + getPreco() +
                "\n  Ano de Fabricação: " + getAnoFabricacao() +
                "\n  Processador: " + getProcessador() + "\n");
    }
    
    //método - vida útil
    public abstract int calculaTempoVida();
}//fim---------------------
