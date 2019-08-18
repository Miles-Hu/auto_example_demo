package com.fengxiao.auto.example.response;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * 数据
 * @author qinyuhui
 * @date 2018.11.10
 */
public class ClientData<T> extends ClientStatus {

    private T data;

    public ClientData() {
        super();
    }

    public ClientData(String status, String message) {
        super(status, message);
    }

    public ClientData(String status, String message, T data) {
        super(status,message);
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public static <T> ClientData<T> ok(T t) {
        return new ClientData<>("1", "succeed",t);
    }

    /**
     * error ClientData.
     *
     * @return the ClientData
     */
    public static ClientData errorData(String message) {
        return new ClientData("0" ,message);
    }
}
