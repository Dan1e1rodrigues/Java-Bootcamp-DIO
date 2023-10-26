import java.util.Scanner;

public class contaBasica {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);

        System.out.println("Qual e o seu nome ???");
            String nomeDoCliente = conta.nextLine();

        System.out.println("Agora a sua idade ?");
            int suaIdade = conta.nextInt();

            

        System.out.println("Seu nome é " + nomeDoCliente + " é sua idade e " + suaIdade);
    }
}
