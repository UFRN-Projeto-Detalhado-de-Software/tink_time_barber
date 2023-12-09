package com.eliasfs06.tinktime.model;

import com.eliasfs06.tinktime.exceptionsHandler.BusinessException;
import com.eliasfs06.tinktime.model.dto.PropostaIdeiaDTO;
import com.eliasfs06.tinktime.repository.GenericRepository;

public class ValidadorDeIdeiaBarbeiro extends ValidadorDeIdeia{

    public ValidadorDeIdeiaBarbeiro(GenericRepository<User> userRepository) {
        super(userRepository);
    }

    @Override
    public boolean validarCamposEspecificos(PropostaIdeiaDTO propostaIdeiaDTO) throws BusinessException {
        if (propostaIdeiaDTO.getReferencia() == null || propostaIdeiaDTO.getCorte() == null){
            throw new BusinessException("Criação de proposta inválida");
        }
        return true;
    }
}
