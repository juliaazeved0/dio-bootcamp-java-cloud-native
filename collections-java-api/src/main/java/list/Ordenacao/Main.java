package main.java.list.Ordenacao;

public class Main {

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.addPessoa("Pessoa 1", 20, 1.60);
        ordenacaoPessoa.addPessoa("Pessoa 2", 25, 1.75);
        ordenacaoPessoa.addPessoa("Pessoa 3", 24, 1.80);
        ordenacaoPessoa.addPessoa("Pessoa 4", 19, 1.67);
        ordenacaoPessoa.addPessoa("Pessoa 5", 36, 1.59);

        System.out.println("Sem ordenação: "+ordenacaoPessoa);
        System.out.println("Ordenando por Idade: " +ordenacaoPessoa.ordenarPorIdade());
        System.out.println("Ordenando por Altura: " +ordenacaoPessoa.ordenarPorAltura());
    }
}
