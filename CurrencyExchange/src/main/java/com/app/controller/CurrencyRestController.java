package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.CurrencyEntity;
import com.app.service.CurrencyService;

@RestController
public class CurrencyRestController {
	@Autowired
	private CurrencyService service;
	
	@GetMapping(value="/get/cfrom/{cfrom}/to/{to}",produces="application/json")
public CurrencyEntity getCurrencyCost(@PathVariable("cfrom") String cfrom,@PathVariable("to") String to) {
		
		
	CurrencyEntity e=service.findCurrencyFrom(cfrom, to);
return  e;
}


}
