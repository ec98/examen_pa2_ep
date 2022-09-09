package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Vuelo;
import com.uce.edu.demo.modelo.VueloDTO;

public interface IVueloService {

	public void ingresar(Vuelo vuelo);

	public Vuelo buscarVuelosDisponibles(String numero, String origen, String destino, String nombre, Integer valor);

	public void ingresarVueloDto(VueloDTO dto);

}
