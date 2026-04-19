package com.mecanica.database;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException {
        Properties properties = new Properties();

        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("application.properties")) {
            if (input == null) {
                throw new RuntimeException("ERRO: Arquivo 'application.properties' não encontrado no classpath.");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("ERRO: Falha ao carregar as propriedades do banco.", e);
        }

        String url = properties.getProperty("db.url");
        String user = properties.getProperty("db.user");
        String senha = properties.getProperty("db.senha");

        try {
            return DriverManager.getConnection(url, user, senha);
        } catch (SQLException e) {
            throw new SQLException("ERRO: Não foi possível conectar ao banco de dados em " + url, e);
        }
    }
}
