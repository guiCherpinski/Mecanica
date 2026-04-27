package com.mecanica.controller;

import com.mecanica.service.EnderecoService;

public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService){
        this.enderecoService = enderecoService;
    }

    public void enviarDados(String logradouro, String numero, String complemento, String bairro , String cidade,
                            String estado, String cep){
        validarLogradouro(logradouro);
        validarNumero(numero);
        validarComplemento(complemento);
        validarBairro(bairro);
        validarCidade(cidade);
        validarEstado(estado);
        validarCep(cep);

        enderecoService.enviarDados(logradouro,numero,complemento,bairro,cidade,estado,cep);
    }

    public void validarLogradouro(String logradouro){
        if (logradouro == null || logradouro.isBlank()){
            throw new IllegalArgumentException("ERRO - LOGRADOURO NÃO PODE SER VAZIO!");
        }
    }

    public void validarNumero(String numero){
        if (numero == null || numero.isBlank()){
            throw new IllegalArgumentException("ERRO - NÚMERO NÃO PODE SER VAZIO!");
        }
    }

    public void validarComplemento(String complemento){
        if (complemento == null ||complemento.isBlank()){
            throw new IllegalArgumentException("ERRO - COMPLEMENTO NÃO PODE SER VAZIO!");
        }
    }

    public void validarBairro(String bairro){
        if (bairro == null || bairro.isBlank()){
            throw new IllegalArgumentException("ERRO - BAIRRO NÃO PODE SER VAZIO!");
        }
    }

    public void validarCidade(String cidade){
        if (cidade == null || cidade.isBlank()){
            throw new IllegalArgumentException("ERRO - CIDADE NÃO PODE SER VAZIO!");
        }
    }

    public void validarEstado(String estado){
        if (estado == null || estado.isBlank()){
            throw new IllegalArgumentException("ERRO - ESTADO NÃO PODE SER VAZIO!");
        }
    }

    public void validarCep(String cep){
        if (cep == null || cep.isBlank()){
            throw new IllegalArgumentException("ERRO - CEP NÃO PODE SER VAZIO!");
        }
    }

}
