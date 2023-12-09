package com.eliasfs06.tinktime.model.enums;

public enum Corte {
    CABELO("Cabelo"),
    BARBA("Barba"),
    BIGODE("Bigode"),
    CABELO_E_BARBA("Cabelo e Barba"),
    CABELO_E_BIGODE("Cabelo e Bigode"),
    BARBA_E_BIGODE("Barba e Bigode"),
    CABELO_BARBA_E_BIGODE("Cabelo, Barba e Bigode");

    public String getCorte() {
        return corte;
    }

    private final String corte;

    Corte(String corte) {
        this.corte = corte;
    }

}
