package com.eliasfs06.tinktime.repository;

import com.eliasfs06.tinktime.model.PropostaOrcamento;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PropostaOrcamentoRepository extends GenericRepository<PropostaOrcamento>{

    @Query("SELECT p FROM PropostaOrcamento p WHERE p.propostaIdeia.cliente.id = ?1")
    Optional<List<PropostaOrcamento>> findAllByClienteId(Long id);

    @Query(value = "SELECT po.* FROM proposta_orcamento po " +
            " JOIN proposta_ideia pt ON pt.id = po.propostaideia_id " +
            " WHERE po.status_aprovacao = ?1 AND pt.id = ?2", nativeQuery = true)
    Optional<List<PropostaOrcamento>> findAllByStatusAprovacaoAndPropostaIdeiaId(String statusAprovacao, Long tatuagemId);
}
