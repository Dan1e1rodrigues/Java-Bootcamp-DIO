/*

 * Nesse projeto as etapas vão ser aplicadas em cases de 1 á 5
 * Onde vamos abordar cada capitulo desse processo de criação de
 * projeto.
 *
 * */
public class ProcessoSeletivo {

    //Lembrando que posso fazer um metodo para conter valores como no exemplo abaixo
    public static void main(String[] args) {
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;

        //
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO; ");
        }

        //
        else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA; ");
        }

        //
        else {
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }

    }
}