package com.mecanica.controller;

import com.mecanica.enums.TipoVeiculoEnum;
import com.mecanica.service.VeiculoService;

public class VeiculoController {

    private final VeiculoService veiculoService;

    public VeiculoController(VeiculoService veiculoService) {
        this.veiculoService = veiculoService;
    }

    public void cadastrarVeiculo(String placa, String marca, String modelo, int ano,
                                 String cor, TipoVeiculoEnum tipo, double quilometragem,
                                 String chassi, String renavam, Long idCliente) {
        validarPlacaVeiculo(placa);
        validarMarcaVeiculo(marca);
        validarModeloVeiculo(modelo);
        validarAnoVeiculo(ano);
        validarCorVeiculo(cor);
        validarTipoVeiculo(tipo);
        validarQuilometragem(quilometragem);
        validarIdCliente(idCliente);

        veiculoService.cadastrarVeiculo(placa, marca, modelo, ano, cor, tipo,
                quilometragem, chassi, renavam, idCliente);
    }

    public void validarPlacaVeiculo(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("ERRO - PLACA NÃO PODE SER VAZIA!");
        }
    }

    public void validarMarcaVeiculo(String marca) {
        if (marca == null || marca.isBlank()) {
            throw new IllegalArgumentException("ERRO - MARCA NÃO PODE SER VAZIA!");
        }
    }

    public void validarModeloVeiculo(String modelo) {
        if (modelo == null || modelo.isBlank()) {
            throw new IllegalArgumentException("ERRO - MODELO NÃO PODE SER VAZIO!");
        }
    }

    public void validarAnoVeiculo(int ano) {
        if (ano <= 0) {
            throw new IllegalArgumentException("ERRO - ANO NÃO PODE SER INVÁLIDO!");
        }
    }

    public void validarCorVeiculo(String cor) {
        if (cor == null || cor.isBlank()) {
            throw new IllegalArgumentException("ERRO - COR NÃO PODE SER VAZIA!");
        }
    }

    public void validarTipoVeiculo(TipoVeiculoEnum tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("ERRO - TIPO DE VEÍCULO NÃO PODE SER NULO!");
        }
    }

    public void validarQuilometragem(double quilometragem) {
        if (quilometragem < 0) {
            throw new IllegalArgumentException("ERRO - QUILOMETRAGEM NÃO PODE SER NEGATIVA!");
        }
    }

    public void validarIdCliente(Long idCliente) {
        if (idCliente == null) {
            throw new IllegalArgumentException("ERRO - CLIENTE NÃO PODE SER NULO!");
        }
    }
}