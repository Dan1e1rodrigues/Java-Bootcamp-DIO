public class Main {
    public static void main(String[] args) throws Exception {

        //Nossa classe
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV esta ligada ? " + smartTv.ligada);

        System.out.println("O canal atual ? " + smartTv.canal);

        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo Status -> TV Desligada ? " + smartTv.ligada);
    }
}