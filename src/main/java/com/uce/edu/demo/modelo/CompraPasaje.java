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
@Table(name = "compra_pasaje")
public class CompraPasaje {

	@Id
	@Column(name = "copa_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "copa_id_seq")
	@SequenceGenerator(name = "copa_id_seq", sequenceName = "copa_id_seq", allocationSize = 1)
	private Integer id;

	@Column(name = "copa_numero")
	private String numero;

	@Column(name = "copa_fecha_compra")
	private LocalDateTime fechaCompra;

	@Column(name = "copa_capacidad_asientos_comprados")
	private Integer capacidadAsientosComprados;

	@Column(name = "copa_estado")
	private String estado;

	@ManyToOne
	@JoinColumn(name = "copa_id_vuelo")
	private Vuelo vuelo;

	@ManyToOne
	@JoinColumn(name = "copa_id_cliente")
	private Cliente cliente;

	@Override
	public String toString() {
		return "CompraPasaje [id=" + id + ", numero=" + numero + ", fechaCompra=" + fechaCompra
				+ ", capacidadAsientosComprados=" + capacidadAsientosComprados + ", estado=" + estado + ", vuelo="
				+ vuelo + ", cliente=" + cliente + "]";
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

	public LocalDateTime getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(LocalDateTime fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Integer getCapacidadAsientosComprados() {
		return capacidadAsientosComprados;
	}

	public void setCapacidadAsientosComprados(Integer capacidadAsientosComprados) {
		this.capacidadAsientosComprados = capacidadAsientosComprados;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
