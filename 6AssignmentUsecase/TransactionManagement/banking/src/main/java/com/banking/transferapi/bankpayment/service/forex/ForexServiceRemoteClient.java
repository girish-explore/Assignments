package com.company.paymentapi.bankpayment.service.forex;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import com.company.payment.dto.*;
import com.company.payment.dto.forex.ForexRequest;
import com.company.payment.dto.forex.ForexResponse;
import com.company.paymentapi.bankpayment.config.FeignConfig;;



@FeignClient(name=ForexServiceRemoteClient.SERVICE_NAME,configuration = FeignConfig.class)
public interface ForexServiceRemoteClient {
    

    String SERVICE_NAME="forex-service";

    //@PostMapping(value="/fx", produces=MediaType.APPLICATION_JSON_VALUE)
    @RequestMapping(method=RequestMethod.POST,value="api/fx")
    @CircuitBreaker(name = SERVICE_NAME)
    public ForexResponse getForexRates(@RequestBody ForexRequest fxReq);

    
}
