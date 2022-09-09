package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Avion;

@Repository
@Transactional
public class AvionRepositoryImpl implements IAvionRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Avion avion) {
		// TODO Auto-generated method stub
		this.entityManager.persist(avion);
	}

}
