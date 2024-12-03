package sistema_de_hospedagem;

public class Cliente {

    //Atributos privados
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;

    //Construtor para inicializar os atributos
    public Cliente(String nome, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método para exibir informações do cliente de forma formatada
    @Override
    public String toString() {
        return "Cliente [Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + 
               ", Telefone: " + telefone + ", Email: " + email + "]";
    }

}
