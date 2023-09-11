public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23895896");
            System.out.println("Seu cep é " + cepFormatado);
        } catch (CepInvalidoException e){
            e.printStackTrace();
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

            //Simulando um cep Formatado
            return "23895896";
    }
}
