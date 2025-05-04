package main.java.set.Pesquisa;

public class Main {

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exbirContatos();

        agendaContatos.adicionarConatato("Camila", 123456);
        agendaContatos.adicionarConatato("Camila", 123454);
        agendaContatos.adicionarConatato("Camila Cavalcanti", 1234446);
        agendaContatos.adicionarConatato("Camilla", 12354456);

        agendaContatos.exbirContatos();

        agendaContatos.atualizarNumeroContato("Camilla", 000000);

        agendaContatos.exbirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));

    }
}
