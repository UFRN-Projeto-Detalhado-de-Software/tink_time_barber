package com.eliasfs06.tinktime.service;

import com.eliasfs06.tinktime.model.*;
import com.eliasfs06.tinktime.model.dto.BarbeiroDTO;
import com.eliasfs06.tinktime.model.dto.FuncionarioDTO;
import com.eliasfs06.tinktime.model.dto.UserDTO;
import com.eliasfs06.tinktime.repository.FuncionarioRepository;
import com.eliasfs06.tinktime.repository.GenericRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioService extends GenericService<Funcionario> {

    @Autowired
    private FuncionarioRepository repository;

    @Autowired
    private AgendaService agendaService;

    private FuncionarioCreator funcionarioCreator;

    public FuncionarioService(GenericRepository<Funcionario> repository) {
        super(repository);
    }

    public FuncionarioDTO findByUser(User user) {
        Barbeiro funcionario = (Barbeiro) repository.findByUser(user);
        return new BarbeiroDTO(funcionario);
    }

    public void createFuncionario(User user) {
        funcionarioCreator = new ConcreteCreatorBarbeiro();
        Funcionario funcionario = funcionarioCreator.createFuncionario();
        funcionario.setUser(user);
        agendaService.createAgenda(funcionario);
        save(funcionario);
    }

    public List<UserDTO> getListUserDTOFuncionarios(List<Funcionario> funcionarios){
        List<UserDTO> funcionariosUsers = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            funcionariosUsers.add(new UserDTO(funcionario.getUser()));
        }

        return funcionariosUsers;
    }

    public java.util.List<Funcionario> listActiveFuncionarios() {
        return repository.listActiveFuncionarios();
    }
}
