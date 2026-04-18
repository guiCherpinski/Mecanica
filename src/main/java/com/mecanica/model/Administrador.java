package com.mecanica.model;

import com.mecanica.enums.PerfilEnum;

public class Administrador extends Usuario{

    public Administrador(Long idUser, String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, Endereco enderecoUser, boolean ativo) {
        super(idUser, nomeUser, emailUser, senhaUSer, cpfUser, telefoneUser, enderecoUser, PerfilEnum.ADMINISTRADOR, ativo);
    }

    public Administrador(String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, Endereco enderecoUser, boolean ativo) {
        super(nomeUser, emailUser, senhaUSer, cpfUser, telefoneUser, enderecoUser, PerfilEnum.ADMINISTRADOR, ativo);
    }
}
