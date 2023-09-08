public class SwitchCaseOperadora {
    public static void main(String[] args) {
        String plano = "M";//M ou T ou B

        switch (plano) {
            case "T": {
                System.out.println("5Gb com Youtube");
                break;
            }
            case "M": {
                System.out.println("Zap ilimitado com Instagram grátis");
                break;
            }
            case "B": {
                System.out.println("100 minutos de ligações e DIO Ilimitada");
            }
        }
    }
}
