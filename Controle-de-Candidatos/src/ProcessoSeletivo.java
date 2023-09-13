/*

 * Nesse projeto as etapas vão ser aplicadas em cases de 1 á 5
 * Onde vamos abordar cada capitulo desse processo de criação de
 * projeto. Case 1 tratar de condições onde dependendo do valor salaria proposto pelo candidato teremos três tipos de caminhos
 *
 * */
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    //Lembrando que posso fazer um metodo para conter valores como no exemplo abaixo
    public static void main(String[] args) {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
    }

        static void entrandoEmContato(String candidato) {
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do {
                //Elas precisarão sofrerem alteração
                atendeu = atender();
                continuarTentando = !atendeu;
                if (continuarTentando)
                    tentativasRealizadas++;
                else
                    System.out.println("CONTATO REALIZADO COM SUCESSO.");

            }while(continuarTentando && tentativasRealizadas < 3);

                if(atendeu)
                    System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVAS");
                else
                    System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " TENTATIVAS");
        }

        //Metodo auxiliar
        static boolean atender() {
            return new Random().nextInt(3)==1;
        }

    static void imprimirSelecionados() {
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O candidato de n° " + (indice+1) + " é o " + candidatos[indice] );
        }

        System.out.println("Forma abreviada de interação for each");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    //
    static void selecaoCandidatos (){
        // Array com a lista de candidatos
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        //Buscador de candidatos, nesse while que criei ele irá buscar 5 candidatos contidos
        //na variavel CANDIDATOS.

        int candidatosSelecionados = 0;
        int caditadoAtual = 0;
        double salarioBase= 2000.0;
        while(candidatosSelecionados > 5 && caditadoAtual < candidatos.length){
            String candidato = candidatos[caditadoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido + "");
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            caditadoAtual++;
        }
    }

    //Metodo valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;

        //Caso o valor base seja menor que o valor proposto pela empresa.
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO; ");
        }

        //Caso o valor do candidato seja igual que o valor proposto pela empresa.
        else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA; ");
        }

        //Caso o valor solicitado pelo candidato seja maior que o valor proposto
        //Pela empresa.
        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }

    }
}