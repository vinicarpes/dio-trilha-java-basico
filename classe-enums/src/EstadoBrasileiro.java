
        //enum cria objetos previamente, são imutáveis
        // ex: objeto cliente é mutável
        //atributos como "estados brasileiros" são imutáveis
        // graus de escolaridade: "ensino medio", "ensino fundamental",...
        // enum não é uma lista de constantes
        //enum é um conjunto de objetos previamente definidos
        //ex: estados brasileiros: enum com 27 objetos
        //podem ter atributos ou metodos

public enum EstadoBrasileiro{

            SAO_PAULO ("SP", "São Paulo",11),
            MARANHAO ("MA", "Maranhão",12),
            RIO_JANEIRO ("RJ", "Rio de Janeiro",13),
            CEARA("CE", "Ceará",15);

            private String nome;
            private String sigla;
            private int ibge;

            public int getIbge() {
                return ibge;
            }
            private EstadoBrasileiro(String sigla, String nome, int ibge){
                this.sigla = sigla;
                this.nome = nome;
                this.ibge = ibge;
            }
            public String getSigla(){
                return sigla;
            }
            public String getNome(){
                return nome;
            }
            public String getNomeMaiusculo(){
                return nome.toUpperCase();
            }
}


