package com.mecanica.enums;

public enum FormaPagamentoEnum {

    DINHEIRO(1),
    CARTAO_DEBITO(2),
    CARTAO_CREDITO(3),
    PIX(4),
    BOLETO(5),
    PARCELADO(6);

    private final int id;

    FormaPagamentoEnum(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public static FormaPagamentoEnum deId(int id){
        for (FormaPagamentoEnum forma : values()){
            if (forma.getId() == id){
                return forma;
            }
        }
        throw new IllegalArgumentException("ERRO - ID DE NÍVEL INVÁLIDO!");
    }

}
