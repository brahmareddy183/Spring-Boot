package com.app.entity;

public class CurrencyConversion {
	
public String cfrom;
public String cto;
public double cvalue;
public CurrencyConversion() {
	super();
}
public CurrencyConversion(String cfrom, String cto, double cvalue) {
	super();
	this.cfrom = cfrom;
	this.cto = cto;
	this.cvalue = cvalue;
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
public double getCvalue() {
	return cvalue;
}
public void setCvalue(double cvalue) {
	this.cvalue = cvalue;
}
@Override
public String toString() {
	return "CurrencyConversion [cfrom=" + cfrom + ", cto=" + cto + ", cvalue=" + cvalue + "]";
}


}

