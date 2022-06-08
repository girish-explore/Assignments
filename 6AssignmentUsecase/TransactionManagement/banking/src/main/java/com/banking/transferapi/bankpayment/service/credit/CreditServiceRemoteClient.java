package com.company.paymentapi.bankpayment.service.credit;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


import com.company.payment.dto.credit.CreditRequest;
import com.company.payment.dto.credit.CreditResponse;
import com.company.paymentapi.bankpayment.config.FeignConfig;;



@FeignClient(name=CreditServiceRemoteClient.SERVICE_NAME,configuration = FeignConfig.class)
public interface CreditServiceRemoteClient {
    

    String SERVICE_NAME="credit-service";

    //@PostMapping(value="/fx", produces=MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(method=RequestMethod.POST,value="api/fx")
    @CircuitBreaker(name = SERVICE_NAME)
    public CreditResponse getCreditBalance(@RequestBody CreditRequest creditReq);

    
}
