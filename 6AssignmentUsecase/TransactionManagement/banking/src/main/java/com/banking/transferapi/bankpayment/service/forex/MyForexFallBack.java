package com.company.paymentapi.bankpayment.service.forex;

import com.company.payment.dto.forex.ForexRequest;
import com.company.payment.dto.forex.ForexResponse;


import org.springframework.stereotype.Component;

@Component
public class MyForexFallBack implements ForexServiceRemoteClient{

    @Override
    public ForexResponse getForexRates(ForexRequest fxReq) {
        ForexResponse res=new ForexResponse();
        res.setRate(0);
        res.setReqId(fxReq.getReqId());
        return res;
    }
    
}
