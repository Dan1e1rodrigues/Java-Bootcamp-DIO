public class Main {
    public static void main(String[] args) {
        //Primeiro nome.
        String primeiroNome ="Daniel";
        //Segundo nome.
        String segundoNome ="Fenix Mofl";

        //Metodo para concatenação das duas variaveis.
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        //Impressão ou print para os proximos.

        //Faznedo por concatenação
        //System.out.println(primeiroNome + segundoNome);

        //Por metodo.
        System.out.println(nomeCompleto);
    }

    //Metodo que irá conter os valores dos nomes
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}