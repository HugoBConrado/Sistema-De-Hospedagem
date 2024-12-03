package sistema_de_hospedagem;

import java.util.ArrayList;
import java.util.List;

public class Residencia {
    private String endereco;
    private String numero;
    private String bairro;
    private String cep;
    private String telefone;
    private String email;
    private int numeroQuartos;
    private List<Quartos> quartos;

    // Construtor
    public Residencia(String endereco, String numero, String bairro, String cep, String telefone, String email, int numeroQuartos) {
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
        this.numeroQuartos = numeroQuartos;
        this.quartos = new ArrayList<>(numeroQuartos);  // Corrigido para usar 'numeroQuartos'
    }

    // Métodos getters e setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public List<Quartos> getQuartos() {
        return quartos;
    }

    // Método toString para exibir informações da residência
    @Override
    public String toString() {
        return "Residência [Endereço: " + endereco + ", Número: " + numero + ", Bairro: " + bairro + ", CEP: " + cep + 
               ", Telefone: " + telefone + ", Email: " + email + ", Número de Quartos: " + numeroQuartos + "]";
    }
}
