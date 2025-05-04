package main.java.map.OperacoesBasicas;

public class Main {

    public static void main(String[] args) {

        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Contato 1", 43611);
        agendaContatos.adicionarContato("Contato 1", 43622);
        agendaContatos.adicionarContato("Contato 1", 43633);
        agendaContatos.adicionarContato("Contato 3", 43337);
        agendaContatos.adicionarContato("Contato 2", 43327);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Contato 1"));

        agendaContatos.removerContato("Contato 1");

        agendaContatos.exibirContatos();

    }
}
