package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarConatato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exbirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato>pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato contato : contatoSet){
            if(contato.getNome().startsWith(nome)){
                contatosPorNome.add(contato);
                break;
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato contato : contatoSet){
            if(contato.getNome().equalsIgnoreCase(nome)){
                contato.setNumero(novoNumero);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }
}
