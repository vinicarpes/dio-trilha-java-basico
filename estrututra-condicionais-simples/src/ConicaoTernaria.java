public class ConicaoTernaria {
    public static void main(String[] args) {
        int nota =2;
        String resultado = nota >=7 ? "Aprovado" : nota>=5 && nota<7 ? "Recuperação" : "Reprovado";//abreviação de varios blocos if/else

        System.out.println(resultado);

    }
}
