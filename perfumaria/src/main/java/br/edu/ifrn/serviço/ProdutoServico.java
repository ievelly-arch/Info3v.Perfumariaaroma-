package br.edu.ifrn.serviço;

import java.util.List;

import br.edu.ifrn.modelo.Produto;
import br.edu.ifrn.repositorio.ProdutoRepositorio;

public class ProdutoServico {

    private final ProdutoRepositorio repositorio = new ProdutoRepositorio();

    // Cadastrar produto
    public void cadastrarProduto(Produto produto) {

        if (produto.getNome() == null || produto.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do produto é obrigatório.");
        }

        if (produto.getPreco() <= 0) {
            throw new IllegalArgumentException("O preço deve ser maior que zero.");
        }

        if (produto.getQuantidadeEstoque() < 0) {
            throw new IllegalArgumentException("Quantidade em estoque inválida.");
        }

        repositorio.inserir(produto);
    }

    // Listar produtos
    public List<Produto> listarProdutos() {
        return repositorio.listarTodos();
    }

    // Atualizar produto
    public void atualizarProduto(Produto produto) {

        if (produto.getId() == null) {
            throw new IllegalArgumentException("Produto sem ID.");
        }

        repositorio.atualizar(produto);
    }

    // Excluir produto
    public void excluirProduto(Long id) {

        if (id == null) {
            throw new IllegalArgumentException("ID inválido.");
        }

        repositorio.excluir(id);
    }

}
