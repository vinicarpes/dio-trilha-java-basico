package autodromo;
public class Carro extends Veiculo {

    public void ligar(){
        confereCambio();
        confereCombustivel();
        System.out.println("Carro ligado");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustível");
    }
    private void confereCambio(){
        System.out.println("Conferindo câmbio em P");
    }
}
