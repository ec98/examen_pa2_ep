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
@Table(name = "avion")
public class Avion {

	@Id
	@Column(name = "avio_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vuel_id_seq")
	@SequenceGenerator(name = "vuel_id_seq", sequenceName = "vuel_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "avio_numero")
	private String numero;

	@Column(name = "avio_capacidad_asientos")
	private Integer capacidadAsientos;

	@OneToMany(mappedBy = "avion")
	private List<Vuelo> vuelos;

	@Override
	public String toString() {
		return "Avion [id=" + id + ", numero=" + numero + ", capacidadAsientos=" + capacidadAsientos + ", vuelos="
				+ vuelos + "]";
	}

	// GET Y SET
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getCapacidadAsientos() {
		return capacidadAsientos;
	}

	public void setCapacidadAsientos(Integer capacidadAsientos) {
		this.capacidadAsientos = capacidadAsientos;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public void setVuelos(List<Vuelo> vuelos) {
		this.vuelos = vuelos;
	}

}
