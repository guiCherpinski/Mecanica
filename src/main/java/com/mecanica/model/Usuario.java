package com.mecanica.model;

import com.mecanica.enums.PerfilEnum;

public abstract class Usuario {

    private long idUser;
    private String nomeUser;
    private String emailUser;
    private String senhaUSer;
    private String cpfUser;
    private String telefoneUser;
    private String enderecoUser;
    private PerfilEnum perfil;
    private boolean ativo;

    public Usuario(long idUser, String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, String enderecoUser,
                   PerfilEnum perfil, boolean ativo) {
        this.idUser = idUser;
        this.nomeUser = nomeUser;
        this.emailUser = emailUser;
        this.senhaUSer = senhaUSer;
        this.cpfUser = cpfUser;
        this.telefoneUser = telefoneUser;
        this.enderecoUser = enderecoUser;
        this.perfil = perfil;
        this.ativo = ativo;
    }

    public Usuario(String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, String enderecoUser,
                   PerfilEnum perfil, boolean ativo) {
        this.nomeUser = nomeUser;
        this.emailUser = emailUser;
        this.senhaUSer = senhaUSer;
        this.cpfUser = cpfUser;
        this.telefoneUser = telefoneUser;
        this.enderecoUser = enderecoUser;
        this.perfil = perfil;
        this.ativo = ativo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public PerfilEnum getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilEnum perfil) {
        this.perfil = perfil;
    }

    public String getEnderecoUser() {
        return enderecoUser;
    }

    public void setEnderecoUser(String enderecoUser) {
        this.enderecoUser = enderecoUser;
    }

    public String getTelefoneUser() {
        return telefoneUser;
    }

    public void setTelefoneUser(String telefoneUser) {
        this.telefoneUser = telefoneUser;
    }

    public String getCpfUser() {
        return cpfUser;
    }

    public void setCpfUser(String cpfUser) {
        this.cpfUser = cpfUser;
    }

    public String getSenhaUSer() {
        return senhaUSer;
    }

    public void setSenhaUSer(String senhaUSer) {
        this.senhaUSer = senhaUSer;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }
}
