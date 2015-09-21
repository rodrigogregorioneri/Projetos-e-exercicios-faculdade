public class Caminhao extends Veiculo{
    private float cargamax;
    private int qtde_eixos; 
           
    public Caminhao(){
        super();
        cargamax = 0.0f;
        qtde_eixos = 0;
    }

    public Caminhao( String placa, String marca, String modelo, int ano, float preco, String cor, String loja, float cargamx, int qtde_eixo ){
        super(placa,marca,modelo,ano,preco,cor,loja);
        setCargamax(cargamx);
        setQtde_eixos(qtde_eixo);
    }

    /**
     * @return the cargamx
     */
    public float getCargamax() {
        return cargamax;
    }

    /**
     * @param cargamx the cargamx to set
     */
    public void setCargamax(float cargamx) {
        this.cargamax = cargamx;
    }

    /**
     * @return the qtde_eixo
     */
    public int getQtde_eixos() {
        return qtde_eixos;
    }

    /**
     * @param qtde_eixo the qtde_eixo to set
     */
    public void setQtde_eixos(int qtde_eixos) {
        this.qtde_eixos = qtde_eixos;
    }

    public String toString(){
        return super.toString() +
                    ", Carga máx.: " + getCargamax()  + ", " +
                    "Qtde. eixos: "+ getQtde_eixos();
    }
    
}
