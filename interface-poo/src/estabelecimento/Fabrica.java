package estabelecimento;
import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;


public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        
        Deskjet deskjet = new Deskjet();

        Impressora impressora = deskjet;
        // Digitalizadora digitalizadora =deskjet; acusa não ser da mesma interface
        // Copiadora copiadora = deskjet; acusa não ser da mesma interface


        
        Digitalizadora digitalizadora =em;
        Copiadora copiadora = em;

        
        impressora.imprimir();

        digitalizadora.digitalizar();

        copiadora.copiar();
    }
}
