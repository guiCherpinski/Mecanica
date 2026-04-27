package com.mecanica.controller;

import com.mecanica.enums.CategoriaEnum;
import com.mecanica.model.Endereco;
import com.mecanica.service.UsuarioService;

public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    public void cadastrarCliente(String nome, String email, String senha, String cpf, String telefone, boolean ativo, String logradouro, String numero,
                                 String complemento, String bairro, String cidade, String estado, String cep){
        validarNome(nome);
        validarEmail(email);
        validarSenha(senha);
        validarCpf(cpf);
        validarTelefone(telefone);

        validarLogradouro(logradouro);
        validarNumero(numero);
        validarComplemento(complemento);
        validarBairro(bairro);
        validarCidade(cidade);
        validarEstado(estado);
        validarCep(cep);

        usuarioService.cadastrarCliente(nome,email,senha,cpf,telefone,ativo,logradouro, numero, complemento,
                bairro, cidade, estado, cep);
    }

    public void cadastrarTecnico(String nome, String email, String senha, String cpf, String telefone, Endereco endereco, boolean ativo,
                                 String especialidade, CategoriaEnum categoriaEnum,  String logradouro, String numero,
                                 String complemento, String bairro, String cidade, String estado, String cep){
        validarNome(nome);
        validarEmail(email);
        validarSenha(senha);
        validarCpf(cpf);
        validarTelefone(telefone);
        validarEspecialidade(especialidade);
        validarCategoria(categoriaEnum);

        validarLogradouro(logradouro);
        validarNumero(numero);
        validarComplemento(complemento);
        validarBairro(bairro);
        validarCidade(cidade);
        validarEstado(estado);
        validarCep(cep);

        usuarioService.cadastrarTecnico(nome, email, senha, cpf, telefone, ativo,
                logradouro, numero, complemento, bairro, cidade, estado, cep, especialidade, categoriaEnum);
    }

    public void cadastrarGerente(String nome, String email, String senha, String cpf, String telefone, Endereco endereco, boolean ativo, String logradouro,
                                 String numero, String complemento, String bairro, String cidade, String estado, String cep){
        validarNome(nome);
        validarEmail(email);
        validarSenha(senha);
        validarCpf(cpf);
        validarTelefone(telefone);

        validarLogradouro(logradouro);
        validarNumero(numero);
        validarComplemento(complemento);
        validarBairro(bairro);
        validarCidade(cidade);
        validarEstado(estado);
        validarCep(cep);

        usuarioService.cadastrarGerente(nome,email,senha,cpf,telefone,ativo, logradouro, numero, complemento,
                bairro, cidade, estado, cep);
    }

    public void validarNome(String nome){
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("ERRO - NOME NÃO PODE SER VAZIO!");
        }
    }

    public void validarEmail(String email){
        if (email == null || email.isBlank()){
            throw new IllegalArgumentException("ERRO - EMAIL NÃO PODE SER VAZIO!");
        }
    }

    public void validarSenha(String senha){
        if (senha == null || senha.isBlank()){
            throw new IllegalArgumentException("ERRO - SENHA NÃO PODE SER VAZIO!");
        }
    }

    public void validarCpf(String cpf){
        if (cpf == null || cpf.isBlank()){
            throw new IllegalArgumentException("ERRO - CPF NÃO PODE SER VAZIO!");
        }
    }

    public void validarTelefone(String telefone){
        if (telefone == null || telefone.isBlank()){
            throw new IllegalArgumentException("ERRO - TELEFONE NÃO PODE SER VAZIO!");
        }
    }

    public void validarEspecialidade(String especialidade){
        if (especialidade == null || especialidade.isBlank()){
            throw new IllegalArgumentException("ERRO - ESPECIALIDADE NÃO PODE SER VAZIA!");
        }
    }

    public void validarCategoria(CategoriaEnum categoria){
        if (categoria == null){
            throw new IllegalArgumentException("ERRO - CATEGORIA NÃO PODE SER NULA!");
        }
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
