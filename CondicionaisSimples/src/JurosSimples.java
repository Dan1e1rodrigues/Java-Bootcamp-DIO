import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;

        // TODO: Iterar, baseado no período em anos, para calcular o valorFinal com os juros.
        for (int i = 0; i < periodo; i++) {
            valorFinal += valorFinal * taxaJuros;
        }

        // Agora, vamos formatar o valorFinal usando DecimalFormat
        DecimalFormat df = new DecimalFormat("#.##"); // Define o formato com duas casas decimais
        String valorFinalFormatado = df.format(valorFinal);

        System.out.println("Valor final do investimento: R$ " + valorFinalFormatado);

        scanner.close();
    }
}