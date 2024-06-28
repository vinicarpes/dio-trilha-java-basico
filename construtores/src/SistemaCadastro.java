public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Pessoa", "123");

        marcos.setEndereco("Rua do fogo");


        System.err.println(marcos.getNome() + "-" + marcos.getCpf());
    }
}
