package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidado(Set<Convidado> convidadosSet) {
        this.convidadosSet = new HashSet<>();

    }

    public ConjuntoConvidado() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        if (convidadosSet != null){
        return convidadosSet.size();
        }
        return 0;
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

}
