package com.example.TicketSeller.models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "venta")
public class VentaModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private String rutComprador;
	
  //@OneToOne(mappedBy = "venta", fetch = FetchType.LAZY, orphanRemoval = false)
	//private List<EntradaModel> entradas;
	private int subtotal;
	
	//public VentaModel(String rutComprador, String[] idEntradas, int subtotal) {
	//	this.rutComprador = rutComprador;
	//	this.subtotal = subtotal;
	//}

	public String getRutComprador() {
		return rutComprador;
	}

	public void setRutComprador(String rutComprador) {
		this.rutComprador = rutComprador;
	}

	public Long getIdCompra() {
		return id;
	}

	public void setIdCompra(Long idCompra) {
		this.id = idCompra;
	}

	//public List<EntradaModel> getIdEntradas() {
	//	return entradas;
	//}

	//public void setIdEntradas(List<EntradaModel> idEntradas) {
	//	this.entradas = idEntradas;
	//}

	public int getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(int subtotal) {
		this.subtotal = subtotal;
	}
	
}
