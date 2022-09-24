package com.example.shoppingmallrearend.configure;

import lombok.Data;

@Data
public class ResponseResult<T> {
    private T data;
    private String code;
    private String message;

    /**
     * 若没有数据返回，默认状态码为 200，提示信息为“操作成功！”
     */
    public ResponseResult() {
        this.code = "200";
        this.message = "操作成功！";
    }

    /**
     * 若没有数据返回，可以人为指定状态码和提示信息
     * @param code
     * @param msg
     */
    public ResponseResult(String code, String msg) {
        this.code = code;
        this.message = msg;
    }

    /**
     * 有数据返回时，状态码为 200，默认提示信息为“操作成功！”
     * @param data
     */
    public ResponseResult(T data) {
        this.data = data;
        this.code = "200";
        this.message = "操作成功！";
    }

    /**
     * 有数据返回，状态码为 200，人为指定提示信息
     * @param data
     * @param msg
     */
    public ResponseResult(T data, String msg) {
        this.data = data;
        this.code = "200";
        this.message = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
