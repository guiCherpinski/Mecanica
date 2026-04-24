package com.mecanica.enums;

public enum TipoVeiculoEnum {
    CARRO(1),
    MOTO(2),
    CAMINHA0(3),
    VAN(4),
    UTILITARIO(5),
    ONIBUS(6);

    private final int id;

    TipoVeiculoEnum(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static TipoVeiculoEnum deId(int id){
        for (TipoVeiculoEnum tipo : values()){
            if (tipo.getId() == id){
                return tipo;
            }
        }
        throw new IllegalArgumentException("ERRO - ID DE STATUS INVÁLIDO!");
    }
}
