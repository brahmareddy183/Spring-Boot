package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.CurrencyConversion;
import com.app.service.CurrencySrevice;

@RestController
public class CurrencyWebController {
@Autowired 
private CurrencySrevice service;

@GetMapping(value="/currency/cfrom/{cfrom}/cto/{cto}/quantity/{quantity}",produces="application/json")
	public CurrencyConversion getConvert(@PathVariable("cfrom") String cfrom,@PathVariable("cto") String cto,@PathVariable("quantity") double  quantity) {
		CurrencyConversion currency=service.currencyCost(cfrom, cto, quantity);
		return currency;
	}
}
