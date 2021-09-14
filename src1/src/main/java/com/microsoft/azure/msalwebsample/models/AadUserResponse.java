package com.microsoft.azure.msalwebsample.models;

public class AadUserResponse {
    private long responseCode;

    private ResponseMsg responseMsg;

    public long getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(long value) {
        this.responseCode = value;
    }

    public ResponseMsg getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(ResponseMsg value) {
        this.responseMsg = value;
    }
}
