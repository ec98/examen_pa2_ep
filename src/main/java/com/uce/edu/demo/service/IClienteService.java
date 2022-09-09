package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Cliente;

public interface IClienteService {
	public void ingresar(Cliente cliente);

	public void registrando(Integer asientos, String cedula);

	public void actualizar(Cliente cliente);

}
