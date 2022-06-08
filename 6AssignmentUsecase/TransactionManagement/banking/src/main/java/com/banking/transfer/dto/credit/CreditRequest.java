package com.banking.transfer.dto.credit;

import com.banking.transfer.dto.BaseModel;

public class CreditRequest extends BaseModel{
    private String accNum;
    private float amtToCredit;    
    private String reqId;

    public float getAmtToCredit() {
        return amtToCredit;
    }

    public void setAmtToCredit(float amtToCredit) {
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
