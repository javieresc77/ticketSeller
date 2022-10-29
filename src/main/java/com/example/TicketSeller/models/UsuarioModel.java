package com.example.TicketSeller.models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique = true, nullable = false)
    private Long id;

    @Column(name="nombres", nullable = false)
    private String nombres;

    @Column(name="apellidos", nullable = false)
    private String apellidos;
    
    @Column(unique = true, nullable = false, name="rut")
    private String rut;

    public UsuarioModel() {}
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

	@Override
	public String toString() {
		return "UsuarioModel [" + (id != null ? "id=" + id + ", " : "")
				+ (nombres != null ? "nombres=" + nombres + ", " : "")
				+ (apellidos != null ? "apellidos=" + apellidos + ", " : "") + (rut != null ? "rut=" + rut : "") + "]";
	}
}