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

	@Column(name="subtotal")
	private int subtotal;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_usuario")
	private UsuarioModel usuario;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_entrada")
	private EntradaModel entrada;
	
	//@OneToMany(mappedBy="venta")
	//private Set<EntradaModel> entradas;

	//@ManyToOne
	//@JoinColumn(name="entradas", nullable=false)
	//private Set<EntradaModel> entradas;

	//public void setEntradas(Set<EntradaModel> entradas) {
	//	this.entradas = entradas;
	//}
	//public Set<EntradaModel> getEntradas() {
	//	return entradas;
	//}
	
	public UsuarioModel getUsuario() {
		return usuario;
	}

	public void setRutComprador(UsuarioModel rutComprador) {
		this.usuario = rutComprador;
	}

	public void setIdCompra(Long idCompra) {
		this.id = idCompra;
	}


	public Long getIdCompra() {
		return id;
	}


	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	
}
