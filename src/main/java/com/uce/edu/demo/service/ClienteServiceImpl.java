package com.uce.edu.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Avion;
import com.uce.edu.demo.modelo.Cliente;
import com.uce.edu.demo.modelo.CompraPasaje;
import com.uce.edu.demo.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepository iClienteRepository;

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void ingresar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepository.ingresar(cliente);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void registrando(Integer asientos, String cedula) {
		// TODO Auto-generated method stub
		Avion v = new Avion();
		v.setCapacidadAsientos(asientos);

		CompraPasaje cp = new CompraPasaje();
		cp.setCapacidadAsientosComprados(asientos);
		cp.setEstado("RES");
		List<CompraPasaje> list = new ArrayList<>();
		list.add(cp);
		Cliente c = this.iClienteRepository.buscarCedula(cedula);
		c.setCompraPasaje(list);
		this.iClienteRepository.ingresar(c);

	}

	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.iClienteRepository.actualizar(cliente);
	}

}
