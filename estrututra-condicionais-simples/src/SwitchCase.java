public class SwitchCase {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "M":
                System.out.println("Médio");
                break;

            case "P":
            System.out.println("Pequeno");
                break;

            case "G":
            System.out.println("Grande");
                break;
        
            default:
            System.out.println("Não definido");
                break;
        }

    }
}
