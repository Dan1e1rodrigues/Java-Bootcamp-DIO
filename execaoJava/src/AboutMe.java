import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.CANADA);

            System.out.println("Digite seu primeiro nome : ");
            String nome = scanner.next();

            System.out.println("Digite seu primeiro sobrenome : ");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade : ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura : ");
            Double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Olá, meu nome é " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Tenho " + idade + " anos de idade");
            System.out.println("Minha altura é " + altura + "cm ");
            scanner.close();
        //Temos o catch para a resposta negativa, caso ocorra algum error nessa
        //importação
        }
        catch (InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numericos");
        }
    }
}
