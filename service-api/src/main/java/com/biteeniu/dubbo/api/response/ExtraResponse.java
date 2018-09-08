package com.biteeniu.dubbo.api.response;

/**
 * 可以携带额外响应数据的响应实体类
 * @author BiteeNiu
 * @date 2018/9/8 11:11
 */
public class ExtraResponse extends Response {

    private Object data;

    public ExtraResponse(ResponseEnum responseEnum, Object data) {
        super(responseEnum);
        setData(data);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
