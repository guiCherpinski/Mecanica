package com.mecanica.model;

import com.mecanica.enums.StatusOSEnum;

import java.time.LocalDate;

public class OrdemServico {

    private long idOS;
    private String numero;
    private LocalDate dataAbertura;
    private LocalDate dataPrevisao;
    private LocalDate dataConclusao;
    private String descricaoProblema;
    private StatusOSEnum status;
    private double valorTotal;

    public OrdemServico(long idOS, String numero, LocalDate dataAbertura, LocalDate dataPrevisao, LocalDate dataConclusao, String descricaoProblema, StatusOSEnum status, double valorTotal) {
        this.idOS = idOS;
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.dataPrevisao = dataPrevisao;
        this.dataConclusao = dataConclusao;
        this.descricaoProblema = descricaoProblema;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    public OrdemServico(String numero, LocalDate dataAbertura, LocalDate dataPrevisao, LocalDate dataConclusao, String descricaoProblema, StatusOSEnum status, double valorTotal) {
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.dataPrevisao = dataPrevisao;
        this.dataConclusao = dataConclusao;
        this.descricaoProblema = descricaoProblema;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    public long getIdOS() {
        return idOS;
    }

    public void setIdOS(long idOS) {
        this.idOS = idOS;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataPrevisao() {
        return dataPrevisao;
    }

    public void setDataPrevisao(LocalDate dataPrevisao) {
        this.dataPrevisao = dataPrevisao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public String getDescricaoProblema() {
        return descricaoProblema;
    }

    public void setDescricaoProblema(String descricaoProblema) {
        this.descricaoProblema = descricaoProblema;
    }

    public StatusOSEnum getStatus() {
        return status;
    }

    public void setStatus(StatusOSEnum status) {
        this.status = status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
