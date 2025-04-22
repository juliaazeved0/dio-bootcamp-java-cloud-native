import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
            try{
            Scanner scan = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o primeiro parâmetro:");
            int parametroUm = scan.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scan.nextInt();
            
            contar(parametroUm, parametroDois);
            scan.close();
            }
            catch(ParametrosInvalidosException | InputMismatchException e){
                if(e instanceof ParametrosInvalidosException){
                    System.out.println("O segundo parâmetro deve ser menor que o primeiro parâmetro!");
                }else {
                    System.out.println("Argumento inválido, insira apenas números inteiros!");
                }
            }

        }

    static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException, InputMismatchException{
        
        if(parametroDois < parametroUm){
            int cont = parametroUm - parametroDois;
      
        for (int aux = 0; aux < cont; aux++) {
            System.out.println("Imprimindo o número: " +aux);
        }
    }else {
        throw new ParametrosInvalidosException();
    }
}
}

