package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Vuelo;
import com.uce.edu.demo.modelo.VueloDTO;

public interface IVueloRepository {

	public void insertar(Vuelo vuelo);
	
	public VueloDTO buscarVuelosDisponibles(String fecha);
	
}
