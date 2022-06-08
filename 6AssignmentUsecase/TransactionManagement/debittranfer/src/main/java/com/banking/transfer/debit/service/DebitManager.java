package com.company.payment.debit.debit.service;

import com.company.payment.debit.debit.dto.DebitRequest;
import com.company.payment.debit.debit.dto.DebitResponse;

public interface DebitManager {
    public DebitResponse getBalance(DebitRequest debitReq);
    
}
