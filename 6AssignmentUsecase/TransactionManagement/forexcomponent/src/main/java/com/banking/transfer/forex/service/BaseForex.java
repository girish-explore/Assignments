package com.company.payment.forex.forex.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public abstract class BaseForex {
    protected Map<String,BigDecimal> getRatesFeed(){
        Map<String,BigDecimal> rates=new HashMap<>();
        rates.put("INRUSD", new BigDecimal("72.56"));
        rates.put("INREUR", new BigDecimal("172.56"));
        return rates;
    } 
}
