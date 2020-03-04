package com.app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.app.entity.CurrencyConversion;
import com.app.entity.CurrencyEntity;


@Service

public class CurrencySrevice {
	//private static final String GET_CURRENCY_FROM_TO_URL= "http://localhost:1111/get/cfrom/{cfrom}/to/{to}";
	private static final String GET_CURRENCY_FROM_TO_URL= "https://cce-app.cfapps.io/get/cfrom/{cfrom}/to/{to}";
	
	public CurrencyConversion currencyCost(String cfrom,String cto,double quantity) {
		CurrencyConversion c =new CurrencyConversion();
		WebClient.Builder builder = WebClient.builder();
		WebClient webClient = builder.build();
		CurrencyEntity e= webClient.get()
				.uri(GET_CURRENCY_FROM_TO_URL,cfrom,cto,quantity)
				.retrieve()
				.bodyToMono(CurrencyEntity.class)
				.block();

		double totalAmount=quantity * e.cvalue;
		c.setCfrom(e.getCfrom());
		c.setCto(e.getCto());
		c.setCvalue(totalAmount);
		return c;

	}
}
