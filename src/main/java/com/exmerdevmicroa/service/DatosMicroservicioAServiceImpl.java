package com.exmerdevmicroa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmerdevmicroa.dao.IDatosMicroServicioADao;
import com.exmerdevmicroa.model.DatosMicroservicioA;

@Service
public class DatosMicroservicioAServiceImpl implements IDatosMicroservicioAService{
	@Autowired
	private IDatosMicroServicioADao daoMicroA;

	@Override
	public DatosMicroservicioA save(DatosMicroservicioA datosMicroservicioA) {
		daoMicroA.save(datosMicroservicioA);
		return datosMicroservicioA;
	}
	

}
