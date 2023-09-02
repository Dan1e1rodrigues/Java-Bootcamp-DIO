public class Main {
    //Variavel da classe conta, no caso MAIN
    double saldo = 10.9;

    public void sacar(Double valor) {

        //Variavel local metodo
        double novoSaldo = saldo - valor;
    }

    public void imprimirSaldo() {
        //Disponivel em toda classe
        System.out.println(saldo);
        //Somente o método sacar conhece esta variavel

        //Variavel reservada.
        //System.out.println(novoSaldo);
    }
    public double calcularDividaExponencial(){
        //variavel local de método
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for(int x=1; x<=7;x++ ){
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }

        return valorMontante;
    }
}