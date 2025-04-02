import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {

        public static void main(String[] args) {
            
        
            try (Scanner scan = new Scanner(System.in).useLocale(Locale.US)) {

                System.out.println("Digite seu nome: ");
                String nomeCliente = scan.next();
                
                System.out.println("Digite sua agencia: ");
                String agencia = scan.next();

                System.out.println("Digite o numero da sua conta: ");
                int numeroConta = scan.nextInt();

                System.out.println("Digite o valor do saldo inicial: ");
                double saldo = scan.nextDouble();


                System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é "
                +agencia+ ", o número da sua conta é "+numeroConta+ " e seu saldo de R$ " +saldo+ " já está disponível para saque.");
            }
        
        
        }
    }