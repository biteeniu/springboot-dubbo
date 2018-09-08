package com.biteeniu.dubbo.api.response;

/**
 * WEB请求调用的响应状态码定义
 * @author BiteeNiu
 * @date 2018/9/8 11:06
 */
public enum ResponseEnum {

    /** SUCCESS：请求处理成功 **/
    SUCCESS("10001", "请求处理成功"),
    /** PARAM_ERROR：请求参数错误 **/
    PARRAM_ERROR("20001", "请求参数错误");

    private String statusCode;
    private String statusMessage;

    ResponseEnum(String statusCode, String statusMessage) {
        setStatusCode(statusCode);
        setStatusMessage(statusMessage);
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
