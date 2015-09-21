package projetodispositivos;


public class DispositivoMovel {
    
    public int id;
    private String marca, modelo;
    private double preco;
    private int anoFabricacao, processador;

    public DispositivoMovel(int id, String marca, String modelo, double preco, int anoFabricacao, int processador) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.anoFabricacao = anoFabricacao;
        this.processador = processador;
    }

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
    
    public String toString()
    {
        return "--- DISPOSITIVO ---\n"
                + "id: "+this.id + "\n"
                + "marca: "+this.marca + "\n"
                + "modelo: "+this.modelo + "\n"
                + "preço: "+this.preco + "\n"
                + "ano de fabricação: "+this.anoFabricacao + "\n"
                + "processador: "+this.processador + "\n";
    }
    
    public int calculaTempoVida()
    {
        return this.anoFabricacao+4;
    }
    
}
