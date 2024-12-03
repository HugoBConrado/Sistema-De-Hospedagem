package sistema_de_hospedagem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema_De_Hospedagem {

    public static void main(String[] args) throws ParseException {
        // Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Criando 3 residências com 3 quartos cada
        Residencia residencia1 = new Residencia("Rua das Flores", "123", "Centro", "12345-678", "1234-5678", "contato@residencia1.com", 3);
        residencia1.getQuartos().add(new QuartoSolteiro("João", "10/12/2024 12:00", "12/12/2024 12:00", 1, 100, true, true, 1));
        residencia1.getQuartos().add(new QuartoCasal("Ana", "10/12/2024 12:00", "12/12/2024 12:00", 2, 150, true, false, true));
        residencia1.getQuartos().add(new QuartoSolteiro("Carlos", "10/12/2024 12:00", "12/12/2024 12:00", 1, 110, false, true, 2));

        Residencia residencia2 = new Residencia("Avenida Brasil", "456", "Jardim", "98765-432", "9876-5432", "contato@residencia2.com", 3);
        residencia2.getQuartos().add(new QuartoCasal("Patricia", "15/12/2024 12:00", "17/12/2024 12:00", 2, 180, true, true, false));
        residencia2.getQuartos().add(new QuartoSolteiro("Eduardo", "15/12/2024 12:00", "16/12/2024 12:00", 1, 120, false, true, 1));
        residencia2.getQuartos().add(new QuartoCasal("Luciana", "15/12/2024 12:00", "18/12/2024 12:00", 2, 170, true, true, true));

        Residencia residencia3 = new Residencia("Praça do Sol", "789", "Vila Nova", "11223-445", "1122-3344", "contato@residencia3.com", 3);
        residencia3.getQuartos().add(new QuartoSolteiro("Felipe", "20/12/2024 12:00", "21/12/2024 12:00", 1, 105, true, false, 1));
        residencia3.getQuartos().add(new QuartoCasal("Juliana", "20/12/2024 12:00", "22/12/2024 12:00", 2, 200, false, true, true));
        residencia3.getQuartos().add(new QuartoSolteiro("Ricardo", "20/12/2024 12:00", "22/12/2024 12:00", 1, 115, true, true, 3));

        // Lista de residências
        List<Residencia> residencias = new ArrayList<>();
        residencias.add(residencia1);
        residencias.add(residencia2);
        residencias.add(residencia3);

        // Captura de dados do cliente
        System.out.println("Informe os dados do cliente:");
        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("CPF: ");
        String cpfCliente = scanner.nextLine();
        System.out.print("Endereço: ");
        String enderecoCliente = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneCliente = scanner.nextLine();
        System.out.print("Email: ");
        String emailCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente, enderecoCliente, telefoneCliente, emailCliente);

        // Exibindo as residências e quartos para o usuário escolher
        System.out.println("\nResidências disponíveis para aluguel:");
        for (int i = 0; i < residencias.size(); i++) {
            Residencia residencia = residencias.get(i);
            System.out.println(i + 1 + ". " + residencia);
            for (int j = 0; j < residencia.getQuartos().size(); j++) {
                System.out.println("   " + (j + 1) + ". " + residencia.getQuartos().get(j));
            }
        }

        // Escolher residência e quarto
        System.out.print("\nEscolha a residência (1, 2 ou 3): ");
        int residenciaEscolhida = scanner.nextInt();
        System.out.print("Escolha o quarto (1, 2 ou 3): ");
        int quartoEscolhido = scanner.nextInt();

        Residencia residenciaSelecionada = residencias.get(residenciaEscolhida - 1);
        Quartos quartoSelecionado = residenciaSelecionada.getQuartos().get(quartoEscolhido - 1);

        // Entrada e saída
        scanner.nextLine(); // Limpar buffer
        System.out.print("Data de entrada (dd/MM/yyyy): ");
        String dataEntrada = scanner.nextLine();
        System.out.print("Data de saída (dd/MM/yyyy): ");
        String dataSaida = scanner.nextLine();

        // Criação do aluguel
        Aluguel aluguel = new Aluguel(cliente, quartoSelecionado, dataEntrada, dataSaida);

        // Exibindo o recibo
        aluguel.exibirRecibo();
    }
        
}
