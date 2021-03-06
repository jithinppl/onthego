package com.project.onthego.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.onthego.DTO.PaymentDto;
import com.project.onthego.service.PaymentService;



@RestController
@RequestMapping(value="/api")
public class PaymentController {
	@Autowired
	PaymentService paymentService ;
	
	@RequestMapping(path="/payment", method = RequestMethod.POST)
    public String createPayment(@RequestBody @Valid PaymentDto paymentDto) {
		
		return paymentService.addPayment(paymentDto);
	}
}
