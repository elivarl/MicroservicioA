package com.exmerdevmicroa.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmerdevmicroa.model.RequestMicroservicioB;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MessageMicroservicioBService {
	Logger logger = LoggerFactory.getLogger(MessageMicroservicioBService.class);
	private final ObjectMapper mapper = new ObjectMapper() ;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	
	public void sendMessage (RequestMicroservicioB datosMicroservicioB) {
		logger.info("Enviando a microservicio B...", datosMicroservicioB.getName());
		try {
			rabbitTemplate.convertAndSend("CREATED.DATOS.MICROSERVICESB", mapper.writeValueAsString(datosMicroservicioB));
		} catch (AmqpException | JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	
	

}
