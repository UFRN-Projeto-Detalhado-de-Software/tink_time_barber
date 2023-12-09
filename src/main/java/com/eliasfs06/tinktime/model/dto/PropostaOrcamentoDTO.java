package com.eliasfs06.tinktime.model.dto;

import com.eliasfs06.tinktime.model.PropostaOrcamento;

public class PropostaOrcamentoDTO {
    private Long id;

    private PropostaIdeiaDTO propostaIdeia;

    private Float orcamento;

    public PropostaOrcamentoDTO(){}

    public PropostaOrcamentoDTO(PropostaOrcamento propostaOrcamento){
        this.id = propostaOrcamento.getId();
        this.propostaIdeia = new PropostaIdeiaDTO(propostaOrcamento.getPropostaIdeia());
        this.orcamento = propostaOrcamento.getOrcamento();
    }

    public PropostaOrcamentoDTO(PropostaIdeiaDTO propostaIdeia, Float orcamento) {
        this.propostaIdeia = propostaIdeia;
        this.orcamento = orcamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PropostaIdeiaDTO getPropostaIdeia() {
        return propostaIdeia;
    }

    public void setPropostaIdeia(PropostaIdeiaDTO propostaIdeia) {
        this.propostaIdeia = propostaIdeia;
    }

    public Float getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(Float orcamento) {
        this.orcamento = orcamento;
    }
}
