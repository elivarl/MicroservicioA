package com.exmerdevmicroa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exmerdevmicroa.model.DatosMicroservicioA;

@Repository
public interface IDatosMicroServicioADao extends JpaRepository<DatosMicroservicioA, Integer> {

}
