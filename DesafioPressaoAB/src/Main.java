import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner terminal = new Scanner (System.in);

        System.out.println("Quanto esta a sua pressão ? ");
        Double suaPressao = terminal.nextDouble();

        //
        if (suaPressao > 12.8  ){
            System.out.println("Sua pressão arterial esta alta, TOME MAIS CUIDADO");
        }
        //
        else if (suaPressao < 9){
            System.out.println("Sua pressão arterial esta baixa, TOME MAIS CUIDADO");
        }
        //
        else{
            System.out.println("Sua pressão arterial esta saudavel");
        }

        System.out.println("Sua pressão é " + suaPressao);
    }
}