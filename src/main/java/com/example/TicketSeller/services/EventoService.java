package com.example.TicketSeller.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.TicketSeller.models.EventoModel;
import com.example.TicketSeller.repositories.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {
    @Autowired
    EventoRepository eventoRepository;
    
    public ArrayList<EventoModel> obtenerEventos(){
        return (ArrayList<EventoModel>) eventoRepository.findAll();
    }

    public EventoModel guardarEvento(EventoModel evento){
        return eventoRepository.save(evento);
    }

    public Optional<EventoModel> obtenerPorId(Long id){
        return eventoRepository.findById(id);
    }

    public boolean eliminarEvento(Long id) {
        try{
            eventoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}
