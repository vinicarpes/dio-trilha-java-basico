public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    //construtor serve para instanciar com parametros
    public Pessoa(String nome, String cpf){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String newEndereco){
        endereco = newEndereco;
    }
}
