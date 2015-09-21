package cadastrodeartistas;

/**
 *
 * @author Rodrigo Gregorio Neri
 */
public class Artista {
    private String nome;
    private String cidade;
    private String sexo;
    private String modalidade;
    private int tempoTV;

    public Artista(String nome, String cidade, String sexo, String modalidade, int tempoTV) {
        this.nome = nome;
        this.cidade = cidade;
        this.sexo = sexo;
        this.modalidade = modalidade;
        this.tempoTV = tempoTV;
    }
    
    public void mostra()
    {
        System.out.println("--- ARTISTA ---");
        System.out.println("Nome: "+this.nome+"\n");
        System.out.println("Cidade: "+this.cidade+"\n");
        System.out.println("Sexo: "+this.sexo+"\n");
        System.out.println("Modalidade: "+this.modalidade+"\n");
        System.out.println("Tempo de TV: "+this.tempoTV+"\n");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public int getTempoTV() {
        return tempoTV;
    }

    public void setTempoTV(int tempoTV) {
        this.tempoTV = tempoTV;
    }
    
    
    
}
