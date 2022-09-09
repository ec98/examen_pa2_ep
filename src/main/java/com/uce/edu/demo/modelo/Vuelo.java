package com.uce.edu.demo.modelo;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vuelo")
public class Vuelo {

	@Id
	@Column(name = "vuel_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vuel_id_seq")
	@SequenceGenerator(name = "vuel_id_seq", sequenceName = "vuel_id_seq", allocationSize = 1)
	private Integer id;
	@Column(name = "vuel_numero")
	private String numero;
	@Column(name = "vuel_fecha_vuelo")
	private LocalDateTime fechaVuelo;
	@Column(name = "vuel_asientos_disponibles")
	private Integer asientosDisponibles;

	@Column(name = "vuel_valor_asiento")
	private Integer valorAsiento;
	@Column(name = "vuel_estado")
	private String estado;

	@ManyToOne
	@JoinColumn(name = "vuel_id_avion")
	private Avion avion;

	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", numero=" + numero + ", fechaVuelo=" + fechaVuelo + ", asientosDisponibles="
				+ asientosDisponibles + ", valorAsiento=" + valorAsiento + ", estado=" + estado + ", avion=" + avion
				+ "]";
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

	public LocalDateTime getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDateTime fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public Integer getAsientosDisponibles() {
		return asientosDisponibles;
	}

	public void setAsientosDisponibles(Integer asientosDisponibles) {
		this.asientosDisponibles = asientosDisponibles;
	}

	public Integer getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(Integer valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

}
