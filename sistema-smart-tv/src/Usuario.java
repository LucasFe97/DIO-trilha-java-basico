public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Nova status -> Tv ligada " + smartTv.ligada);
        
        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual : " + smartTv.volume);
        
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(17);
        System.out.println("Canal Atual : " + smartTv.canal);

    
    }
}
