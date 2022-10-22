package com.example.TicketSeller.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.TicketSeller.models.EventoModel;
import com.example.TicketSeller.services.EventoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/evento")
public class EventoController {
    @Autowired
    EventoService eventoService;

    @GetMapping()
    public ArrayList<EventoModel> obtenerEventos(){
        return eventoService.obtenerEventos();
    }

    @PostMapping()
    public EventoModel guardarEvento(@RequestBody EventoModel evento){
        return this.eventoService.guardarEvento(evento);
    }

    @GetMapping( path = "/{id}")
    public Optional<EventoModel> obtenerEventoPorId(@PathVariable("id") Long id) {
        return this.eventoService.obtenerPorId(id);
    }

    //@GetMapping("/query")
    //public ArrayList<EventoModel> obtenerEventoPorPrioridad(@RequestParam("prioridad") Integer prioridad){
    //    return this.eventoService.obtenerPorPrioridad(prioridad);
    //}

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.eventoService.eliminarEvento(id);
        if (ok){
            return "Se eliminó el evento con id " + id;
        }else{
            return "No pudo eliminar el evento con id" + id;
        }
    }

}
