package com.company.payment.dto.debit;


import com.company.payment.dto.BaseModel;

public class DebitResponse extends BaseModel{
    private String reqId;
    private float balanceAmt;
    public String getReqId() {
        return reqId;
    }
    public void setReqId(String reqId) {
        this.reqId = reqId;
    }
    public float getBalanceAmt() {
        return balanceAmt;
    }
    public void setBalanceAmt(float balanceAmt) {
        this.balanceAmt = balanceAmt;
    }
    
}
