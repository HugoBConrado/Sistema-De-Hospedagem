package sistema_de_hospedagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Quartos {

    private String nomeLocatario;
    private Date dataEntrada;
    private Date dataSaida;
    private int numeroPessoas;
    private double valorDiaria;
    private boolean arcondicionado;
    private boolean banheira;
    //Construtor
    public Quartos(String nomeLocatario, String dataEntrada, String dataSaida, int numeroPessoas, double valorDiaria, boolean arcondicionado , boolean banheira) throws ParseException {
        this.nomeLocatario = nomeLocatario;
        this.dataEntrada = ajustarData(dataEntrada);
        this.dataSaida = ajustarData(dataSaida);
        this.numeroPessoas = numeroPessoas;
        this.valorDiaria = valorDiaria;
        this.arcondicionado = arcondicionado;
        this.banheira = banheira;
    }

    // Método para ajustar a hora de entrada e saída para 12h, caso não seja
    private Date ajustarData(String dataStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date data = sdf.parse(dataStr);

    //Ajusta a hora para 12h
        String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(data) + " 12:00";
        return sdf.parse(dataFormatada);
    }

    //Método para calcular a quantidade de dias de hospedagem
    public int calcularDiasHospedagem() {
        long diffMillis = dataSaida.getTime() - dataEntrada.getTime();
        long diffDias = diffMillis / (1000 * 60 * 60 * 24); // Converte de milissegundos para dias
        return (int) diffDias;
    }

    //Método para calcular o valor total
    public double calcularValorTotal() {
        int dias = calcularDiasHospedagem();
        return dias * valorDiaria;
    }

    // Método para exibir as informações do aluguel
    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return "Locatário: " + nomeLocatario +
                ", Entrada: " + sdf.format(dataEntrada) +
                ", Saída: " + sdf.format(dataSaida) +
                ", Pessoas: " + numeroPessoas +
                ", Valor Total: R$" + String.format("%.2f", calcularValorTotal());
    }

    //Métodos getters e setters (se necessário)
    public String getNomeLocatario() {
        return nomeLocatario;
    }

    public void setNomeLocatario(String nomeLocatario) {
        this.nomeLocatario = nomeLocatario;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    public boolean isarcondicionado() {
        return arcondicionado;
    }

    public void setarcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public boolean isbanheira() {
        return banheira;
    }

    public void setbanheira(boolean banheira) {
        this.banheira = banheira;
    }
   
}
