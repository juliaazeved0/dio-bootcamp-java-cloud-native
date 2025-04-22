public class Carro extends Veiculo {
   
    public void ligar() {
        System.out.println("Carro ligado");
        confereCombustivel();
    }
    private void confereCombustivel(){
        System.out.println("conferindo combustível");
    }

   
}
