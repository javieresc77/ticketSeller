package com.example.TicketSeller.repositories;

import java.util.Optional;

import com.example.TicketSeller.models.UsuarioModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract Optional<UsuarioModel> findById(Long prioridad);
    public abstract UsuarioModel findUserById(Long id);

}
