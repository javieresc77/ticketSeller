package com.example.TicketSeller.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.TicketSeller.models.EntradaModel;
import com.example.TicketSeller.repositories.EntradaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntradaService {
    @Autowired
    EntradaRepository entradaRepository;
    
    public ArrayList<EntradaModel> obtenerEntradas(){
        return (ArrayList<EntradaModel>) entradaRepository.findAll();
    }

    public EntradaModel guardarEntrada(EntradaModel entrada){
        System.out.println(entrada);
        return entradaRepository.save(entrada);
    }

    public Optional<EntradaModel> obtenerPorId(Long id){
        return entradaRepository.findById(id);
    }

    public boolean eliminarEntrada(Long id) {
        try{
            entradaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

	public EntradaModel obtenerEntradaPorId(Long id) {
        return entradaRepository.findEntradaById(id);
	}

}
