package campeonato2014;

public class Atleta {
   private String nome, pais;
   private float tempo;
   String modalidade;
   private char sexo;
   
   public Atleta(){
       nome= "-";
       pais= "-";
       modalidade= "-";
       sexo='-';
       tempo= 0;
   }
   
   public Atleta (String nome, String pais, String modalidade, 
           char sexo, float tempo){
       setNome(nome); 
       setPais(pais);
       setModalidade(modalidade);
       setSexo(sexo);
       setTempo(tempo);
   }    
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the modalidade
     */
    public String getModalidade() {
        return modalidade;
    }

    /**
     * @param modalidade the modalidade to set
     */
    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    /**
     * @return the tempo
     */
    public float getTempo() {
        return tempo;
    }

    /**
     * @param tempo the tempo to set
     */
    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    /**
     * @return the sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(char sexo) {
       this.sexo = sexo;       
    }
    
    public String toString(){
        return (getNome()
                + ", " + getPais()
                + ", " + getModalidade()
                + ", " + getSexo()
                + ", " + getTempo()+" s.");
    }
    
}
