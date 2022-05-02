package com.company.payment.paymentapi.service;

import com.company.payment.paymentapi.config.MyAppConfig;
import com.company.payment.paymentapi.config.MyDataConfig;
import com.company.payment.paymentapi.exception.CustomerInvalidException;
import com.company.payment.paymentapi.uimode.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PAymentServiceManagerImpl implements PaymentServiceManager {

    @Autowired
    private MyAppConfig myConfig;

    @Autowired
    private MyDataConfig myDConfig;
    
    @Override
    public Customer save(Customer cust) {
        cust.setName(cust.getName()+Math.random());
        return cust;
    }

    @Override
    public boolean validate(Customer cust) throws CustomerInvalidException {
        if(cust.getId()==99){
            throw new CustomerInvalidException("Invalid customer ID.");
        }

        if(cust.getId()==98){
            int a=100/0;
        }
        
        System.out.println(myConfig.getServerUrl());
        System.out.println(myConfig.getServerPassword());
        System.out.println(myDConfig.getServerVendor());
        return false;
    }

    
}
