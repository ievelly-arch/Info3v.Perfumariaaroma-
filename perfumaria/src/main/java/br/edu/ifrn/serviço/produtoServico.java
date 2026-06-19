package br.edu.ifrn.serviço;

import br.edu.ifrn.modelo.produto;

public class produtoServico {

    public void cadastrarProduto(produto produto) {

        if (produto.getPreco() <= 0) {
            throw new IllegalArgumentException("Preço inválido.");
        }

        if (produto.getQuantidadeEstoque() < 0) {
            throw new IllegalArgumentException("Quantidade inválida.");
        }

        System.out.println("Produto cadastrado com sucesso!");
    }

    public void consultarProduto(produto produto) {
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Marca: " + produto.getMarca());
        System.out.println("Categoria: " + produto.getCategoria());
        System.out.println("Estoque: " + produto.getQuantidadeEstoque());
    }
}