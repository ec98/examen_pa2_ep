package com.uce.edu.demo.service;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Avion;
import com.uce.edu.demo.repository.IAvionRepository;

@Service
public class AvionServiceImpl implements IAvionService {

	@Autowired
	private IAvionRepository iAvionRepository;
	
	@Override
	@Transactional(value = TxType.REQUIRES_NEW)
	public void ingresar(Avion avion) {
		// TODO Auto-generated method stub
		this.iAvionRepository.insertar(avion);
	}

}
