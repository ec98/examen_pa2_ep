package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Cliente;

@Repository
@Transactional
public class ClienteRepositoryImpl implements IClienteRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void ingresar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cliente);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public Cliente buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Cliente> query = this.entityManager.createQuery("SELECT c FROM Cliente WHERE c.cedula =: cedula",
				Cliente.class);
		query.setParameter("cedula", cedula);
		return query.getSingleResult();
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cliente);
	}

}
