package msn.apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
    public void envairMensagem(){
        validarConexao();
        System.out.println("Enviando mensagem pelo MSN");
        salvarHistorico();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo MSN");
    }
    public void salvarHistorico(){
        System.out.println("Salvando histórico de mensagem");
    }
}
