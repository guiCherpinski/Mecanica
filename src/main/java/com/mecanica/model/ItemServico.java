package com.mecanica.model;

public class ItemServico {

    private Long idServico;
    private int quantidadeItem;
    private double valorUnitarioItem;

    public ItemServico(Long idServico, int quantidadeItem, double valorUnitarioItem) {
        this.idServico = idServico;
        this.quantidadeItem = quantidadeItem;
        this.valorUnitarioItem = valorUnitarioItem;
    }

    public ItemServico(int quantidadeItem, double valorUnitarioItem) {
        this.quantidadeItem = quantidadeItem;
        this.valorUnitarioItem = valorUnitarioItem;
    }

    public Long getIdServico() {
        return idServico;
    }

    public void setIdServico(Long idServico) {
        this.idServico = idServico;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public double getValorUnitarioItem() {
        return valorUnitarioItem;
    }

    public void setValorUnitarioItem(double valorUnitarioItem) {
        this.valorUnitarioItem = valorUnitarioItem;
    }
}
