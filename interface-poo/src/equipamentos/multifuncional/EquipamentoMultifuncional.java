package equipamentos.multifuncional;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora{
    public void copiar(){
        System.out.println("COPIANDOIA EQUIPAMENTO MULTIFUNCIONAL...");
    }
    public void digitalizar(){
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL...");
    }
    public void imprimir(){
        System.out.println("IMPRIMINDOIA EQUIPAMENTO MULTIFUNCIONAL...");
    }
}
