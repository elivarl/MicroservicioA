package com.exmerdevmicroa.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exmerdevmicroa.model.DatosMicroservicioA;
import com.exmerdevmicroa.model.RequestMicroservicioA;
import com.exmerdevmicroa.model.RequestMicroservicioB;
import com.exmerdevmicroa.service.IDatosMicroservicioAService;
import com.exmerdevmicroa.service.MessageMicroservicioBService;

@RestController
@RequestMapping("/api/microservices/v1/")
public class MicroservicioAController {
	Logger loggerTransaccionController = org.slf4j.LoggerFactory.getLogger(MicroservicioAController.class);

	@Autowired
	private IDatosMicroservicioAService microServicioAService;
	
	@Autowired
	private MessageMicroservicioBService messageMicroservicioBService;

	
	@PostMapping("requestmicroa")
	public void callMicroA(@RequestBody RequestMicroservicioA requestMicroA) {
		//guardar los datos solo para MA
		DatosMicroservicioA datosMA=new DatosMicroservicioA(null, requestMicroA.getEmail(), requestMicroA.getPass());
		//guardar los datos solo para MB
		RequestMicroservicioB requestDatosMB= new RequestMicroservicioB(requestMicroA.getName(), requestMicroA.getLastname(), requestMicroA.getPhone());

		microServicioAService.save(datosMA);
		
		// llamado y envio de datos al microservicio b
		messageMicroservicioBService.sendMessage(requestDatosMB);
		
	}

}
