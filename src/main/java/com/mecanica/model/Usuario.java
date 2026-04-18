package com.mecanica.model;

import com.mecanica.enums.PerfilEnum;

public abstract class Usuario {

    private Long idUser;
    private String nomeUser;
    private String emailUser;
    private String senhaUser;
    private String cpfUser;
    private String telefoneUser;
    private Endereco enderecoUser;
    private PerfilEnum perfil;
    private boolean ativo;

    public Usuario(Long idUser, String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, Endereco enderecoUser,
                   PerfilEnum perfil, boolean ativo) {
        this.idUser = idUser;
        this.nomeUser = nomeUser;
        this.emailUser = emailUser;
        this.senhaUser = senhaUSer;
        this.cpfUser = cpfUser;
        this.telefoneUser = telefoneUser;
        this.enderecoUser = enderecoUser;
        this.perfil = perfil;
        this.ativo = ativo;
    }

    public Usuario(String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, Endereco enderecoUser,
                   PerfilEnum perfil, boolean ativo) {
        this.nomeUser = nomeUser;
        this.emailUser = emailUser;
        this.senhaUser = senhaUSer;
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

    public Endereco getEnderecoUser() {
        return enderecoUser;
    }

    public void setEnderecoUser(Endereco enderecoUser) {
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

    public String getSenhaUser() {
        return senhaUser;
    }

    public void setSenhaUser(String senhaUSer) {
        this.senhaUser = senhaUSer;
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

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }
}
