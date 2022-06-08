package com.company.payment.dto.forex;

import com.company.payment.dto.BaseModel;

public class ForexResponse extends BaseModel{
    private String reqId;
    private float rate;
    public String getReqId() {
        return reqId;
    }
    public void setReqId(String reqId) {
        this.reqId = reqId;
    }
    public float getRate() {
        return rate;
    }
    public void setRate(float rate) {
        this.rate = rate;
    }
    @Override
    public String toString() {
        return "ForexResponse [rate=" + rate + ", reqId=" + reqId + "]";
    }
    
}
