package main.java.list.Pesquisa;

public class Main {

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2010);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2015);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 2", 2020);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2022);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 5", 2011);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloDeTempo(2020,2022));

        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));

    }
}
