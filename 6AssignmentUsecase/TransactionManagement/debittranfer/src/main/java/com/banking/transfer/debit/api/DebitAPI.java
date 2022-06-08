package com.banking.transfer.debit.api;

import com.company.payment.debit.debit.dto.DebitRequest;
import com.company.payment.debit.debit.dto.DebitResponse;
import com.company.payment.debit.debit.service.DebitManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Repository("api")
public class DebitAPI {
    @Autowired
    private DebitManager debitService;
    public ResponseEntity<DebitResponse> getDebitBalance(@RequestBody DebitRequest debitReq){
        DebitResponse res = debitService.getBalance(debitReq);
        return new ResponseEntity<DebitResponse>(res, HttpStatus.OK);
    }
}
