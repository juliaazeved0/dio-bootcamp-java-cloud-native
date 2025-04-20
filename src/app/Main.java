package app;
import java.util.InputMismatchException;
import java.util.Scanner;
import service.*;
import model.dominio.*;
import exception.*;

public class Main {

    static Iphone iphone = new Iphone();
    static Scanner scanner = new Scanner(System.in);
    static ValidacaoNumeroTelefone validarNumero = new ValidacaoNumeroTelefone();

    public static void main(String[] args) {
        try{
            while(true){
            System.out.println("Selecione a função desejada:");
            System.out.println("1 - Telefone\n2 - Reproduzir Música\n3 - Navegar na Internet");
        
            int opt = scanner.nextInt();

            switch (opt) {
                case 1:
                try{
                    telefone();
                }catch(NumeroInvalidoException e){
                    System.out.println(e.getMessage());
                }
                    break;
                case 2:
                    musica();
                    break;
                case 3:
                    navegador();
                    break;
                default:
                    System.out.println("Opção inválida!");
                }
            }
        }catch(InputMismatchException e){
            System.out.println("Argumento inválido, digite apenas números!");
        }
    }

    public static void telefone() throws NumeroInvalidoException {
        System.out.println("Selecione qual função do telefone deseja utilizar: ");
        System.out.println(
                "1 - Realizar chamada\n2 - Iniciar Correio de Voz\n3 - Atender ligação \n4 - Finalizar chamada\n0 - Retornar ao menu principal");

        int opt = scanner.nextInt();
        scanner.nextLine();
        switch (opt) {
            case 1:
                System.out.print("Digite o número: ");
                String numero = scanner.nextLine();
                ValidacaoNumeroTelefone.validarNumeroTelefone(numero);
                iphone.ligar(numero);
                break;
            case 2:
                System.out.println("Digite o número do telefone para enviar o correio de voz: ");
                String numeroCorreioDeVoz = scanner.nextLine();
                ValidacaoNumeroTelefone.validarNumeroTelefone(numeroCorreioDeVoz);
                iphone.iniciarCorreioDeVoz(numeroCorreioDeVoz);
                break;
            case 3:
                iphone.atender();
                break;
            case 4:
                iphone.desligarChamada();
            case 0:
                return;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public static void musica() {
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Tocar \n2 - Pausar \n3 - Selecionar Música\n0 - Retornar ao menu principal");

        int opt = scanner.nextInt();
        scanner.nextLine();
        
        switch (opt) {
            case 1:
                System.out.print("Digite o nome da música: ");
                String musica = scanner.nextLine();
                iphone.tocarMusica(musica);
                break;
            case 2:
                iphone.pausarMusica();
                break;
            case 3:
                System.out.print("Nova música: ");
                String novaMusica = scanner.nextLine();
                iphone.selecionaMusica(novaMusica);
                break;
            case 0:
                return;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public static void navegador() {
        while (true) {
            System.out.println("Selecione uma opção:");
            System.out.println(
                    "1 - Exibir Página \n2 - Adicionar Nova Aba \n3 - Atualizar Página\n0 - Retornar ao menu principal");

            int opt = scanner.nextInt();
            scanner.nextLine();

            switch (opt) {
                case 1:
                    System.out.print("Digite a URL: ");
                    String url = scanner.nextLine();
                    iphone.exibirPagina(url);
                    break;
                case 2:
                    System.out.println("Digite a nova url: ");
                    String novaUrl = scanner.nextLine();
                    iphone.addNovaAba(novaUrl);
                    break;
                case 3:
                    iphone.atualizarPagina();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
}
