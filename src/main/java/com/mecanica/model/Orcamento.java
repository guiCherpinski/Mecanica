package com.mecanica.model;

import java.time.LocalDate;

public class Orcamento {

    private Long id;
    private LocalDate dataGeracao;
    private double valorServico;
    private double valorPecas;
    private double valorTotal;
    private boolean aprovado;

    public Orcamento(Long id, LocalDate dataGeracao, double valorServico, double valorPecas, double valorTotal, boolean aprovado) {
        this.id = id;
        this.dataGeracao = dataGeracao;
        this.valorServico = valorServico;
        this.valorPecas = valorPecas;
        this.valorTotal = valorTotal;
        this.aprovado = aprovado;
    }

    public Orcamento(LocalDate dataGeracao, double valorServico, double valorPecas, double valorTotal, boolean aprovado) {
        this.dataGeracao = dataGeracao;
        this.valorServico = valorServico;
        this.valorPecas = valorPecas;
        this.valorTotal = valorTotal;
        this.aprovado = aprovado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(LocalDate dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public double getValorPecas() {
        return valorPecas;
    }

    public void setValorPecas(double valorPecas) {
        this.valorPecas = valorPecas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
