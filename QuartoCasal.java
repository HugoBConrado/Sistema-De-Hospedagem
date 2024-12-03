package sistema_de_hospedagem;

import java.text.ParseException;

public class QuartoCasal extends Quartos {

    private boolean berco;

    // Construtor
    public QuartoCasal(String nomeLocatario, String dataEntrada, String dataSaida, int numeroPessoas, double valorDiaria, boolean arCondicionado, boolean banheira, boolean berco) throws ParseException {
        super(nomeLocatario, dataEntrada, dataSaida, numeroPessoas, valorDiaria, arCondicionado, banheira);
        this.berco = berco;
    }

    // Getter e Setter para o berço
    public boolean isBerco() {
        return berco;
    }

    public void setBerco(boolean berco) {
        this.berco = berco;
    }

    // Método para calcular o valor total (se houver custo adicional por berço)
    @Override
    public double calcularValorTotal() {
        double valorTotal = getValorDiaria();
        if (isBerco()) {
            valorTotal += 30; // Supondo que o berço tenha um custo adicional de 30 reais
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return String.format("Quarto Casal: \n" +
               "Valor da Diária: R$ %.2f\n" +
               "Ar Condicionado: %s\n" +
               "Banheira de Hidromassagem: %s\n" +
               "Berço: %s\n" +
               "Valor Total: R$ %.2f", 
               getValorDiaria(),
               isarcondicionado() ? "Sim" : "Não", // Correção aqui
               isbanheira() ? "Sim" : "Não",       // Correção aqui
               isBerco() ? "Sim" : "Não",
               calcularValorTotal());
    }
}
