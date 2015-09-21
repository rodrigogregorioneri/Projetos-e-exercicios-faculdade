public class Automovel extends Veiculo{
        private String tipo_auto;        
        
        public Automovel(){
            super();
            this.tipo_auto = "";
        }        
        
        //public Automovel( String placa, String marca, String modelo, int ano, float preco, String cor, String loja, String tipo_auto ){
        public Automovel( String placa, String marca, String modelo, int ano, float preco, String cor, String loja, String tipo_auto ){
            super(placa,marca,modelo,ano,preco,cor,loja);
            setTipo_auto(tipo_auto);
        }   

    /**
     * @return the tipo_auto
     */
    public String getTipo_auto() {
        return tipo_auto;
    }

    /**
     * @param tipo_auto the tipo_auto to set
     */
    public void setTipo_auto(String tipo_auto) {
        this.tipo_auto = tipo_auto;
    }

    public String toString(){
        return super.toString() +
                    ", tipo automóvel: "+ getTipo_auto() ;
    }    

}
