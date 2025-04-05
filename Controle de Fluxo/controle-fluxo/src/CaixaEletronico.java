public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valrSolicitado = 17.0;

        if(valrSolicitado < saldo){
        saldo = saldo - valrSolicitado;
        System.out.println("Novo saldo: "+saldo);
        }
        else {
            System.out.println("Saldo insuficiente.");
        }

        System.out.println(saldo);
    }
}
