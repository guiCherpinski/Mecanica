package com.mecanica.enums;

public enum StatusOSEnum {

    ABERTA(1),
    EM_DIAGNOSTICO(2),
    AGUARDANDO_APROVACAO(3),
    APROVADA(4),
    EM_EXECUCAO(5),
    CONCLUIDA(6),
    ENTREGUE(7),
    CANCELADA(8);

    private final int id;

    StatusOSEnum(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public static StatusOSEnum deId(int id){
        for (StatusOSEnum status : values()){
            if (status.getId() == id){
                return status;
            }
        }
        throw new IllegalArgumentException("ERRO - ID DE STATUS INVÁLIDO!");
    }
}
