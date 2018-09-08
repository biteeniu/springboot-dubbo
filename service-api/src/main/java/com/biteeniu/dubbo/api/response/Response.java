package com.biteeniu.dubbo.api.response;

/**
 * @author BiteeNiu
 * @date 2018/9/8 11:05
 */
public class Response {

    private String statusCode;
    private String statusMessage;

    public Response(ResponseEnum responseEnum) {
        setStatusCode(responseEnum.getStatusCode());
        setStatusMessage(responseEnum.getStatusMessage());
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }
}
