package main.java.map.Pesquisa;

public class Main {

    public static void main(String[] args) {

        EstoqueProduto estoque = new EstoqueProduto();

        estoque.exibirProdutos();

        estoque.adicionarPropduto(6L, "Produto A", 4, 5.0);
        estoque.adicionarPropduto(2L, "Produto B", 5, 10.0);
        estoque.adicionarPropduto(3L, "Produto C", 2, 15.0);
        estoque.adicionarPropduto(4L, "Produto D", 1, 2.0);
        estoque.adicionarPropduto(5L, "Produto E", 1, 3.0);

        estoque.exibirProdutos();

        System.out.println("Valor total do estoque: R$ " +estoque.calculaValorTotalEstoque());
        System.out.println("Produto mais caro: R$ " +estoque.obterProdutoMaisCaro());

    }
}
