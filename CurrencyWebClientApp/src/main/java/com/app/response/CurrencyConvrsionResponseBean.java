package com.app.response;

public class CurrencyConvrsionResponseBean {
private String cfrom;
private String cto;
private Double cvalue;
public CurrencyConvrsionResponseBean() {
	super();
}
public CurrencyConvrsionResponseBean(String cfrom, String cto, Double cvalue) {
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
public Double getCvalue() {
	return cvalue;
}
public void setCvalue(Double cvalue) {
	this.cvalue = cvalue;
}
@Override
public String toString() {
	return "CurrencyConvrsionResponseBean [cfrom=" + cfrom + ", cto=" + cto + ", cvalue=" + cvalue + "]";
}

}
