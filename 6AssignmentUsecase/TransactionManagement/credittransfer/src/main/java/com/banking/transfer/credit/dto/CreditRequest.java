package com.banking.transfer.credit.dto;

import java.math.BigDecimal;

public class CreditRequest extends BaseModel{
    private String accNum;
    private BigDecimal amtToCredit;    
    private String reqId;

    public BigDecimal getAmtToCredit() {
        return amtToCredit;
    }

    public void setAmtToCredit(BigDecimal amtToCredit) {
        this.amtToCredit = amtToCredit;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }
   
}
