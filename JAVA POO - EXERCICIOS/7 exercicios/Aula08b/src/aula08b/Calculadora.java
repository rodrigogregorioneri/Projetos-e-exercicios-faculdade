package aula08b;

public class Calculadora {
    //1. VARIÁVEIS GLOBAIS
    
    //2. CONSTRUTOR(ES)
    public Calculadora()
    {
        
    }
    
    //3. MÉTODOS
    //SOMA dois números decimais
    //modificador tipo_de_retorno nome parâmetros
    public double soma(double v1, double v2)
    {
        double res = 0.0;
        res = v1 + v2;
        return res;
    }
    
    public double subtrai(double v1, double v2)
    {
        double res = 0.0;
        res = v1 - v2;
        return res;
    }
    
    public double multiplica(double v1, double v2)
    {
        double res = 0.0;
        res = v1 * v2;
        return res;
    }
    
    public double divide(double v1, double v2)
    {
        double res = 0.0;
        res = v1 / v2;
        return res;
    }
    
    public int potencia(int base, int expoente)
    {
        int resp = 1;
        for(int i=0; i<expoente; i++)
        {
            resp = resp * base;
            //resp *= base;
        }
        return resp;
    }
    
    //multiplica sem usar o sinal de vezes
    public int multiplica2(int v1, int v2)
    {
        int resp = 0;
        for(int i=0; i<v2; i++)
        {
            resp += v1;
        }
        return resp;
    }
    
    public int fatorial(int num)
    {
        int fat = 1;
        for(int i = num; i>=1; i--)
        {
            fat = fat * i;
        }
        return fat;
    }
    
    
    
}
