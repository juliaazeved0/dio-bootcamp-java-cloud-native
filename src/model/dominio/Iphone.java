package model.dominio;
import model.interfaces.*;


public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void addNovaAba(String url) {
        System.out.println("Nova aba adicionada.");
        System.out.println("-------------------------");
        
    }

    @Override
    public void atualizarPagina() {
       System.out.println("Página atualizada.");
       System.out.println("-------------------------");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo http:www."+url+".com");
        System.out.println("-------------------------");
        
    }

    @Override
    public void tocarMusica(String musica) {
        System.out.println("Música tocando: " +musica);
        System.out.println("-------------------------");
        
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
        System.out.println("-------------------------");
    }

    @Override
    public void selecionaMusica(String numeroTelefone) {
        System.out.println("Selecionando música...");
        System.out.println("-------------------------");
       
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
        System.out.println("-------------------------");
        
    }

    @Override
    public void desligarChamada() {
        System.out.println("Desligando chamada.");
        System.out.println("-------------------------");
        
    }

    @Override
    public void iniciarCorreioDeVoz(String numeroTelefone) {
        System.out.println("Iniciando correio de voz.");
        System.out.println("-------------------------");
        
    }

    @Override
    public void ligar(String numeroTelefone) {
        System.out.println("Ligando para: "+numeroTelefone);
        
    }

    
    
}
