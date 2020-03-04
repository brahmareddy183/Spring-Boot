package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.CurrencyEntity;
import com.app.repo.CurrencyRepository;

@Service
public class CurrencyService {
	@Autowired
private CurrencyRepository repository;
	
public CurrencyEntity findCurrencyFrom(String cfrom,String to) {
	CurrencyEntity e=repository.findhd(cfrom, to);
	return e;
}

}
