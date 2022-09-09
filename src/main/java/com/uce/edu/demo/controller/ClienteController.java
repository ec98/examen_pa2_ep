package com.uce.edu.demo.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.modelo.AvionDTO;
import com.uce.edu.demo.modelo.Vuelo;
import com.uce.edu.demo.modelo.VueloDTO;
import com.uce.edu.demo.service.IVueloService;

@Controller
@RequestMapping("/vuelos")
public class ClienteController {

	@Autowired
	private IVueloService iVueloService;

	@GetMapping("/buscar")
	public String busquedaVuelos(VueloDTO fecha, Model modelo) {
		Vuelo vuelo = new Vuelo();
		VueloDTO vdto = new VueloDTO();
		AvionDTO adto = new AvionDTO();
		vuelo.setFechaVuelo(LocalDateTime.parse(fecha.getFecha().concat("T00:00:00")));
		Vuelo v = this.iVueloService.buscarVuelosDisponibles(vuelo.getNumero(), vdto.getOrigen(), vdto.getDestino(),
				adto.getNombre(), vuelo.getAsientosDisponibles());
		modelo.addAttribute("vuelo", v);
		return "vistaListaVuelos";
	}

	@PostMapping("/insertar")
	public String insertarVuelo(VueloDTO vuelo) {
		this.iVueloService.ingresarVueloDto(vuelo);
		return "redirect:/vuelos/buscar";
	}

	@GetMapping("/nuevosVuelos")
	public String ventanaVuelo(VueloDTO vuelo) {
		return "vistaVentana";
	}
}
