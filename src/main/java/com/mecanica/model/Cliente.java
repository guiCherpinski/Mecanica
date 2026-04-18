package com.mecanica.model;

import com.mecanica.enums.PerfilEnum;

public class Cliente extends Usuario{

    public Cliente(Long idUser, String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, Endereco enderecoUser, boolean ativo) {
        super(idUser, nomeUser, emailUser, senhaUSer, cpfUser, telefoneUser, enderecoUser, PerfilEnum.CLIENTE, ativo);
    }

    public Cliente(String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, Endereco enderecoUser, boolean ativo) {
        super(nomeUser, emailUser, senhaUSer, cpfUser, telefoneUser, enderecoUser, PerfilEnum.CLIENTE, ativo);
    }
}
