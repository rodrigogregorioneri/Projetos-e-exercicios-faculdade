// Rodrigo Gregorio Neri
package projetofigurasgeometricas;

public class Retangulo {
    private float ladoA, ladoB;
    
    public Retangulo(){
        ladoA = 0.0f; 
        ladoB = 0.0f;
    }
    
    public Retangulo(float ladoA, float ladoB){
        this.ladoA = ladoA; 
        this.ladoB = ladoB;
    }

    public float getLadoA() {
        return ladoA;
    }

    public void setLadoA(float ladoA) {
        this.ladoA = ladoA;
    }

    public float getLadoB() {
        return ladoB;
    }

    public void setLadoB(float ladoB) {
        this.ladoB = ladoB;
    }
    
    public float getArea() {
        return ( ladoA * ladoB );
    }
    
    public float getPerimetro() {
        return ( 2 * ladoA  +  2 * ladoB );
    }
    
    public String toString() {
        return "Retângulo de lados: " + getLadoA() + " e " + getLadoB() 
                + ", com área: " + getArea() + ", com perímetro: " + getPerimetro();
    }
    
}
