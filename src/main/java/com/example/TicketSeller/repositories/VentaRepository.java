package com.example.TicketSeller.repositories;

import java.util.ArrayList;
import java.util.Optional;

import com.example.TicketSeller.models.VentaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VentaRepository extends CrudRepository<VentaModel, Long> {
    public abstract Optional<VentaModel> findById(Long id);

}
