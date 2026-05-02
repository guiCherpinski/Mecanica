package com.mecanica.service;

import com.mecanica.dao.UsuarioDAO;
import com.mecanica.dao.VeiculoDAO;
import com.mecanica.enums.TipoVeiculoEnum;
import com.mecanica.model.Cliente;
import com.mecanica.model.Veiculo;

public class VeiculoService {

    public final VeiculoDAO veiculoDAO;
    public final UsuarioDAO usuarioDAO;

    public VeiculoService(VeiculoDAO veiculoDAO, UsuarioDAO usuarioDAO){
        this.veiculoDAO = veiculoDAO;
        this.usuarioDAO = usuarioDAO;
    }

    public void cadastrarVeiculo(String placa, String marca, String modelo, int ano,
                                 String cor, TipoVeiculoEnum tipo, double quilometragem,
                                 String chassi, String renavam, Long idCliente){

        validarPlacaVeiculo(placa);
        validarAnoVeiculo(ano);
        validarRenavamVeiculo(renavam);
        Cliente cliente = buscarClienteId(idCliente);
        Veiculo veiculo = new Veiculo(placa,marca,modelo,ano,cor,tipo,quilometragem,chassi,renavam,cliente);

        veiculoDAO.cadastrarVeiculo(veiculo);
    }


    public void validarPlacaVeiculo(String placa) {
        if (!placa.matches("[A-Z]{3}[0-9]{4}|[A-Z]{3}[0-9][A-Z][0-9]{2}")) {
            throw new IllegalArgumentException("ERRO - PLACA DEVE ESTAR NO PADRÃO");
        }
    }

    public void validarAnoVeiculo(int ano) {
        if (String.valueOf(ano).length() != 4){
            throw new IllegalArgumentException("ERRO - ANO INVÁLIDO");
        }
    }

    public void validarRenavamVeiculo(String renavam) {
        if (renavam.length() != 11) {
            throw new IllegalArgumentException("ERRO - RENAVAM DEVE CONTER 11 DIGITOS");
        }
    }

}
