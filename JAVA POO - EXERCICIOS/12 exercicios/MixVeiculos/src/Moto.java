public class Moto extends Veiculo{
    
    public Moto (){
      super();
    }

    public Moto( String placa, String marca, String modelo, int ano, float preco, String cor, String loja){
        super(placa,marca,modelo,ano,preco,cor,loja);
    }

    public String toString(){
            return super.toString();
    }  
    
}
