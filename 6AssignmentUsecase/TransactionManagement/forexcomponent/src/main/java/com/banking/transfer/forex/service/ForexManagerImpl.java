package com.company.payment.forex.forex.service;

import java.math.BigDecimal;
import java.util.Map;

import com.company.payment.forex.forex.dto.ForexRequest;
import com.company.payment.forex.forex.dto.ForexResponse;

import org.springframework.stereotype.Service;

@Service
public class ForexManagerImpl extends BaseForex implements ForexManager {

    @Override
    public ForexResponse getRates(ForexRequest req) {

        String key = req.getSrcCCY().concat(req.getDestCCY());
        Map<String,BigDecimal> rates=this.getRatesFeed();
        ForexResponse fxRes=new ForexResponse();
        if(rates.containsKey(key)){
            BigDecimal bdRates=rates.get(key);
            fxRes.setReqId(req.getReqId());
            fxRes.setRate(bdRates.floatValue());

        }else{
            fxRes.setReqId(req.getReqId());
            fxRes.setRate(0);
        }      
        
        
        
        return fxRes;
    }
    
}
