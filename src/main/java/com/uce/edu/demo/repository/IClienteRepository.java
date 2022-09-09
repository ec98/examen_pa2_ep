package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Cliente;

public interface IClienteRepository {
	
	public void ingresar(Cliente cliente);
	
	public void actualizar(Cliente cliente);
	
	public Cliente buscarCedula(String cedula);
}
