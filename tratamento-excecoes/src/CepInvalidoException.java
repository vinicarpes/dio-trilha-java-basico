public class CepInvalidoException extends Exception{
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("8806445");
            System.out.println(cepFormatado);
        } catch (CepInvalidaException e) {
    
            System.err.println("O cep não corresponde às regras de negócio");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();
        return "88.064-445";
    }
}
