package com.exmerdevmicroa.service;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Configuration {
	@Bean
    public Queue llamarMicroservicioB() {
        return new Queue("CREATED.DATOS.MICROSERVICESB");
    }

}
