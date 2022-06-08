package com.company.paymentapi.bankpayment.service.debit;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import com.company.payment.dto.*;
import com.company.payment.dto.debit.*;
import com.company.paymentapi.bankpayment.config.FeignConfig;;



@FeignClient(name=DebitServiceRemoteClient.SERVICE_NAME,configuration = FeignConfig.class)
public interface DebitServiceRemoteClient {
    

    String SERVICE_NAME="debit-service";

    //@PostMapping(value="/fx", produces=MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(method=RequestMethod.POST,value="api/debit")
    @CircuitBreaker(name = SERVICE_NAME)
    public DebitResponse getDebitBalance(@RequestBody DebitRequest debitReq);

    
}
