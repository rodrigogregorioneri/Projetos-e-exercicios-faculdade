/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetofigurasgeometricas;

public class Retangulo extends Ponto{
    private float ladoA, ladoB;
    
    public Retangulo(){
        super();
        ladoA = 0.0f; 
        ladoB = 0.0f;
    }
    
    public Retangulo(int x, int y, float ladoA, float ladoB){
        super(x,y);
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
        return "Retângulo com ponto esq. superior em: " + getX() + ", " + getY() + ", de lados: " + getLadoA() + " e " + getLadoB() 
                + ", área: " + getArea() + ", perímetro: " + getPerimetro();
    }
    
}
