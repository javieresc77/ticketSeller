package com.example.TicketSeller.models;

import javax.persistence.*;

@Entity
@Table(name = "entrada")
public class EntradaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	private EventoModel evento;
	
	@Column(name="precio")
	private int precio;

	public EntradaModel() {}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public EventoModel getEvento() {
		return evento;
	}
	public void setEvento(EventoModel evento) {
		this.evento = evento;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "EntradaModel [" + (id != null ? "id=" + id + ", " : "")
				+ (evento != null ? "evento=" + evento + ", " : "") + "precio=" + precio + "]";
	}
	

}
