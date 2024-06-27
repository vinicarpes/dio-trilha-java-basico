public class usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTV = new SmartTv();

        System.out.println("TV Ligada?" + smartTV.ligada);
        System.out.println("Canal atual?" + smartTV.canal);
        System.out.println("Volume??" + smartTV.volume);

        smartTV.ligar();

        System.out.println("TV Ligada?" + smartTV.ligada);
        System.out.println("Canal atual?" + smartTV.canal);
        System.out.println("Volume??" + smartTV.volume);

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
    
        System.out.println("TV Ligada?" + smartTV.ligada);
        System.out.println("Canal atual?" + smartTV.canal);
        System.out.println("Volume??" + smartTV.volume);



        smartTV.mudarCanal(13);
        System.out.println("TV Ligada?" + smartTV.ligada);
        System.out.println("Canal atual?" + smartTV.canal);
        System.out.println("Volume??" + smartTV.volume);


    }
}
