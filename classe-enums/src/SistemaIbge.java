public class SistemaIbge {
    public static void main(String[] args) {
        for(EstadoBrasileiro o: EstadoBrasileiro.values()){
            System.out.println(o.getSigla() + "-"+o.getNome() + "-" + o.getIbge());
        }
        EstadoBrasileiro eb =EstadoBrasileiro.CEARA;
        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
}
