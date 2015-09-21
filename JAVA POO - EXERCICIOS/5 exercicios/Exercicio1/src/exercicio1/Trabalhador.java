package exercicio1;

public class Trabalhador {
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private String endereco;
    private float salario;
    
    public Trabalhador()
    {
        this.nome = "sem nome";
        this.cpf = "000.000.000-00";
        this.idade = 18;
        this.sexo = "M";
        this.endereco = "Rua X, nº 1";
        this.salario = 724.00f;
    }

    public Trabalhador(String nome, String cpf, int idade, String sexo, String endereco, float salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.endereco = endereco;
        this.salario = salario;
    }
    
    public String mostra()
    {
        String resposta = "---- TRABALHADOR ----\n";
        resposta += "Nome: " + this.nome + "\n";
        resposta += "CPF: " + this.cpf + "\n";
        resposta += "Idade: " + this.idade + "\n";
        resposta += "Sexo: " + this.sexo + "\n";
        resposta += "Endereço: " + this.endereco + "\n";
        resposta += "Salário: " + this.salario + "\n";
        return resposta;
    }
    
    public void mostraSalarioAnual()
    {
        String resposta = "O trabalhador "+this.nome;
        resposta += "recebe "+(13*this.salario)+" por ano.";
        System.out.println(resposta);
    }
    
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
