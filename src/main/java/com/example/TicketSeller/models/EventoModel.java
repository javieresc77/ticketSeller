package com.example.TicketSeller.models;

import javax.persistence.*;

@Entity
@Table(name = "evento")
public class EventoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;

	/*
	//@OneToOne(cascade = CascadeType.ALL)
	@OneToOne(mappedBy = "evento")
	@JoinColumn(name = "entrada")
	private EntradaModel entrada;
*/
	@Column(name="nombre")
	private String nombre;

	@Column(name="capacidad")
	private int capacidad;
	
	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

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
	/*
	public EntradaModel getEntrada() {
		return entrada;
	}

	public void setEntrada(EntradaModel entrada) {
		this.entrada = entrada;
	}
	*/
	@Override
	public String toString() {
		return "EventoModel [" + (id != null ? "id=" + id + ", " : "")
			//	+ (entrada != null ? "entrada=" + entrada + ", " : "")
				+ (nombre != null ? "nombre=" + nombre + ", " : "") + "capacidad=" + capacidad + "]";
	}

}
