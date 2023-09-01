public class Main {
    public static void main(String[] args) {
        System.out.println("Aula sobre Operadores");

        //calculando media

        int mediaDoAluno = 10;

        if (mediaDoAluno < 6){
            System.out.print("Você esta REPROVADO!!! ");
        } else if (mediaDoAluno >= 6) {
            System.out.print("APROVADO bom trabalho ");
        }
        else {
            System.out.print("Parabêns você esta MELHOR QUE A MEDIA ");
        }

        //Classe de Operadores matematicos;

        //Coloquei como tipo double pois o valor pode ter mais de uma casa descimal
        double soma = 345 + 98;
        int subtracao = 550 - 50;
        int multiplicacao = 200 * 10;
        int divisao = 300 / 10;
        int moduloResto = 100 % 2;
        double resultado = (10 * 8) + (100 / 10);

        String NomeCOmpleto = "Meu " + "Mundo " + "Sem você ";
        System.out.println(NomeCOmpleto + "Assim que Coda.");
    }
}