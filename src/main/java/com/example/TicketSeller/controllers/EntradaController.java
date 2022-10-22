package com.example.TicketSeller.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.TicketSeller.models.EntradaModel;
import com.example.TicketSeller.services.EntradaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/entrada")
public class EntradaController {
    @Autowired
    EntradaService entradaService;

    @GetMapping()
    public ArrayList<EntradaModel> obtenerEntradas(){
        return entradaService.obtenerEntradas();
    }

    @PostMapping()
    public EntradaModel guardarEntrada(@RequestBody EntradaModel entrada){
        return this.entradaService.guardarEntrada(entrada);
    }

    @GetMapping( path = "/{id}")
    public Optional<EntradaModel> obtenerEntradaPorId(@PathVariable("id") Long id) {
        return this.entradaService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.entradaService.eliminarEntrada(id);
        if (ok){
            return "Se eliminó la entrada con id " + id;
        }else{
            return "No pudo eliminar la entrada con id" + id;
        }
    }

}
