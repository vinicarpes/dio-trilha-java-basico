public class caixa_eletronico {
    public static void main(String[] args){
        double saldo = 25.0;
        double valorSolicitado = 7.0;

        if(valorSolicitado<=saldo){
            saldo = saldo - valorSolicitado;

            System.out.println(saldo);
        }

    }
}
