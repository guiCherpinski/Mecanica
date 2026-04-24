package com.mecanica.model;

import com.mecanica.enums.FormaPagamentoEnum;
import com.mecanica.enums.StatusPagamentoEnum;

import java.time.LocalDate;

public class Pagamento {

    private Long idPagamento;
    private double valorPagamento;
    private FormaPagamentoEnum formaPagamento;
    private StatusPagamentoEnum statusPagamento;
    private LocalDate dataPagamento;
    private int parcelas;

    public Pagamento(Long idPagamento, double valorPagamento, FormaPagamentoEnum formaPagamento,
                     StatusPagamentoEnum statusPagamento, LocalDate dataPagamento, int parcelas) {
        this.idPagamento = idPagamento;
        this.valorPagamento = valorPagamento;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
        this.dataPagamento = dataPagamento;
        this.parcelas = parcelas;
    }

    public Pagamento(double valorPagamento, FormaPagamentoEnum formaPagamento,
                     StatusPagamentoEnum statusPagamento, LocalDate dataPagamento, int parcelas) {
        this.valorPagamento = valorPagamento;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
        this.dataPagamento = dataPagamento;
        this.parcelas = parcelas;
    }

    public Long getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(Long idPagamento) {
        this.idPagamento = idPagamento;
    }

    public double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public FormaPagamentoEnum getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamentoEnum formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public StatusPagamentoEnum getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(StatusPagamentoEnum statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public LocalDate getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(LocalDate dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
