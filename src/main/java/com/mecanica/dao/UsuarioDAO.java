package com.mecanica.dao;

import com.mecanica.database.ConnectionFactory;
import com.mecanica.model.Tecnico;
import com.mecanica.model.Usuario;

import java.sql.*;

public class UsuarioDAO {

    public void insertUsuario(Usuario usuario){
        String sql = "INSERT INTO usuario (nome_usuario, email_usuario, senha_usuario, cpf_usuario, telefone_usuario," +
                "perfil_usuario, ativo_usuario, logradouro_usuario, numero_usuario, complemento_usuario, bairro_usuario," +
                "cidade_usuario, estado_usuario, cep_usuario, especialidade_usuario, categoria_usuario) values (?,?,?," +
                "?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try(Connection connection = ConnectionFactory.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, usuario.getNomeUser());
            stmt.setString(2, usuario.getEmailUser());
            stmt.setString(3, usuario.getSenhaUser());
            stmt.setString(4, usuario.getCpfUser());
            stmt.setString(5, usuario.getTelefoneUser());
            stmt.setInt(6, usuario.getPerfil().getId());
            stmt.setBoolean(7, usuario.isAtivo());
            stmt.setString(8, usuario.getEnderecoUser().getLogradouro());
            stmt.setString(9, usuario.getEnderecoUser().getNumero());
            stmt.setString(10, usuario.getEnderecoUser().getComplemento());
            stmt.setString(11, usuario.getEnderecoUser().getBairro());
            stmt.setString(12, usuario.getEnderecoUser().getCidade());
            stmt.setString(13, usuario.getEnderecoUser().getEstado());
            stmt.setString(14, usuario.getEnderecoUser().getCep());

            if (usuario instanceof Tecnico tecnico) {
                stmt.setString(15, tecnico.getEspecialidade());
                stmt.setInt(16, tecnico.getCategoria().getId());
            } else {
                stmt.setNull(15, java.sql.Types.VARCHAR);
                stmt.setNull(16, java.sql.Types.INTEGER);
            }

            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    usuario.setIdUser(rs.getLong(1));
                }
            }
        } catch (SQLException e) {
        throw new RuntimeException("ERRO - FALHA AO SALVAR USUÁRIO!", e);
    }
    }
}
