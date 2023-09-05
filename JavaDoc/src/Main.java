public class Main {
    public static void main(String[] args) {
        //Olá eu sou um comentario em uma linha.

        /*
        * Olá
        *
        * Eu sou um comentario
        * que posso ser mais
        * detalhado do que o //
        * */
    }
//    public void metodo (){
//
//    }

    //Exemplo de metodo.

    /*
    Metodo esta em elaboração
    mas e bom usar esse comentario
    para gerar um caminho sobre o que
    esta sendo feito.
    * */
    public int somaMultilplica(int n, int x, String m) {
        int r = 0;// r é igual ao resltado

        if (m == "M"){// M = multiplicação
            r = n * x;
        }else{
            //Se não soma mesmo
            r = n + x;
        }
        return r;
    }
//    System.out.println();
}