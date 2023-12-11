package com.eliasfs06.tinktime.model;

import jakarta.persistence.Entity;

import java.util.List;

@Entity
public class Barbeiro extends Funcionario {

    String barbearia;

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
