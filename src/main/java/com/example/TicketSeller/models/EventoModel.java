package com.example.TicketSeller.models;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "evento")
public class EventoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;

	//@OneToOne(mappedBy = "evento")
	private Long entrada;
	private String nombre;
	
	//public EventoModel(Long idLocacion, String nombre) {
	//	this.idLocacion = idLocacion;
	//	this.nombre = nombre;
	//}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getEntrada() {
		return entrada;
	}

	public void setEntrada(Long entrada) {
		this.entrada = entrada;
	}

}
