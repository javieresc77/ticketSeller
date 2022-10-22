package com.example.TicketSeller.repositories;

import java.util.ArrayList;
import java.util.Optional;

import com.example.TicketSeller.models.EntradaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntradaRepository extends CrudRepository<EntradaModel, Long> {
    public abstract Optional<EntradaModel> findById(Long id);

}
