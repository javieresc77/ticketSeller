package com.example.TicketSeller.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.TicketSeller.models.EntradaModel;
import com.example.TicketSeller.models.EventoModel;
import com.example.TicketSeller.services.EntradaService;
import com.example.TicketSeller.services.EventoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/evento")
public class EventoController {
    @Autowired
    EventoService eventoService;
    @Autowired
    EntradaService entradaService;
    
    @GetMapping()
    public ArrayList<EventoModel> obtenerEventos(){
        return eventoService.obtenerEventos();
    }

    @PostMapping()
    public EventoModel guardarEvento(@RequestBody EventoModel evento){
    	System.out.println(evento.getCapacidad());
    	for(int i = 0; i < evento.getCapacidad(); i++) {
    		EntradaModel entrada = new EntradaModel();
    		entrada.setEvento(evento);
    		entrada.setPrecio(5000);
    		this.entradaService.guardarEntrada(entrada);
    	}
        return this.eventoService.guardarEvento(evento);
    }

    @GetMapping( path = "/{id}")
    public Optional<EventoModel> obtenerEventoPorId(@PathVariable("id") Long id) {
        return this.eventoService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.eventoService.eliminarEvento(id);
        if (ok){
            return "Se eliminó el evento con id " + id;
        }else{
            return "No pudo eliminar el evento con id " + id;
        }
    }

}
