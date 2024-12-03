package sistema_de_hospedagem;

import java.text.ParseException;

public class QuartoSolteiro extends Quartos {

    private int numeroCamas;
   
    // Construtor
    public QuartoSolteiro(String nomeLocatario, String dataEntrada, String dataSaida, int numeroPessoas, double valorDiaria, boolean arCondicionado, boolean banheira, int numeroCamas) throws ParseException {
        super(nomeLocatario, dataEntrada, dataSaida, numeroPessoas, valorDiaria, arCondicionado, banheira);
        this.numeroCamas = numeroCamas;
    }

    // Getter e Setter para o número de camas
    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        // Validação: Não pode haver número de camas menor que 1
        if (numeroCamas < 1) {
            throw new IllegalArgumentException("O número de camas deve ser pelo menos 1.");
        }
        this.numeroCamas = numeroCamas;
    }

    // Método para calcular o valor total (aqui podemos aplicar uma lógica diferenciada, como aumento por cama extra, etc)
    @Override
    public double calcularValorTotal() {
        double valorTotal = getValorDiaria();
        // Lógica: Cada cama extra além da primeira tem um custo adicional
        if (getNumeroCamas() > 1) {
            valorTotal += (getNumeroCamas() - 1) * 20; // 20 reais por cama extra
        }
        return valorTotal;
    }

    @Override
    public String toString() {
        return String.format("Quarto Solteiro: \n" +
               "Valor da Diária: R$ %.2f\n" +
               "Ar Condicionado: %s\n" +
               "Banheira de Hidromassagem: %s\n" +
               "Número de Camas: %d\n" +
               "Valor Total: R$ %.2f", 
               getValorDiaria(),
               isarcondicionado() ? "Sim" : "Não",  // Correção aqui
               isbanheira() ? "Sim" : "Não",        // Correção aqui
               getNumeroCamas(),
               calcularValorTotal());
    }
}
