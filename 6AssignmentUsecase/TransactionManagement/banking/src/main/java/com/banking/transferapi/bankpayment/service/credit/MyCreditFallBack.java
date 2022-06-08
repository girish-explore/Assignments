package com.company.paymentapi.bankpayment.service.credit;

import com.company.payment.dto.credit.CreditRequest;
import com.company.payment.dto.credit.CreditResponse;


import org.springframework.stereotype.Component;

@Component
public class MyCreditFallBack implements CreditServiceRemoteClient{



    @Override
    public CreditResponse getCreditBalance(CreditRequest creditReq) {
        System.out.println("from CreditResponse in Fallback--------------\n");
        CreditResponse res = new CreditResponse();
        res.setBalanceAmt(345678);
        res.setReqId(creditReq.getReqId());
        return null;
    }
    
}
