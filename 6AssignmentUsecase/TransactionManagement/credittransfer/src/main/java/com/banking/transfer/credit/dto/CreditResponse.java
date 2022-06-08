package com.banking.transfer.credit.dto;



public class CreditResponse extends BaseModel{
    private String reqId;
    private float balanceAmt;
    public String getReqId() {
        return reqId;
    }
    public float getBalanceAmt() {
        return balanceAmt;
    }
    public void setBalanceAmt(float balanceAmt) {
        this.balanceAmt = balanceAmt;
    }
    public void setReqId(String reqId) {
        this.reqId = reqId;
    }
    @Override
    public String toString() {
        return "CreditResponse [balanceAmt=" + balanceAmt + ", reqId=" + reqId + "]";
    }
    
    
    
}
