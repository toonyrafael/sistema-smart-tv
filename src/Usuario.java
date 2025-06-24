public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println();

        System.out.println("Canal Atual : " + smartTv.canal);

        smartTv.mudarCanal(9);

        System.out.println("Canal Atual : " + smartTv.canal);
        
        System.out.println("TV LIGADA ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume Atual : " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo Status - TV Ligada ? " + smartTv.ligada);

    }
}
