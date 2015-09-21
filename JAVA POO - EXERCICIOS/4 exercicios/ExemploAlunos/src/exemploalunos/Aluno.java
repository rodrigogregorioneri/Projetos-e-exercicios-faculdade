package exemploalunos;

/**
 *
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 */
public class Aluno {
    
    //Declaração dos atributos globais
    public String nome;
    public String rgm;
    private float notaFinal;
    private float notas[] = new float[3];

    
    
    //Construtores
    public Aluno()
    {
        this.nome = "aluno";
        this.rgm = "0000000-0";
        this.notaFinal = 0.0f;
        notas[0] = 0.0f;
        notas[1] = 0.0f;
        notas[2] = 0.0f;
    }
    
    public Aluno( String n, String r)
    {
        this.nome = n;
        this.rgm = r;
        this.notaFinal = 0.0f;
        for( int i=0; i<3; i++)
        {
            notas[i] = 0.0f;
        }
    }
    
    public void mostra()
    {
        System.out.println("--------------");
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("RGM: " + this.rgm);
        System.out.println("Nota Final: " + this.notaFinal);
        for(int i=0; i<this.notas.length; i++)
        {
            System.out.println("Nota " + (i+1) + " = " + this.notas[i]);
        }
    }
    
    
    
    
    //Criação dos GETTERS e SETTERS
    public float getNotaFinal()
    {
        return this.notaFinal;
    }
    
    public void setNotaFinal( float notaF )
    {
        this.notaFinal = notaF;
    }
 
    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
}
