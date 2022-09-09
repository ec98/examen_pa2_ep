package com.uce.edu.demo.modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name = "clie_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clie_id_seq")
	@SequenceGenerator(name = "clie_id_seq", sequenceName = "clie_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "clie_nombre")
	private String nombre;

	@Column(name = "clie_cedula")
	private String cedula;

	@OneToMany(mappedBy = "cliente")
	private List<CompraPasaje> compraPasaje;

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", compraPasaje=" + compraPasaje
				+ "]";
	}

	// GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<CompraPasaje> getCompraPasaje() {
		return compraPasaje;
	}

	public void setCompraPasaje(List<CompraPasaje> compraPasaje) {
		this.compraPasaje = compraPasaje;
	}

}
