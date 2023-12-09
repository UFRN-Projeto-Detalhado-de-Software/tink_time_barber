package com.eliasfs06.tinktime.repository;

import com.eliasfs06.tinktime.model.Funcionario;
import com.eliasfs06.tinktime.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncionarioRepository extends GenericRepository<Funcionario> {

    @Query(value = "SELECT func FROM Funcionario func WHERE func.user = ?1 AND func.active = true", nativeQuery = false)
    Funcionario findByUser(User user);

    @Query(value = "SELECT func FROM Funcionario func WHERE func.active = true", nativeQuery = false)
    java.util.List<Funcionario> listActiveFuncionarios();
}
