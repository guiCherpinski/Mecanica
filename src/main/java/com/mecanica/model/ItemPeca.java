package com.mecanica.model;

public class ItemPeca {

    private Long idPeca;
    private int quantidadePeca;
    private double valorUnitarioPeca;

    public ItemPeca(Long idPeca, int quantidadePeca, double valorUnitarioPeca) {
        this.idPeca = idPeca;
        this.quantidadePeca = quantidadePeca;
        this.valorUnitarioPeca = valorUnitarioPeca;
    }

    public ItemPeca(int quantidadePeca, double valorUnitarioPeca) {
        this.quantidadePeca = quantidadePeca;
        this.valorUnitarioPeca = valorUnitarioPeca;
    }

    public Long getIdPeca() {
        return idPeca;
    }

    public void setIdPeca(Long idPeca) {
        this.idPeca = idPeca;
    }

    public int getQuantidadePeca() {
        return quantidadePeca;
    }

    public void setQuantidadePeca(int quantidadePeca) {
        this.quantidadePeca = quantidadePeca;
    }

    public double getValorUnitarioPeca() {
        return valorUnitarioPeca;
    }

    public void setValorUnitarioPeca(double valorUnitarioPeca) {
        this.valorUnitarioPeca = valorUnitarioPeca;
    }
}
