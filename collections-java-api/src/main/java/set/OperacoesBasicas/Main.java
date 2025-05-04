package main.java.set.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {

        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem "+ conjuntoConvidado.contarConvidados() + " convidados dentro do Set de Convidados.");

        conjuntoConvidado.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 1222);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 1222);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 1223);
        System.out.println("------------------------------------");
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados do Set de Convidados.");

        conjuntoConvidado.removerConvidado(1234);
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados do Set de Convidados.");


    }
}
