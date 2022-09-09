package com.uce.edu.demo.service;

import java.time.LocalDateTime;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.AvionDTO;
import com.uce.edu.demo.modelo.Vuelo;
import com.uce.edu.demo.modelo.VueloDTO;
import com.uce.edu.demo.repository.IVueloRepository;

import net.bytebuddy.asm.Advice.Local;

@Service
public class VueloServiceImpl implements IVueloService {

	@Autowired
	private IVueloRepository iVueloRepository;

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void ingresar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.iVueloRepository.insertar(vuelo);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public Vuelo buscarVuelosDisponibles(String numero, String origen, String destino, String nombre, Integer valor) {
		// TODO Auto-generated method stub
		Vuelo v = new Vuelo();
		VueloDTO vdt = new VueloDTO();
		AvionDTO adto = new AvionDTO();
		v.setFechaVuelo(LocalDateTime.parse(vdt.getFecha().concat("T00:00:00")));
		vdt.setOrigen(origen);
		vdt.setDestino(destino);
		vdt.setFecha(v.getFechaVuelo().toString());
		v.setNumero(numero);
		v.setAvion(v.getAvion());
		v.setValorAsiento(valor);
		v.setEstado("DIS");
		adto.setNombre(nombre);
		if (v.getEstado().equals("DIS")) {
			this.iVueloRepository.buscarVuelosDisponibles(vdt.getFecha());
		} else {
			throw new RuntimeException();
		}

		return v;
	}
	
	@Override
	public void ingresarVueloDto(VueloDTO dto) {
		// TODO Auto-generated method stub
		dto.setOrigen(dto.getFecha());
	}

}
