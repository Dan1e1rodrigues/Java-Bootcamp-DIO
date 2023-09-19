import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner localidade = new Scanner(System.in);

        System.out.println("ESCOLHA UM DESSES ESTADOS PARA VIAJAR MG,SP,RJ,SC,ES");

        System.out.println("QUAL ESTADO VOCÊ QUER IR : ");
        String nomeShow = localidade.nextLine();

        if(nomeShow.equals("MG")){
            System.out.println("O valor dessa viagem é R$ 150.00");
        }
        else if(nomeShow.equals("SP")) {
            System.out.println("O valor dessa viagem é R$ 150.00");
        }
        else if(nomeShow.equals("RJ")) {
            System.out.println("O valor dessa viagem é R$ 150.00");
        }
        else if(nomeShow.equals("SC")) {
            System.out.println("O valor dessa viagem é R$ 150.00");
        }
        else if(nomeShow.equals("ES")) {
            System.out.println("O valor dessa viagem é R$ 150.00");
        }
        else{
            System.out.println("Nenhum item encontrado");
        }

        System.out.println(nomeShow);
    }
}