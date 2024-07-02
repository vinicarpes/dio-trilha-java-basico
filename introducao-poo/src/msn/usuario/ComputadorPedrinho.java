package msn.usuario;

import msn.apps.FacebookMessenger;
import msn.apps.MSNMessenger;
import msn.apps.ServicoMensagemInstantanea;
import msn.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

    ServicoMensagemInstantanea smi = null;

     String appEscolhido = "fcb";

     if(appEscolhido.equals("msn")){
        smi = new MSNMessenger();
    }else if(appEscolhido.equals("tlg")){
        smi = new Telegram();
    }else if(appEscolhido.equals("fcb")){
        smi = new FacebookMessenger();
     }else{
        System.out.println("Operação invállida");
     }

     smi.envairMensagem();
     smi.receberMensagem();


    }
    
}
