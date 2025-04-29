package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
//criando um objeto do tipo List que recebe elementos do tipo Tarefa e são chamados, tarefaList é a variável de referencia
    private List<Tarefa> tarefaList;

    //sempre que criar um objeto terá um arrayList vazio esperando para armazenar o objeto
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O número total de elementos na lista é: " +listaTarefa.obterNumeroTotalDeTarefas());

        listaTarefa.adicionarTarefa("tarefa 3");
        listaTarefa.adicionarTarefa("tarefa 3");
        listaTarefa.removerTarefa("tarefa 3");
        System.out.println("O número total de elementos na lista é: " +listaTarefa.obterNumeroTotalDeTarefas());
    }
}
