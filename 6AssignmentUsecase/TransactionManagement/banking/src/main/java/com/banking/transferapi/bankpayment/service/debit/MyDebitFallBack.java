package com.banking.transferapi.bankpayment.service.debit;

import com.company.payment.dto.debit.DebitRequest;
import com.company.payment.dto.debit.DebitResponse;


import org.springframework.stereotype.Component;

@Component
public class MyDebitFallBack implements DebitServiceRemoteClient{

   

    @Override
    public DebitResponse getDebitBalance(DebitRequest debitReq) {
        
        DebitResponse res = new DebitResponse();
        res.setBalanceAmt(1238908);
        res.setReqId(debitReq.getReqId());
        return res;
    }
    
}
