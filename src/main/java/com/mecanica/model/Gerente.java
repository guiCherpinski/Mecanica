package com.mecanica.model;

import com.mecanica.enums.PerfilEnum;

public class Gerente extends Usuario{

    public Gerente(Long idUser, String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, Endereco enderecoUser, boolean ativo) {
        super(idUser, nomeUser, emailUser, senhaUSer, cpfUser, telefoneUser, enderecoUser, PerfilEnum.GERENTE, ativo);
    }

    public Gerente(String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, Endereco enderecoUser, boolean ativo) {
        super(nomeUser, emailUser, senhaUSer, cpfUser, telefoneUser, enderecoUser, PerfilEnum.GERENTE, ativo);
    }
}
