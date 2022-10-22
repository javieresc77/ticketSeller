package com.example.TicketSeller.models;

import javax.persistence.*;

@Entity
@Table(name = "entrada")
public class EntradaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;
	
	//@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "idEvento", referencedColumnName = "id")
	private Long evento;
	
	//private VentaModel venta;
	private String rutInvitado;
	private int precio;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getEvento() {
		return evento;
	}
	public void setEvento(Long evento) {
		this.evento = evento;
	}

	public String getRutInvitado() {
		return rutInvitado;
	}
	public void setRutInvitado(String rutInvitado) {
		this.rutInvitado = rutInvitado;
	}
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Entrada [id=" + id + ", evento=" + ", rutInvitado="
				+ rutInvitado + "]";
	}
}
