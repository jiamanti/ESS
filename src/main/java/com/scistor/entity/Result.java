package com.scistor.entity;

/**
 * 功能描述:返回结果集
 * @program: springcloud-client
 * @description: $
 * @auther: LiJihan
 * @date: 2019-04-28 18:27
 * @version: v1.0
 */
public class Result {
    private String msg;
    private int code;
    private Object data;

    public Result(String msg, int code, Object data) {
        this.msg = msg;
        this.code = code;
        this.data = data;
    }

    public Result(String msg, int code) {
        this.msg = msg;
        this.code = code;
    }


    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
