package msn.apps;

public class Telegram  extends ServicoMensagemInstantanea{
    public void envairMensagem(){
        validarConexao();
        System.out.println("Enviando mensagem pelo Telegram");
        salvarHistorico();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram");
    }
    public void salvarHistorico(){
        System.out.println("Salvando histórico de mensagem");
    }
    
}
