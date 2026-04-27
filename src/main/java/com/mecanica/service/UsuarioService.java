package com.mecanica.service;

import com.mecanica.enums.CategoriaEnum;
import com.mecanica.model.*;

import java.util.IllegalFormatCodePointException;

public class UsuarioService {

    private final UsuarioDAO usuarioDAO;

    public UsuarioService(UsuarioDAO usuarioDAO){
        this.usuarioDAO = usuarioDAO;
    }

    public void cadastrarCliente(String nome, String email, String senha, String cpf, String telefone, Endereco endereco, boolean ativo){
        validarNome(nome);
        validarEmail(email);
        validarSenha(senha);
        validarCpf(cpf);
        validarTelefone(telefone);

        Usuario usuario = new Cliente(nome,email,senha,cpf,telefone,endereco,ativo);
        usuarioDAO.insertCliente(usuario);
    }

    public void cadastrarTecnico(String nome, String email, String senha, String cpf, String telefone, Endereco endereco, boolean ativo,
                                 String especialidade, CategoriaEnum categoriaEnum){
        validarNome(nome);
        validarEmail(email);
        validarSenha(senha);
        validarCpf(cpf);
        validarTelefone(telefone);

        Usuario usuario = new Tecnico(nome, email, senha, cpf, telefone, endereco, ativo, especialidade, categoriaEnum);
        usuarioDAO.insertTecnico(nome,email,senha,cpf,telefone,endereco,ativo,especialidade,categoriaEnum);
    }

    public void cadastrarGerente(String nome, String email, String senha, String cpf, String telefone, Endereco endereco, boolean ativo){
        validarNome(nome);
        validarEmail(email);
        validarSenha(senha);
        validarCpf(cpf);
        validarTelefone(telefone);

        Usuario usuario = new Gerente(nome,email,senha,cpf,telefone,endereco,ativo);
        usuarioDAO.insertGerente(usuario);
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
}
