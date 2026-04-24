package com.mecanica.model;

import com.mecanica.enums.TipoVeiculoEnum;

public class Veiculo {

    private Long idVeiculo;
    private String placaVeiculo;
    private String marcaVeiculo;
    private String modelo;
    private int anoVeiculo;
    private String corVeiculo;
    private TipoVeiculoEnum tipoVeiculo;
    private double quilometragemVeiculo;
    private String numeroChassi;
    private String renavam;

    public Veiculo(Long idVeiculo, String placaVeiculo, String marcaVeiculo, String modelo,
                   int anoVeiculo, String corVeiculo, TipoVeiculoEnum tipoVeiculo, double quilometragemVeiculo, String numeroChassi, String renavam) {
        this.idVeiculo = idVeiculo;
        this.placaVeiculo = placaVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.modelo = modelo;
        this.anoVeiculo = anoVeiculo;
        this.corVeiculo = corVeiculo;
        this.tipoVeiculo = tipoVeiculo;
        this.quilometragemVeiculo = quilometragemVeiculo;
        this.numeroChassi = numeroChassi;
        this.renavam = renavam;
    }

    public Veiculo(String placaVeiculo, String marcaVeiculo, String modelo,
                   int anoVeiculo, String corVeiculo, TipoVeiculoEnum tipoVeiculo, double quilometragemVeiculo, String numeroChassi, String renavam) {
        this.placaVeiculo = placaVeiculo;
        this.marcaVeiculo = marcaVeiculo;
        this.modelo = modelo;
        this.anoVeiculo = anoVeiculo;
        this.corVeiculo = corVeiculo;
        this.tipoVeiculo = tipoVeiculo;
        this.quilometragemVeiculo = quilometragemVeiculo;
        this.numeroChassi = numeroChassi;
        this.renavam = renavam;
    }

    public Long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public void setPlacaVeiculo(String placaVeiculo) {
        this.placaVeiculo = placaVeiculo;
    }

    public String getMarcaVeiculo() {
        return marcaVeiculo;
    }

    public void setMarcaVeiculo(String marcaVeiculo) {
        this.marcaVeiculo = marcaVeiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoVeiculo() {
        return anoVeiculo;
    }

    public void setAnoVeiculo(int anoVeiculo) {
        this.anoVeiculo = anoVeiculo;
    }

    public String getCorVeiculo() {
        return corVeiculo;
    }

    public void setCorVeiculo(String corVeiculo) {
        this.corVeiculo = corVeiculo;
    }

    public TipoVeiculoEnum getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculoEnum tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public double getQuilometragemVeiculo() {
        return quilometragemVeiculo;
    }

    public void setQuilometragemVeiculo(double quilometragemVeiculo) {
        this.quilometragemVeiculo = quilometragemVeiculo;
    }

    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }
}
