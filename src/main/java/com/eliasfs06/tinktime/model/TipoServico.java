package com.eliasfs06.tinktime.model;

import java.util.Arrays;
import java.util.List;

public enum TipoServico {

    CORTE("Corte de Cabelo"),
    BARBA("Barba"),
    LAVAGEM("Lavagem de Cabelo"),
    DEPILACAO("Depilação"),
    DESIGN_SOBRAVELHAS("Design de Sobrancelhas"),
    COLORACAO("Coloração de Cabelo"),
    MASSAGEM_CAPILAR("Massagem Capilar"),
    TRATAMENTO_CAPILAR("Tratamento Capilar");

    private final String description;

    TipoServico(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static List<TipoServico> getAllServicos() {
        return Arrays.asList(TipoServico.values());
    }
}
