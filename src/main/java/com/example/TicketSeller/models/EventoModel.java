package com.example.TicketSeller.models;

import javax.persistence.*;


@Entity
@Table(name = "evento")
public class EventoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_entrada", referencedColumnName = "id")
	private EntradaModel entrada;

	@Column(name="nombre")
	private String nombre;

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
	
	public EntradaModel getEntrada() {
		return entrada;
	}

	public void setEntrada(EntradaModel entrada) {
		this.entrada = entrada;
	}

}
