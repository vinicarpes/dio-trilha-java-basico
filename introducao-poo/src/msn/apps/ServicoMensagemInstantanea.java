package msn.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void envairMensagem(); 
    public abstract void receberMensagem(); 
    public abstract void salvarHistorico();
    
    protected void validarConexao(){
        System.out.println("Validando se há conexão com a internet.");
    }
}
