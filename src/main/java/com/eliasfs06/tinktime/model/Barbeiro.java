package com.eliasfs06.tinktime.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.util.List;

@Entity
public class Barbeiro extends Funcionario {

    String barbearia;

    @Enumerated(EnumType.STRING)
    @ElementCollection
    List<TipoServico> servicos;

    public String getBarbearia() {
        return barbearia;
    }

    public void setBarbearia(String barbearia) {
        this.barbearia = barbearia;
    }

    public List<TipoServico> getServicos() {
        return servicos;
    }

    public void setServicos(List<TipoServico> servicos) {
        this.servicos = servicos;
    }
}
