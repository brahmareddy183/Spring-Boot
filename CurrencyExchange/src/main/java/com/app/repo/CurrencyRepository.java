package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.entity.CurrencyEntity;

@Repository
public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Integer> {
	@Query(value = "from CurrencyEntity where cfrom=:from and cto=:to")
public CurrencyEntity findhd(String from,String to) ;
}

