

public class usuario {
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Ligada? : " + smartTv.ligada);
        System.out.println("Canal? : " + smartTv.canal);
        System.out.println("Volume? : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? : " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Tv ligada? : " + smartTv.ligada);

        smartTv.volumeMais();
        smartTv.volumeMenos();
        smartTv.volumeMais();
        smartTv.volumeMais();
        smartTv.volumeMenos();
        smartTv.volumeMais();
        smartTv.volumeMenos();

        System.out.println("Volume Atual: " + smartTv.volume);
        

        smartTv.canalMais();
        smartTv.canalMais();
        smartTv.canalMais();
        smartTv.canalMenos();

        System.out.println("Canal Atual: " + smartTv.canal);


        smartTv.definirCanal(13);
        System.out.println("Canal atual: " + smartTv.canal);
    }
    
}
