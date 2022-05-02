package com.company.payment.paymentapi.uimode;

import java.util.Calendar;

public class ErrorDetails extends BaseModel {

    private String errorMessage, errCode;
    private Calendar ts;
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    
    public String getErrCode() {
        return errCode;
    }
    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }
    public Calendar getTs() {
        return ts;
    }
    public void setTs(Calendar ts) {
        this.ts = ts;
    }
    
    
}
