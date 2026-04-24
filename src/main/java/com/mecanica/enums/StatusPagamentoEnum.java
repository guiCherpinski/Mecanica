package com.mecanica.enums;

public enum StatusPagamentoEnum {

    PENDENTE(1),
    PARCIAL(2),
    PAGO(3),
    CANCELADO(4);

    private final int id;

    StatusPagamentoEnum(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public static StatusPagamentoEnum deId(int id){
        for (StatusPagamentoEnum status : values()){
            if (status.getId() == id){
                return status;
            }
        }
        throw new IllegalArgumentException("ERRO - ID DE NÍVEL INVÁLIDO!");
    }
}
