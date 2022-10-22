package com.example.TicketSeller.models;

import javax.persistence.*;

@Entity
@Table(name = "entrada")
public class EntradaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;
	
	@OneToOne(mappedBy = "entrada")
	private EventoModel evento;

	@Column(name="rut")
	private String rut;
	
	@Column(name="precio")
	private int precio;

	@OneToOne(mappedBy = "entrada")	
	private VentaModel venta;	

	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name="venta", nullable=false)
	//private VentaModel venta;
	
	//@OneToMany
	//@JoinColumn(name="id_venta", nullable=false)
	//private VentaModel venta;
	
	public VentaModel getVenta() {
		return venta;
	}
	public void setVenta(VentaModel venta) {
		this.venta = venta;
	}

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

	public String getRut() {
		return rut;
	}
	public void setRut(String rutInvitado) {
		this.rut = rutInvitado;
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
				+ rut + "]";
	}
}
