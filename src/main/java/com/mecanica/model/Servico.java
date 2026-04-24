package com.mecanica.model;

import com.mecanica.enums.CategoriaEnum;

public class Servico {

    private Long idOrdem;
    private String nomeOrdem;
    private CategoriaEnum categoriaEnum;
    private double valorMaoObra;
    private int tempoEstimadoMin;

    public Servico(Long idOrdem, String nomeOrdem, CategoriaEnum categoriaEnum, double valorMaoObra, int tempoEstimadoMin) {
        this.idOrdem = idOrdem;
        this.nomeOrdem = nomeOrdem;
        this.categoriaEnum = categoriaEnum;
        this.valorMaoObra = valorMaoObra;
        this.tempoEstimadoMin = tempoEstimadoMin;
    }

    public Servico(String nomeOrdem, CategoriaEnum categoriaEnum, double valorMaoObra, int tempoEstimadoMin) {
        this.nomeOrdem = nomeOrdem;
        this.categoriaEnum = categoriaEnum;
        this.valorMaoObra = valorMaoObra;
        this.tempoEstimadoMin = tempoEstimadoMin;
    }

    public Long getIdOrdem() {
        return idOrdem;
    }

    public void setIdOrdem(Long idOrdem) {
        this.idOrdem = idOrdem;
    }

    public String getNomeOrdem() {
        return nomeOrdem;
    }

    public void setNomeOrdem(String nomeOrdem) {
        this.nomeOrdem = nomeOrdem;
    }

    public CategoriaEnum getCategoriaEnum() {
        return categoriaEnum;
    }

    public void setCategoriaEnum(CategoriaEnum categoriaEnum) {
        this.categoriaEnum = categoriaEnum;
    }

    public double getValorMaoObra() {
        return valorMaoObra;
    }

    public void setValorMaoObra(double valorMaoObra) {
        this.valorMaoObra = valorMaoObra;
    }

    public int getTempoEstimadoMin() {
        return tempoEstimadoMin;
    }

    public void setTempoEstimadoMin(int tempoEstimadoMin) {
        this.tempoEstimadoMin = tempoEstimadoMin;
    }
}
