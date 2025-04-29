package main.java.list.OperacoesBasicas;

public class Teste {

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos é: "+listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 2");
        listaTarefa.adicionarTarefa("tarefa 3");
        System.out.println("O número total de elementos é: "+listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.removerTarefa("tarefa 1");
        System.out.println("O número total de elementos é: "+listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
