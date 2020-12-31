package com.exmerdevmicroa.controller;

import org.slf4j.Logger;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exmerdevmicroa.model.RequestMicroA;

@RestController
@RequestMapping("/api/microservicesa/v1/")
public class RequestMicroAController {
	Logger loggerTransaccionController = org.slf4j.LoggerFactory.getLogger(RequestMicroAController.class);
	
	@PostMapping("requestmicroa")
	public void callMicroA(@RequestBody RequestMicroA requestMicroA) {
		System.out.println(requestMicroA);		
		
	}

}
