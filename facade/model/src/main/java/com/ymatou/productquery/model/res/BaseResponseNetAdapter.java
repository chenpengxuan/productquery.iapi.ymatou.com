package com.ymatou.productquery.model.res;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by zhangyong on 2017/4/10.
 */
public class BaseResponseNetAdapter<T> {
    /**
     * 系统状态码 成功为200 失败为500
     */
    @JsonProperty("Code")
    private int code;

    /**
     * 业务状态码
     */
    @JsonProperty("BCode")
    private int bCode;

    /**
     * 返回消息
     */
    @JsonProperty("Msg")
    private String msg;

    /**
     * 数据
     */
    @JsonProperty("Data")
    private T Data;

    @JsonIgnore
    public int getCode() {
        return code;
    }

    @JsonIgnore
    public void setCode(int code) {
        this.code = code;
    }

    @JsonIgnore
    public int getBCode() {
        return bCode;
    }

    @JsonIgnore
    public void setBCode(int bCode) {
        this.bCode = bCode;
    }

    @JsonIgnore
    public String getMsg() {
        return msg;
    }

    @JsonIgnore
    public void setMsg(String msg) {
        this.msg = msg;
    }

    @JsonIgnore
    public T getData() {
        return Data;
    }

    @JsonIgnore
    public void setData(T data) {
        Data = data;
    }

    /**
     * 创建系统异常resp
     *
     * @return
     */
    public static BaseResponseNetAdapter newSystemFailureInstance(String errorMsg, Throwable throwable) {
        BaseResponseNetAdapter baseResponseNetAdapter = new BaseResponseNetAdapter();
        baseResponseNetAdapter.setBCode(-1);
        baseResponseNetAdapter.setCode(500);
        baseResponseNetAdapter.setMsg("系统出现异常" + errorMsg + throwable);
        baseResponseNetAdapter.setData(null);
        return baseResponseNetAdapter;
    }

    /**
     * 创建业务异常resp
     *
     * @return
     */
    public static BaseResponseNetAdapter newBusinessFailureInstance(String errorMsg) {
        BaseResponseNetAdapter baseResponseNetAdapter = new BaseResponseNetAdapter();
        baseResponseNetAdapter.setBCode(-2);
        baseResponseNetAdapter.setCode(201);
        baseResponseNetAdapter.setMsg(errorMsg);
        baseResponseNetAdapter.setData(null);
        return baseResponseNetAdapter;
    }

    public static <T> BaseResponseNetAdapter newSuccessInstance(T data) {
        BaseResponseNetAdapter baseResponseNetAdapter = new BaseResponseNetAdapter();
        baseResponseNetAdapter.setBCode(200);
        baseResponseNetAdapter.setCode(200);
        baseResponseNetAdapter.setMsg("");
        baseResponseNetAdapter.setData(data);
        return baseResponseNetAdapter;
    }
}
