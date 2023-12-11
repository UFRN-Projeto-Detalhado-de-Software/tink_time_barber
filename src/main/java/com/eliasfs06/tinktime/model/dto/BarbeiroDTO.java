package com.eliasfs06.tinktime.model.dto;

import com.eliasfs06.tinktime.model.Barbeiro;
import com.eliasfs06.tinktime.model.TipoServico;

import java.util.List;

public class BarbeiroDTO extends FuncionarioDTO {

    String barbearia;

    List<TipoServico> servicos;

    BarbeiroDTO() {
        super();
    }

    public BarbeiroDTO(Barbeiro barbeiro) {
        super(barbeiro);
        this.barbearia = barbeiro.getBarbearia();
        this.servicos = barbeiro.getServicos();
    }

    public Barbeiro toBarbeiro() {
        Barbeiro barbeiro = (Barbeiro) super.toFuncionario();
        barbeiro.setBarbearia(this.barbearia);
        barbeiro.setServicos(this.servicos);
        return barbeiro;
    }

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
