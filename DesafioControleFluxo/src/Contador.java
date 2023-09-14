import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        //Scanner para que eu possa digitar meu parametros para o terminal
        Scanner terminal = new Scanner (System.in);

        //Primeiro parametro.
        System.out.println("Digite o primeiro número (PARAMETRO) :");
        int parametroUm = terminal.nextInt();

        //Segundo parametro.
        System.out.println("Digite o primeiro número (PARAMETRO) : ");
        int parametroDois = terminal.nextInt();

        //Caso o PRIMEIRO valor seja menor que o SEGUNDO
        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        }

        //Caso o PRIMEIRO valor seja maior que o SEGUNDO
        catch (ParametrosInvalidosException e) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            //Além de imprimir a mensagem de error;
            System.out.println("Mensagem de error: " + e.getMessage());
        }
    }

        static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
            //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O Segundo número deve ser maior que o primeiro");
            }

            for(int i = parametroUm; i <= parametroDois; i++) {
                System.out.println("Imprimindo o número " + i);
            }
            //int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
        }
    }

    //Necessario ter essa classe ParametrosInvalidosException .
    class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException (String message) {
            super(message);
        }
    }
