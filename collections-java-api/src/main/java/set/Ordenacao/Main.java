package main.java.set.Ordenacao;

public class Main {

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 4", 10.5, 5);
        cadastroProdutos.adicionarProduto(4L, "Produto 0", 15.6, 1);
        cadastroProdutos.adicionarProduto(5L, "Produto 3", 11.5, 3);
        cadastroProdutos.adicionarProduto(7L, "Produto 2", 1.5, 2);

        System.out.println(cadastroProdutos.getProdutoSet());
        System.out.println(cadastroProdutos.exibirPorPreco());
        System.out.println(cadastroProdutos.exibirPordutoPorNome());
    }
}
