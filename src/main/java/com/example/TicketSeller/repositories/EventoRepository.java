package com.example.TicketSeller.repositories;

import java.util.Optional;

import com.example.TicketSeller.models.EventoModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends CrudRepository<EventoModel, Long> {
    public abstract Optional<EventoModel> findById(Long id);
    public abstract EventoModel findEventoById(Long id);

}
