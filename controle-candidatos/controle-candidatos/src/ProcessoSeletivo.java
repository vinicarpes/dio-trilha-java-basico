import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String[] selecionados = selecaoCandidatos();
        imprimirSelecionados(selecionados);
        for(String candidatos:selecionados){
            entrarEmContato(candidatos);
        }
        
    }

    static void entrarEmContato(String candidato){
        int tentativasRealizadas =1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }

        }while(continuarTentando && tentativasRealizadas<3);

        if(atendeu && candidato!=null){
            System.out.println("Conseguimos contato com " + candidato + " em " + tentativasRealizadas+ " tentativas.\n");
        }else{
            System.out.println("Não foi possível realizar o contato com " +candidato+" após "+tentativasRealizadas+" tentativas.\n");
        }

    }
    
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(String[] selecionados){
        System.out.println("Os(as) candidatos(as) selecionados(as) são:");
        for(int i=0; i <selecionados.length; i++){
            if(selecionados[i]!= null){
                System.out.println(selecionados[i]);
        }
        }
        System.out.println("\n");
    }
    
    static String[] selecaoCandidatos(){
        String [] candidatos = {"Felipe", "Alan", "Maria", "Helena", "Vinicius", "Maethe", "Lucas","Pedro", "Raphaela", "Laura", "Jéssica"};
        int candidatosSelecionados =0;   
        int candidatoAtual=0;
        double salarioBase =2000.0;
        String[] selecionados = new String[5];    
        
        while(candidatosSelecionados<5 && candidatoAtual<candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato+ " solicitou o salário de R$" + salarioPretendido);
            
            if(salarioBase>=salarioPretendido){
                System.out.println("O/a candidato(a) "+ candidato + " foi selecionado(a).");
                selecionados [candidatosSelecionados] = candidato;
                candidatosSelecionados ++;

            }
        candidatoAtual++;
        System.out.println("\n");
        }
        return selecionados;
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase== salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA");
        }else{
            System.out.println("AGUARDANDO DEMAIS CANDIDATURAS.");
        }
     }
     
    
}
