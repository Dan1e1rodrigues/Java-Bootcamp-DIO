package Carros;

public class Carro {
    private String chassi;
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Conferindo Motor...FUNCIONOU");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo Combustivel...FUNCIONOU");
    }

    private void confereCambio(){
        System.out.println("Conferindo Cambio em P ......FUNCIONOU");
    }
}
