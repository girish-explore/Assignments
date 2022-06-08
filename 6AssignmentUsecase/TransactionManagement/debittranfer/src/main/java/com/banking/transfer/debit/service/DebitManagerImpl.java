package com.company.payment.debit.debit.service;




import com.company.payment.debit.debit.dto.DebitRequest;
import com.company.payment.debit.debit.dto.DebitResponse;

import org.springframework.stereotype.Service;
@Service
public class DebitManagerImpl extends BaseDebit implements DebitManager {

    @Override
    public DebitResponse getBalance(DebitRequest debitReq) {
        
        //Map<String,BigDecimal> currentbalance=this.getBalanceBeforeDebit();
        float balance=this.getBalanceBeforeDebit()- debitReq.getAmtToDebit().floatValue();

        DebitResponse debitRes=new DebitResponse();
        debitRes.setReqId(debitReq.getReqId());
        debitRes.setBalanceAmt(balance);
        return debitRes;
    }


    
}
