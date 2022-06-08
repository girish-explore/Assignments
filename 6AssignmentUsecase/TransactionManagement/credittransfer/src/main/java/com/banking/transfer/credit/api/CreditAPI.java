package com.banking.transfer.credit.api;

import com.company.payment.credit.credit.dto.CreditRequest;
import com.company.payment.credit.credit.dto.CreditResponse;
import com.company.payment.credit.credit.service.CreditManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Repository("api")
public class CreditAPI {
    @Autowired
    private CreditManager creditService;
    public ResponseEntity<CreditResponse> getCreditBalance(@RequestBody CreditRequest creditReq){
        CreditResponse res = creditService.getBalance(creditReq);
        return new ResponseEntity<CreditResponse>(res, HttpStatus.OK);
    }
}
