package com.mecanica.model;

public class Peca {

    private Long id;
    private String codigo;
    private String nome;
    private String fabricante;
    private String categoria;
    private int quantidadeEstoque;
    private int estoqueMinimo;
    private double precoVenda;
    private double precoCusto;

    public Peca(Long id, String codigo, String nome, String fabricante, String categoria,
                int quantidadeEstoque, int estoqueMinimo, double precoVenda, double precoCusto) {
        this.id = id;
        this.codigo = codigo;
        this.nome = nome;
        this.fabricante = fabricante;
        this.categoria = categoria;
        this.quantidadeEstoque = quantidadeEstoque;
        this.estoqueMinimo = estoqueMinimo;
        this.precoVenda = precoVenda;
        this.precoCusto = precoCusto;
    }

    public Peca(double precoCusto, double precoVenda, int estoqueMinimo,
                int quantidadeEstoque, String categoria, String fabricante, String nome, String codigo) {
        this.precoCusto = precoCusto;
        this.precoVenda = precoVenda;
        this.estoqueMinimo = estoqueMinimo;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
        this.fabricante = fabricante;
        this.nome = nome;
        this.codigo = codigo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
