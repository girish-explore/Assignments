package com.company.payment.credit.service;

import com.company.payment.credit.credit.dto.CreditRequest;
import com.company.payment.credit.credit.dto.CreditResponse;

public interface CreditManager {
    public CreditResponse getBalance(CreditRequest creditReq);
    
}
