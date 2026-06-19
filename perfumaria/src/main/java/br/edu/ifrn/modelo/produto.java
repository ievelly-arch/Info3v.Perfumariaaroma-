package br.edu.ifrn.modelo;

public class produto {

    private String nome;
    private String marca;
    private String categoria;
    private double preco;
    private int quantidadeEstoque;

    public boolean estoqueDisponivel() {
        return this.quantidadeEstoque > 0;
    }

    public boolean estoqueBaixo() {
        return this.quantidadeEstoque <= 5;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
}

