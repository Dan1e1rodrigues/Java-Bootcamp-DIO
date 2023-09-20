import java.util.Scanner;

public class saldoBancario {
    public static void main(String[] args) {
        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        int saldoTotal = scanner.nextInt();
        int valorSaque = scanner.nextInt();

        // Calcula o saldo disponível após o saque
        int saldoDisponivel = saldoTotal - valorSaque;

        // Verifica se o saque é possível com base no saldo disponível
        if (saldoDisponivel >= 0) {
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldoDisponivel);
        } else {
            System.out.println("Saldo insuficiente. Saque n0o realizado!");
        }
    }
}
   
