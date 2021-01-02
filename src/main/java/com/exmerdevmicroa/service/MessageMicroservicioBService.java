package com.exmerdevmicroa.service;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.connection.CorrelationData;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exmerdevmicroa.model.RequestMicroservicioB;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MessageMicroservicioBService {
	Logger logger = LoggerFactory.getLogger(MessageMicroservicioBService.class);
	private ObjectMapper mapper = new ObjectMapper();
	
	

	@Autowired
	private RabbitTemplate rabbitTemplate;

	public void sendMessage(RequestMicroservicioB datosMicroservicioB) {
		CorrelationData cd1 = new CorrelationData();
		logger.info("Enviando a microservicio B...", datosMicroservicioB.getName());
		try {
			rabbitTemplate.convertAndSend("","CREATED.DATOS.MICROSERVICESB",
					mapper.writeValueAsString(datosMicroservicioB),cd1);
		} catch (AmqpException | JsonProcessingException e) {
			e.printStackTrace();
		}			
	
		logger.info("Respuesta....");
		
		/*try {
			System.out.println(cd1.getFuture().get(60, TimeUnit.SECONDS).isAck());
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//System.out.println(correlationData.getReturnedMessage());
	}

}
