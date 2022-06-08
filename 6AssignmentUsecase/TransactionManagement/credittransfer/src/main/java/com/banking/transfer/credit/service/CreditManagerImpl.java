package com.company.payment.credit.service;




import com.company.payment.credit.credit.dto.CreditRequest;
import com.company.payment.credit.credit.dto.CreditResponse;

import org.springframework.stereotype.Service;
@Service
public class CreditManagerImpl extends BaseCredit implements CreditManager {

    @Override
    public CreditResponse getBalance(CreditRequest creditReq) {
        
        //Map<String,BigDecimal> currentbalance=this.getBalanceBeforeCredit();
        float balance=this.getBalanceBeforeCredit()+ creditReq.getAmtToCredit().floatValue();

        CreditResponse creditRes=new CreditResponse();
        creditRes.setReqId(creditReq.getReqId());
        creditRes.setBalanceAmt(balance);
        return creditRes;
    }


    
}
