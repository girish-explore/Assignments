package com.company.payment.dto.forex;

import com.company.payment.dto.BaseModel;

public class ForexRequest extends BaseModel{
    private String srcCCY;
    private String destCCY;
    private String reqId;
    public String getSrcCCY() {
        return srcCCY;
    }
    public void setSrcCCY(String srcCCY) {
        this.srcCCY = srcCCY;
    }
    public String getDestCCY() {
        return destCCY;
    }
    public void setDestCCY(String destCCY) {
        this.destCCY = destCCY;
    }
    public String getReqId() {
        return reqId;
    }
    public void setReqId(String reqId) {
        this.reqId = reqId;
    }
}
