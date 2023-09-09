//public class whileJava {
//    public static void main(String[] args) {
//        //estrutura do controle de fluxo while
//
//        while (expressão booleana de validação)
//        {
//            // comando que será executado até que a
//            // expressão de validação  torne-se falsa
//        }
//    }
//}

import java.util.concurrent.ThreadLocalRandom;
public class whileJava {
    public static void main(String[] args) {
        //Valor da mesada, valor inicial.
        double mesada = 50.0;
        //Estrutura While repetição até o argumento ser verdadeiro.
        while(mesada>0) {
            //Metodo de importação de valor aleatorio.
            Double valorDoce = valorAleatorio();

            //Compara valor da variavel valorDoce e se ela e maior que mesada
            if(valorDoce > mesada)
                valorDoce = mesada;

            //Print(s)
            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

        /*
         * Não se preocupe quanto a formatação de valores
         * Iremos explorar os recursos de formatação em breve !!
         */
    }

    //Metodo privado que vai gerar o valor da variavel
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
