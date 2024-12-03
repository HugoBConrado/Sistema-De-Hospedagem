package sistema_de_hospedagem;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import sistema_de_hospedagem.Cliente;
import sistema_de_hospedagem.Quartos;

class Aluguel {

    private Cliente cliente;
    private Quartos quarto;
    private Date dataEntrada;
    private Date dataSaida;
    private double valorTotal;

    public Aluguel(Cliente cliente, Quartos quarto, String dataEntrada, String dataSaida) throws ParseException {
        this.cliente = cliente;
        this.quarto = quarto;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dataEntrada = sdf.parse(dataEntrada);
        this.dataSaida = sdf.parse(dataSaida);
        this.valorTotal = quarto.calcularValorTotal();
    }

    public void exibirRecibo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("\n--- Recibo de Aluguel ---");
        System.out.println("Nome do cliente: " + cliente.getNome());
        System.out.println("Data de entrada: " + sdf.format(dataEntrada));
        System.out.println("Data de saída: " + sdf.format(dataSaida));
        System.out.println("Número de diárias: " + quarto.calcularDiasHospedagem());
        System.out.println("Total a pagar: R$ " + String.format("%.2f", valorTotal));
    }
    
    }