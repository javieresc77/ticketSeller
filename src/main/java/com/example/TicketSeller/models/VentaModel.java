package com.example.TicketSeller.models;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "venta")
public class VentaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id", unique = true, nullable = false)
	private Long id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usuario")
	private UsuarioModel usuario;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "entrada")
	private EntradaModel entrada;

	@Column(name="ticket_id")
	private Long ticketID;
	
	@Column(name="user_id")
	private Long userID;

	public Long getTicketID() {
		return ticketID;
	}

	public void setTicketID(Long ticketID) {
		this.ticketID = ticketID;
	}

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}
	
	public EntradaModel getEntrada() {
		return entrada;
	}

	public void setEntrada(EntradaModel entrada) {
		this.entrada = entrada;
	}

	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
	
	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setId(Long idCompra) {
		this.id = idCompra;
	}


	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "VentaModel [" + (id != null ? "id=" + id + ", " : "")
				+ (usuario != null ? "usuario=" + usuario + ", " : "")
				+ (entrada != null ? "entrada=" + entrada + ", " : "")
				+ (ticketID != null ? "ticketID=" + ticketID + ", " : "") + (userID != null ? "userID=" + userID : "")
				+ "]";
	}



	//public int getSubtotal() {
	//	return subtotal;
	//}
	//public void setSubtotal(int subtotal) {
	//	this.subtotal = subtotal;
	//}
	
}
