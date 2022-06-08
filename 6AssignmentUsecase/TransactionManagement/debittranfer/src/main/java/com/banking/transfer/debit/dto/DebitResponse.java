package com.banking.transfer.debit.dto;



public class DebitResponse extends BaseModel{
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
        return "DebitResponse [balanceAmt=" + balanceAmt + ", reqId=" + reqId + "]";
    }
    
    
    
}
