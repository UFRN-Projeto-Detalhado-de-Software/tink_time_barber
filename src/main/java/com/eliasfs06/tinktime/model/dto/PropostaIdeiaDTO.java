package com.eliasfs06.tinktime.model.dto;

import com.eliasfs06.tinktime.model.PropostaIdeia;
import com.eliasfs06.tinktime.model.enums.Corte;

import java.text.ParseException;

public class PropostaIdeiaDTO {

    private Long id;

    private UserDTO cliente;

    private UserDTO tatuador;

    private String descricao;

    private Corte corte;

    private byte[] referencia;


    public PropostaIdeiaDTO() {
    }

    public PropostaIdeiaDTO(PropostaIdeia propostaIdeia) {
        this.id = propostaIdeia.getId();
        this.cliente = new UserDTO(propostaIdeia.getCliente());
        this.tatuador = new UserDTO(propostaIdeia.getTatuador());
        this.descricao = propostaIdeia.getDescricao();
    }

    public PropostaIdeiaDTO(UserDTO cliente, UserDTO tatuador, String descricao, byte[] referencia, Corte corte) {
        this.cliente = cliente;
        this.tatuador = tatuador;
        this.descricao = descricao;
        this.referencia = referencia;
        this.corte = corte;
    }

    public PropostaIdeia toPropostaIdeia() throws ParseException {
        PropostaIdeia propostaIdeia = new PropostaIdeia();
        propostaIdeia.setCliente(this.cliente.toUser());
        propostaIdeia.setTatuador(this.tatuador.toUser());
        propostaIdeia.setDescricao(this.descricao);
        propostaIdeia.setReferencia(this.referencia);
        propostaIdeia.setCorte(this.corte);
        return propostaIdeia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO getCliente() {
        return cliente;
    }

    public void setCliente(UserDTO cliente) {
        this.cliente = cliente;
    }

    public UserDTO getTatuador() {
        return tatuador;
    }

    public void setTatuador(UserDTO tatuador) {
        this.tatuador = tatuador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Corte getCorte() {
        return corte;
    }

    public void setCorte(Corte corte) {
        this.corte = corte;
    }

    public byte[] getReferencia() {
        return referencia;
    }

    public void setReferencia(byte[] referencia) {
        this.referencia = referencia;
    }
}
