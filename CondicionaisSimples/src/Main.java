public class Main {
    public static void main(String[] args) {
        double saldo = 52.5 ;
        double valorSolicitado = 23.0 ;

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo " + saldo + " Trasação ACEITA");
        }
        else{
            System.out.println("Saldo insuficiente, valor da conta " + saldo + " Transação NEGATIVADA");
                }
    }
}

//      Estrutura condicional simples
//        int saldo = 1200 ;
//
//        if(saldo <= 0){
//            System.out.println("Seu saldo e negativo");
//        }
//        else{
//            System.out.println("Seu saldo esta positivo");
//        }

//Exemplo de Condicional SImples, mais de 2 resultados