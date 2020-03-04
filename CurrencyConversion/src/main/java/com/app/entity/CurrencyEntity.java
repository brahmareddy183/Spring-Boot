package com.app.entity;

public class CurrencyEntity {
public Integer cid;
public String cfrom;
public String cto;
public Double cvalue;

public CurrencyEntity() {
	super();
}

public CurrencyEntity(Integer cid, String cfrom, String cto, Double cvalue) {
	super();
	this.cid = cid;
	this.cfrom = cfrom;
	this.cto = cto;
	this.cvalue = cvalue;
}

public Integer getCid() {
	return cid;
}

public void setCid(Integer cid) {
	this.cid = cid;
}

public String getCfrom() {
	return cfrom;
}

public void setCfrom(String cfrom) {
	this.cfrom = cfrom;
}

public String getCto() {
	return cto;
}

public void setCto(String cto) {
	this.cto = cto;
}

public Double getCvalue() {
	return cvalue;
}

public void setCvalue(Double cvalue) {
	this.cvalue = cvalue;
}

@Override
public String toString() {
	return "CurrencyEntity [cid=" + cid + ", cfrom=" + cfrom + ", cto=" + cto + ", cvalue=" + cvalue + "]";
}



	
}
