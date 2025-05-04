package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public Set<Produto> getProdutoSet() {
        return produtoSet;
    }

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirPordutoPorNome(){
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        return produtoPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorProduto());
        produtoPorPreco.addAll(produtoSet);
        return produtoPorPreco;
    }
}
