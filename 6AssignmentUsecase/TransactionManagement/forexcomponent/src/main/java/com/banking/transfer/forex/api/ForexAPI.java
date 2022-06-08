package com.banking.transfer.forex.api;

import com.company.payment.forex.forex.dto.ForexRequest;
import com.company.payment.forex.forex.dto.ForexResponse;
import com.company.payment.forex.forex.service.ForexManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class ForexAPI {
@Autowired
    private ForexManager fxService;

    @PostMapping(value="/fx", produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ForexResponse> getForexRates(@RequestBody ForexRequest fxReq){
        ForexResponse res=fxService.getRates(fxReq);
        System.out.println(res);
        System.out.println("From Forex------------------------\n");
        return new ResponseEntity<ForexResponse>(res, HttpStatus.OK);

    }
}
