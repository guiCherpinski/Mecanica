package com.mecanica.controller;

import com.mecanica.enums.CategoriaEnum;
import com.mecanica.model.Endereco;

public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }

    public void cadastrarCliente(String nome, String email, String senha, String cpf, String telefone, Endereco endereco, boolean ativo){
        validarNome(nome);
        validarEmail(email);
        validarSenha(senha);
        validarCpf(cpf);
        validarTelefone(telefone);
        validarEndereco(endereco);


        usuarioService.cadastrarCliente(nome,email,senha,cpf,telefone,endereco,ativo);
    }

    public void cadastrarTecnico(String nome, String email, String senha, String cpf, String telefone, Endereco endereco, boolean ativo,
                                 String especialidade, CategoriaEnum categoriaEnum){
        validarNome(nome);
        validarEmail(email);
        validarSenha(senha);
        validarCpf(cpf);
        validarTelefone(telefone);
        validarEndereco(endereco);
        validarEspecialidade(especialidade);
        validarCategoria(categoriaEnum);

        usuarioService.cadastrarTecnico(nome,email,senha,cpf,telefone,endereco,ativo,especialidade,categoriaEnum);
    }

    public void cadastrarGerente(String nome, String email, String senha, String cpf, String telefone, Endereco endereco, boolean ativo){
        validarNome(nome);
        validarEmail(email);
        validarSenha(senha);
        validarCpf(cpf);
        validarTelefone(telefone);
        validarEndereco(endereco);

        usuarioService.cadastrarGerente(nome,email,senha,cpf,telefone,endereco,ativo);
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

    public void validarEndereco(Endereco endereco){
        if (endereco == null){
            throw new IllegalArgumentException("ERRO - ENDEREÇO NÃO PODE SER VAZIO!");
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
}
