package com.example.TicketSeller.controllers;

import java.util.ArrayList;
import java.util.Optional;

import com.example.TicketSeller.models.EntradaModel;
import com.example.TicketSeller.models.UsuarioModel;
import com.example.TicketSeller.models.VentaModel;
import com.example.TicketSeller.services.EntradaService;
import com.example.TicketSeller.services.UsuarioService;
import com.example.TicketSeller.services.VentaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    VentaService ventaService;
    @Autowired
    EntradaService entradaService;
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<VentaModel> obtenerVentas(){
        return ventaService.obtenerVentas();
    }

    @PostMapping()
    public VentaModel guardarVenta(@RequestBody VentaModel venta){
    	System.out.println("Guardando venta");
    	System.out.println(venta.toString());
    	EntradaModel entrada = (EntradaModel) this.entradaService.obtenerEntradaPorId(venta.getTicketID());
    	UsuarioModel usuario = this.usuarioService.obtenerUsuarioPorId(venta.getUserID());
    	
    	System.out.println(usuario.toString());

    	venta.setUsuario(usuario);
    	venta.setEntrada(entrada);
        return this.ventaService.guardarVenta(venta);
    }

    @GetMapping( path = "/{id}")
    public Optional<VentaModel> obtenerVentaPorId(@PathVariable("id") Long id) {
        return this.ventaService.obtenerPorId(id);
    }

    @DeleteMapping( path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id){
        boolean ok = this.ventaService.eliminarVenta(id);
        if (ok){
            return "Se eliminó el venta con id " + id;
        }else{
            return "No pudo eliminar el venta con id" + id;
        }
    }

}
