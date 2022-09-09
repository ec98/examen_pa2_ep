package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vuelo;
import com.uce.edu.demo.modelo.VueloDTO;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(Vuelo vuelo) {
		// TODO Auto-generated method stub
		this.entityManager.persist(vuelo);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public VueloDTO buscarVuelosDisponibles(String fecha) {
		// TODO Auto-generated method stub
		TypedQuery<VueloDTO> miquery = this.entityManager.createQuery(
				"SELECT NEW com.uce.edu.demo.modelo.Vuelo(v.fecha) FROM Vuelo WHERE v.fechaVuelo =: fecha",
				VueloDTO.class);
		miquery.setParameter("fecha", fecha);
		return miquery.getSingleResult();
	}

}
