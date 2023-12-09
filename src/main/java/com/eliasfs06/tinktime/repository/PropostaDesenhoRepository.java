package com.eliasfs06.tinktime.repository;

import com.eliasfs06.tinktime.model.PropostaDesenho;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PropostaDesenhoRepository extends GenericRepository<PropostaDesenho> {

    @Query(value = "SELECT pd.* FROM proposta_desenho pd " +
            " JOIN proposta_orcamento po ON po.id = pd.proposta_orcamento_id " +
            " JOIN proposta_ideia pi ON pi.id = po.propostaideia_id " +
            " WHERE pi.cliente_id = ?1", nativeQuery = true)
    Optional<List<PropostaDesenho>> findAllByClienteId(Long id);
}
