package com.app.bean;

public class CurrencyConversionFormBean {
String cfrom;
String cto;
Integer cvalue;
public CurrencyConversionFormBean() {
	super();
}
public CurrencyConversionFormBean(String cfrom, String cto, Integer cvalue) {
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
public Integer getCvalue() {
	return cvalue;
}
public void setCvalue(Integer cvalue) {
	this.cvalue = cvalue;
}
@Override
public String toString() {
	return "CurrencyConversionFormBean [cfrom=" + cfrom + ", cto=" + cto + ", cvalue=" + cvalue + "]";
}

}
