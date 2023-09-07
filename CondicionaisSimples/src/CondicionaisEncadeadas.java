public class CondicionaisEncadeadas {
    public static void main(String[] args) {
        int media = 5;

        if(media >= 7)
            System.out.println("Aprovado");

        else if(media >= 5 && media < 7){//Ou true or false
            System.out.print("Prova de recuperção");
        }

        else{
            System.out.println("Reprovado");
        }


    }
}
