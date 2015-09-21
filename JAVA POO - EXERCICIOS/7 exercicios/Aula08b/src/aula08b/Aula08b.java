package aula08b;

public class Aula08b {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double resultado = calc.soma(5.2, 4.3);
        System.out.println("O resultado é = " + resultado);
        System.out.println("O resultado é = " + calc.soma(5.2, 4.3));
    }
    
}
