public class CondicionalTernaria {
    public static void main(String[] args) {
        int nota = 9;
        //Dessa forma ela irá fazer a condicional, imprime o primeiro,
        //Caso seja true aprovado, false ou reprovado.
        String resultado = nota >= 7 ? "APROVADO !!" : nota >= 5 && nota < 7 ? "RECUPERAÇÂO !!" : "REPROVADO !";

        System.out.println(resultado);
    }
}
