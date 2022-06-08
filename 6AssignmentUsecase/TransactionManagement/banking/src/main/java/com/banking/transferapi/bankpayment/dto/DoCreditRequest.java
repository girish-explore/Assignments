package com.banking.transferapi.bankpayment.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class DoCreditRequest extends BaseModel {
    private String reqIdentifier;
    private String srcAccount;
    //private String destAccount;
    private int amount;
    //private String ccy;
    @JsonFormat(pattern="yyyy-mm-dd")
    private Date ts;//time stamp
    public Date getTs() {
        return ts;
    }
    public void setTs(Date ts) {
        this.ts = ts;
    }
    public String getReqIdentifier() {
        return reqIdentifier;
    }
    public void setReqIdentifier(String reqIdentifier) {
        this.reqIdentifier = reqIdentifier;
    }
    public String getSrcAccount() {
        return srcAccount;
    }
    public void setSrcAccount(String srcAccount) {
        this.srcAccount = srcAccount;
    }

    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

}
