package com.uce.edu.demo.modelo;

public class AvionDTO {

	String nombre;
	
	public AvionDTO() {
		// TODO Auto-generated constructor stub
	}

	public AvionDTO(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "AvionDTO [nombre=" + nombre + "]";
	}

	// GET Y SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
