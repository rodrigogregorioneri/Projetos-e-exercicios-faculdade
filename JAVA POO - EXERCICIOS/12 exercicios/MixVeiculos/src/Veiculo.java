public abstract class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private float preco;
    private String cor;
    private String loja;
    
    public Veiculo(){
        placa="";
        marca="";
        modelo="";
        ano=0;
        preco=0.0f;
        cor="";
        loja="";
    }

    public Veiculo(String placa, String marca, String modelo, int ano, float preco, String cor, String loja){
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setPreco(preco);
        setCor(cor);
        setLoja(loja);
    }    
    
    /**
     * @return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the preco
     */
    public float getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(float preco) {
        this.preco = preco;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the loja
     */
    public String getLoja() {
        return loja;
    }

    /**
     * @param loja the loja to set
     */
    public void setLoja(String loja) {
        this.loja = loja;
    }
        
    public String toString(){
        return "Placa: " + getPlaca() + ", " +
                    "Marca: " + getMarca() + ", " + 
                    "Modelo: " + getModelo()+ ", " +
                    "Ano: " + getAno() + ", " +
                    "Preço: " + getPreco()+ ", " +
                    "Cor: " + getCor()+ ", " +
                    "Loja: " + getLoja();
    }   
    
}
