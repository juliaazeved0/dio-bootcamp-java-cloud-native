

public class Usuario {
 
    
    public static void main(String[] args) throws Exception{
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentaVolume();

        smartTv.mudarCanal(13);

        System.out.println("Volume atual: "+smartTv.volume);

        System.out.println("Tv ligada: " +smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+ smartTv.volume);

        smartTv.desligar();
        System.out.println("A tv está ligada? "+smartTv.ligada);
    
    
    }
}
