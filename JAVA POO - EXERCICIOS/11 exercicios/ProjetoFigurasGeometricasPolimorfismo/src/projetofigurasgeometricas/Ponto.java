/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofigurasgeometricas;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class Ponto {
    private float x,y;
    
    public Ponto(){
        x=0.0f;  
        y=0.0f;
    }
    
    public Ponto(float x, float y){
        setX(x);  
        setY(y);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    
    public float getArea () {
        return 0.0f;
    }
    
    public float getPerimetro() {
         return 0.0f;
    }
    
    public String toString() {
        return "Ponto em: " + getX() + ", " + getY() + " (área: 0, perímetro: 0)";
    }
    
}
