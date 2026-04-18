package com.mecanica.enums;

public enum CategoriaEnum {
    MECANICA(1),
    ELETRICA(2),
    FUNILARIA(3),
    PINTURA(4),
    SUSPENSAO(5),
    AR_CONDICIONADO(6),
    REVISAO(7);

    private final int id;

    CategoriaEnum(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public static CategoriaEnum deId(int id){
        for (CategoriaEnum categoria : values()){
            if (categoria.getId() == id){
                return categoria;
            }
        }
        throw new IllegalArgumentException("ERRO - ID DE NÍVEL INVÁLIDO!");
    }
}
