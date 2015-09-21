package projetofigurasgeometricas;


public class Circulo extends Ponto {
    private float raio;
    
    //dois métodos construtores:
    
    public Circulo () {
        super();
        setRaio(0.0f);
    }
    
    public Circulo (float x, float y, float raio) {
        super(x,y);
        setRaio(raio);
    }
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    public float getDiametro () {
        return (2 * raio);
    }
    
    public float getArea () {
        return ( (float)Math.PI * (raio * raio) ); //poderíamos usar getRaio()
    }
    
    public float getPerimetro() {
        return(2.0f * (float)Math.PI * raio);
    }
    
    public String toString () {
       //Este método retornará os dados deste círculo. Observe que getX() e getY() são 
       //métodos da classe Ponto.
       return ( "Círculo com centro em: " + getX() + ", " + getY() + ", raio: " + getRaio() + ", diâmetro: "
                + getDiametro() + ", área: " + getArea() + ", perímetro: " + getPerimetro()  ); 
    }    
    
}//fim da classe


