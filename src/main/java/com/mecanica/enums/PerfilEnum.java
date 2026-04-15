package com.mecanica.enums;

public enum PerfilEnum {

    CLIENTE(1),
    TECNICO(2),
    GERENTE(3),
    ADMINISTRADOR(4);

    private final int id;

    PerfilEnum(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public static PerfilEnum deId(int id){
        for (PerfilEnum perfil : values()){
            if (perfil.getId() == id){
                return perfil;
            }
        }
        throw new IllegalArgumentException("ERRO - ID DE NÍVEL INVÁLIDO!");
    }
}
