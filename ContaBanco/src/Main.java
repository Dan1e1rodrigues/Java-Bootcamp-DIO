import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner saldo = new Scanner(System.in);

        System.out.println("Por favor, Digite seu nome : ");
            String NomeCliente = saldo.nextLine();

        System.out.println("Por favor, digite o número da sua Agencia !!!: ");
            int Numero = saldo.nextInt();

        // Consuma a quebra de linha pendente.

        //Fazia com que a linha desse error calculando como vazia.
        saldo.nextLine();

        //A adição da linha saldo.nextLine(); após a leitura do número
        // da agência permite que você consuma a quebra de linha pendente,
        // garantindo que a entrada para a variável Agencia seja lida
        // corretamente.

        System.out.println("Qual a sua Agencia : ");
            String Agencia = saldo.nextLine();

        System.out.println("Digite seu saldo : ");
            double Saldo = saldo.nextDouble();

        System.out.println("Óla " + NomeCliente +  " obrigado por criar uma conta em nosso banco, sua agência é " + Numero + " ,conta " + Agencia + " e seu saldo é " + Saldo + ", já está disponível para saque.");
    }
}