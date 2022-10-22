package com.example.TicketSeller.services;

import java.util.ArrayList;
import java.util.Optional;

import com.example.TicketSeller.models.VentaModel;
import com.example.TicketSeller.repositories.VentaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {
    @Autowired
    VentaRepository ventaRepository;
    
    public ArrayList<VentaModel> obtenerVentas(){
        return (ArrayList<VentaModel>) ventaRepository.findAll();
    }

    public VentaModel guardarVenta(VentaModel venta){
        return ventaRepository.save(venta);
    }

    public Optional<VentaModel> obtenerPorId(Long id){
        return ventaRepository.findById(id);
    }

    public boolean eliminarVenta(Long id) {
        try{
            ventaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }


    
}
