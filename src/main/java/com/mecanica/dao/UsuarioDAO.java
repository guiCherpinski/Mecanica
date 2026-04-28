package com.mecanica.dao;

import com.mecanica.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UsuarioDAO {

    public void insertUsuario(Usuario usuario){
        String sql = "INSERT INTO usuario (nome_usuario, email_usuario, senha_usuario, cpf_usuario, telefone_usuario," +
                "perfil_usuario, ativo_usuario, logradouro_usuario, numero_usuario, complemento_usuario, bairro_usuario," +
                "cidade_usuario, estado_usuario, cep_usuario, especialidade_usuario, categoria_usuario) values (?,?,?," +
                "?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }
}
