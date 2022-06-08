package com.banking.transfer.debit.dto;

import java.math.BigDecimal;

public class DebitRequest extends BaseModel{
    private String accNum;
    private BigDecimal amtToDebit;    
    private String reqId;

    public BigDecimal getAmtToDebit() {
        return amtToDebit;
    }

    public void setAmtToDebit(BigDecimal amtToDebit) {
        this.amtToDebit = amtToDebit;
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
