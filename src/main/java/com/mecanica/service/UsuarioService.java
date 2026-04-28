package com.mecanica.service;

import com.mecanica.dao.UsuarioDAO;
import com.mecanica.enums.CategoriaEnum;
import com.mecanica.model.*;

import java.util.IllegalFormatCodePointException;

public class UsuarioService {

    private final UsuarioDAO usuarioDAO;

    public UsuarioService(UsuarioDAO usuarioDAO){
        this.usuarioDAO = usuarioDAO;
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
        validarBairro(bairro);
        validarCidade(cidade);
        validarEstado(estado);
        validarCep(cep);

        Endereco endereco = new Endereco(logradouro,numero,complemento,bairro,cidade,estado,cep);
        Usuario usuario = new Cliente(nome,email,senha,cpf,telefone,endereco,ativo);

        usuarioDAO.insertUsuario(usuario);
    }

    public void cadastrarTecnico(String nome, String email, String senha, String cpf, String telefone, boolean ativo, String logradouro, String numero,
                                 String complemento, String bairro, String cidade, String estado, String cep,
                                 String especialidade, CategoriaEnum categoriaEnum){
        validarNome(nome);
        validarEmail(email);
        validarSenha(senha);
        validarCpf(cpf);
        validarTelefone(telefone);

        validarLogradouro(logradouro);
        validarNumero(numero);
        validarBairro(bairro);
        validarCidade(cidade);
        validarEstado(estado);
        validarCep(cep);

        Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep);
        Usuario usuario = new Tecnico(nome, email, senha, cpf, telefone, endereco, ativo, especialidade, categoriaEnum);
        usuarioDAO.insertUsuario(usuario);
    }

    public void cadastrarGerente(String nome, String email, String senha, String cpf, String telefone, boolean ativo, String logradouro, String numero,
                                 String complemento, String bairro, String cidade, String estado, String cep){
        validarNome(nome);
        validarEmail(email);
        validarSenha(senha);
        validarCpf(cpf);
        validarTelefone(telefone);

        validarLogradouro(logradouro);
        validarNumero(numero);
        validarBairro(bairro);
        validarCidade(cidade);
        validarEstado(estado);
        validarCep(cep);

        Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep);
        Usuario usuario = new Gerente(nome,email,senha,cpf,telefone,endereco,ativo);
        usuarioDAO.insertUsuario(usuario);
    }

    public void validarNome(String nome){
        if (nome.length() < 2){
            throw new IllegalArgumentException("ERRO - NOME MUITO PEQUENO!");
        }
    }

    public void validarEmail(String email){
        if (email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")){
            throw new IllegalArgumentException("ERRO - DOMÍNIO INVÁLIDO!");
        }
    }

    public void validarSenha(String senha){
        if (senha.length() < 5){
            throw new IllegalArgumentException("ERRO - TAMANHO DE SENHA INVÁLIDO!");
        }
    }

    public void validarCpf(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", "");

        if (cpf.length() != 11) {
            throw new IllegalArgumentException("ERRO - CPF DEVE TER 11 DÍGITOS!");
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            throw new IllegalArgumentException("ERRO - CPF INVÁLIDO!");
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito >= 10) primeiroDigito = 0;

        if (primeiroDigito != (cpf.charAt(9) - '0')) {
            throw new IllegalArgumentException("ERRO - CPF INVÁLIDO!");
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito >= 10) segundoDigito = 0;

        if (segundoDigito != (cpf.charAt(10) - '0')) {
            throw new IllegalArgumentException("ERRO - CPF INVÁLIDO!");
        }
    }

    public void validarTelefone(String telefone){
        if (telefone.length() != 11){
            throw new IllegalArgumentException("ERRO - TAMANHO DE TELEFONE INVÁLIDO!");
        }
    }

    public void validarLogradouro(String logradouro){
        if (logradouro.length() < 5){
            throw new IllegalArgumentException("ERRO - LOGRADOURO MUITO CURTO!");
        }
    }

    public void validarNumero(String numero){
        if (numero.matches(".*[<>?|\\/].*")) {
            throw new RuntimeException("ERRO - CARACTÉR INVÁLIDO DIGITADO!");
        }

        if (numero.matches("-\\d+")) {
            throw new RuntimeException("ERRO - NÚMERO DEVE SER POSITIVO!");
        }
    }

    public void validarBairro(String bairro){
        if (bairro.length() < 3){
            throw new IllegalArgumentException("ERRO - NOME DE BAIRRO MUITO CURTO!");
        }
    }

    public void validarCidade(String cidade){
        if (cidade.matches(".*\\d.*")) {
            throw new RuntimeException("ERRO - NOME DE CIDADE NÃO PODE CONTER NÚMERO!");
        }

        if (cidade.length() < 3){
            throw new IllegalArgumentException("ERRO - NOME DE CIDADE MUITO CURTO!");
        }
    }

    public void validarEstado(String estado){
        if (estado.length() != 2){
            throw new IllegalArgumentException("ERRO - DIGITE APENAS A SIGLA DO ESTADO!");
        }
    }

    public void validarCep(String cep){
        String apenasNumeros = cep.replaceAll("[^0-9]", "");
        if (apenasNumeros.length() != 8){
            throw new IllegalArgumentException("ERRO - CEP DEVE CONTER EXATOS 8 NÚMEROS!");
        }
    }
}
