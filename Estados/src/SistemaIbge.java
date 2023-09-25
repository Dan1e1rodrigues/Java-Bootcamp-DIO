public class SistemaIbge {
    public static void main(String[] args) {
        for(Estado e: Estado.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
    }
}
