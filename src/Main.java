import entities.Juros;
import service.CompostoService;
import service.SimplesService;
import service.TaxaJurosService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        try (Scanner scanner = new Scanner(System.in)) {
            boolean continuar = true;
            while (continuar) {
                int escolha = obterEscolhaCalculo(scanner);
                realizarCalculo(scanner, escolha);
                continuar = desejaContinuar(scanner);
            }
        }

        exibirMensagemFinal();
    }

    private static int obterEscolhaCalculo(Scanner scanner) {
        System.out.println("Escolha seu tipo de cálculo:");
        System.out.println("1 - Juros Simples");
        System.out.println("2 - Juros Compostos");
        System.out.println("3 - Cálculo de taxas de juros");
        return scanner.nextInt();
    }

    private static void realizarCalculo(Scanner scanner, int escolha) {
        switch (escolha) {
            case 1:
                calcularJurosSimples(scanner);
                break;
            case 2:
                calcularJurosCompostos(scanner);
                break;
            case 3:
                calcularTaxaDeJuros(scanner);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    private static void calcularJurosSimples(Scanner scanner) {
        double capital = obterValor("Digite o valor do Capital:", scanner);
        double taxa = obterValor("Digite o valor da taxa de juros (%):", scanner);
        int tempo = obterInteiro("Digite o tempo (ano):", scanner);

        Juros juros = new Juros(capital, taxa, tempo, 0);
        double montante = SimplesService.calcularJurosSimples(juros);
        System.out.printf("Montante: %.2f%n", montante);
    }

    private static void calcularJurosCompostos(Scanner scanner) {
        double capital = obterValor("Digite o capital:", scanner);
        double taxa = obterValor("Digite a taxa de juros (%):", scanner);
        int tempo = obterInteiro("Digite o tempo (ano):", scanner);
        double aporteMensal = obterValor("Digite o aporte mensal:", scanner);

        Juros juros = new Juros(capital, taxa, tempo, aporteMensal);
        double montante = CompostoService.calcularJurosComposto(juros);
        System.out.printf("Montante: %.2f%n", montante);
    }

    private static void calcularTaxaDeJuros(Scanner scanner) {
        double montante = obterValor("Digite o montante final:", scanner);
        double capital = obterValor("Digite o capital inicial:", scanner);
        int tempo = obterInteiro("Digite o tempo (ano):", scanner);
        double aporteMensal = obterValor("Digite o aporte mensal:", scanner);

        Juros juros = new Juros(capital, 0, tempo, aporteMensal);
        juros.setMontante(montante);
        double taxa = TaxaJurosService.calcularTaxaJuros(juros);
        System.out.printf("Taxa de juros: %.2f%%%n", taxa);
    }

    private static double obterValor(String mensagem, Scanner scanner) {
        System.out.println(mensagem);
        return scanner.nextDouble();
    }

    private static int obterInteiro(String mensagem, Scanner scanner) {
        System.out.println(mensagem);
        return scanner.nextInt();
    }

    private static boolean desejaContinuar(Scanner scanner) {
        System.out.println("Deseja realizar outro cálculo? (s/n)");
        char resposta = scanner.next().charAt(0);
        return resposta == 's';
    }

    private static void exibirMensagemFinal() {
        System.out.println("Fim do programa, Desenvolvido por Lucas Franco");
    }
}
