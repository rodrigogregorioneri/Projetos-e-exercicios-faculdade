package exemplo1;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class Exemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Cacique","44.444-44","111.111.111.11",1987);
        Pessoa pessoa2 = new Pessoa();
        
        Trabalhador trab1 = new Trabalhador("Pedro", "77.777-777", "222.222.222.22", 1986, "88888-8", 475.80, 40f);
        Trabalhador trab2 = new Trabalhador();
        
        Secretario sec1 = new Secretario("Pedro 2","21.212.212", "456.789.123-00", 1965, "789546-1", 1000.0, 40f);
        Secretario sec2 = new Secretario();
        
        Medico med1 = new Medico("Carlos", "123546-78", "879.546.213.00", 1972, "000012457-5", 1000.0, 20f, "12345678999-2");
        Medico med2 = new Medico();
        
        System.out.println( med1.calculaIdade());
        
    }
    
}
