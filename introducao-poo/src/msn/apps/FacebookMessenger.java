package msn.apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void envairMensagem(){
        validarConexao();
        System.out.println("Enviando mensagem pelo FB Messenger");
        salvarHistorico();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo FB Messenger");
    }
    public void salvarHistorico(){
        System.out.println("Salvando histórico de mensagem");
    }
    
}
