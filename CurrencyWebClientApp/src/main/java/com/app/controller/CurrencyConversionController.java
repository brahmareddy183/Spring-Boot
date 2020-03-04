package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.bean.CurrencyConversionFormBean;
import com.app.response.CurrencyConvrsionResponseBean;
import com.app.service.CurrencyConversionService;

@Controller
public class CurrencyConversionController {
@Autowired
public CurrencyConversionService service;
@RequestMapping(value=("/display"))
public String displyCurrencyForm(Model model) {
	CurrencyConversionFormBean currencyConversionFormBean = new CurrencyConversionFormBean();
	//Controller to UI
	model.addAttribute("currencyConversionFormBean", currencyConversionFormBean);
	//return logical name
	return "ConversionForm";
}
@RequestMapping(value="/save", method = RequestMethod.POST)
public String conversion(@ModelAttribute("currencyConversionFormBean") CurrencyConversionFormBean currencyConversionFormBean ,Model model) {
	CurrencyConvrsionResponseBean responseBean=service.convertCurrency(currencyConversionFormBean);
	model.addAttribute("responseBean", responseBean);
	System.out.println(responseBean.getCvalue());
	return "ConversionForm";
}
}
