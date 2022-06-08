package com.banking.transfer.dto.debit;

import com.banking.transfer.dto.BaseModel;

public class DebitRequest extends BaseModel{
    private String accNum;
    private float amtToDebit;    
    private String reqId;
    public String getAccNum() {
        return accNum;
    }
    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }
    public float getAmtToDebit() {
        return amtToDebit;
    }
    public void setAmtToDebit(float amtToDebit) {
        this.amtToDebit = amtToDebit;
    }
    public String getReqId() {
        return reqId;
    }
    public void setReqId(String reqId) {
        this.reqId = reqId;
    }
}
