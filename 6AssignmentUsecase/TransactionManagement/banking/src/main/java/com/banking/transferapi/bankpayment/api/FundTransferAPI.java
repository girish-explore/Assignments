package com.banking.transferapi.bankpayment.api;

import java.util.UUID;

import com.company.payment.dto.forex.ForexRequest;
import com.company.payment.dto.forex.ForexResponse;
import com.company.payment.dto.credit.CreditRequest;
import com.company.payment.dto.credit.CreditResponse;
import com.company.payment.dto.debit.DebitRequest;
import com.company.payment.dto.debit.DebitResponse;
import com.company.paymentapi.bankpayment.dto.DoCreditRequest;
import com.company.paymentapi.bankpayment.dto.DoCreditResponse;
import com.company.paymentapi.bankpayment.dto.DoDebitRequest;
import com.company.paymentapi.bankpayment.dto.DoDebitResponse;
import com.company.paymentapi.bankpayment.dto.DoPaymentRequest;
import com.company.paymentapi.bankpayment.dto.DoPaymentResponse;
import com.company.paymentapi.bankpayment.service.credit.CreditServiceRemoteClient;
import com.company.paymentapi.bankpayment.service.debit.DebitServiceRemoteClient;
import com.company.paymentapi.bankpayment.service.forex.ForexServiceRemoteClient;

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
public class FundTransferAPI {
    @Autowired
    private ForexServiceRemoteClient fxClient;
   
    private CreditServiceRemoteClient creditClient;
   
    private DebitServiceRemoteClient debitClient;

    @PostMapping(value = "/doPayments", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DoPaymentResponse> doPayments(@RequestBody DoPaymentRequest req) {
        System.out.println("From Payment-----------------\n");
        ForexRequest fxReq = new ForexRequest();
        fxReq.setDestCCY(req.getCcy());
        fxReq.setSrcCCY("INR");
        fxReq.setReqId(UUID.randomUUID().toString());
        System.out.println("from doPayments in payment--------------\n");
        ForexResponse fxRes = fxClient.getForexRates(fxReq);
        System.out.println("From Payment");
        DoPaymentResponse res = new DoPaymentResponse();
        res.setStatus(true);
        res.setTxnRefNumber(UUID.randomUUID().toString());

        return new ResponseEntity<DoPaymentResponse>(res, HttpStatus.OK);

    }

    @PostMapping(value = "/doCredit", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DoCreditResponse> doCredit(@RequestBody DoCreditRequest req) {

        CreditRequest creditReq = new CreditRequest();
        creditReq.setAccNum(req.getSrcAccount());
        creditReq.setAmtToCredit(req.getAmount());
        creditReq.setReqId(UUID.randomUUID().toString());
        System.out.println("from doCredit in payment--------------\n");
        CreditResponse creditRes = creditClient.getCreditBalance(creditReq);
        System.out.println("From Payment=---------after");
        DoCreditResponse res = new DoCreditResponse();
        res.setStatus(true);
        res.setTxnRefNumber(UUID.randomUUID().toString());

        return new ResponseEntity<DoCreditResponse>(res, HttpStatus.OK);

    }
    @PostMapping(value = "/doDebit", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DoDebitResponse> doCredit(@RequestBody DoDebitRequest req) {

        DebitRequest debitReq = new DebitRequest();
        debitReq.setAccNum(req.getSrcAccount());
        debitReq.setAmtToDebit(req.getAmount());
        debitReq.setReqId(UUID.randomUUID().toString());
        System.out.println("from doCredit in payment--------------\n");
        DebitResponse debitRes = debitClient.getDebitBalance(debitReq);
        System.out.println("From Payment=---------after");
        DoDebitResponse res = new DoDebitResponse();
        res.setStatus(true);
        res.setTxnRefNumber(UUID.randomUUID().toString());

        return new ResponseEntity<DoDebitResponse>(res, HttpStatus.OK);

    }
}
