package com.uce.edu.demo.modelo;

public class VueloDTO {

	private String origen;
	private String destino;
	private String fecha;
	
	public VueloDTO() {
		// TODO Auto-generated constructor stub
	}

	public VueloDTO(String origen, String destino, String fecha) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "VueloDTO [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + "]";
	}

	// GET Y SET
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
