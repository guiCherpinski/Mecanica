package com.mecanica.model;

import com.mecanica.enums.CategoriaEnum;
import com.mecanica.enums.PerfilEnum;

public class Tecnico extends Usuario{

    private String especialidade;
    private CategoriaEnum categoria;

    public Tecnico(Long idUser, String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, Endereco enderecoUser, boolean ativo
    ,String especialidade, CategoriaEnum categoria) {
        super(idUser, nomeUser, emailUser, senhaUSer, cpfUser, telefoneUser, enderecoUser, PerfilEnum.TECNICO, ativo);
        this.especialidade = especialidade;
        this.categoria = categoria;
    }

    public Tecnico(String nomeUser, String emailUser, String senhaUSer, String cpfUser, String telefoneUser, Endereco enderecoUser, boolean ativo,
                   String especialidade, CategoriaEnum categoria) {
        super(nomeUser, emailUser, senhaUSer, cpfUser, telefoneUser, enderecoUser, PerfilEnum.TECNICO, ativo);
        this.especialidade = especialidade;
        this.categoria = categoria;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public CategoriaEnum getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEnum categoria) {
        this.categoria = categoria;
    }
}
