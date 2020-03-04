package com.app.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.app.bean.CurrencyConversionFormBean;
import com.app.response.CurrencyConvrsionResponseBean;
@Service
public class CurrencyConversionService {
//private static final String CCE_REST_ENDPOINT = "http://localhost:2222/currency/cfrom/{cfrom}/cto/{cto}/quantity/{quantity}";
	private static final String CCE_REST_ENDPOINT = "https://cc-apps.cfapps.io/currency/cfrom/{cfrom}/cto/{cto}/quantity/{quantity}";
	
	public CurrencyConvrsionResponseBean convertCurrency(CurrencyConversionFormBean formBean) {
		WebClient.Builder builder = WebClient.builder();
		WebClient webClient = builder.build();
		CurrencyConvrsionResponseBean response= 
			  webClient.get()
				                 .uri(CCE_REST_ENDPOINT,formBean.getCfrom(),formBean.getCto(),formBean.getCvalue())
			                	 .retrieve()
			                 	 .bodyToMono(CurrencyConvrsionResponseBean.class)
	                			 .block();
		
	return response;
	}
}
