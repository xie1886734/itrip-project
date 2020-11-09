package com.xhx.common.constants;

/**
 * 错误码枚举
 */
public enum ErrorCodeEnum {
    OK("00000","成功"),
    SYSTEM_EXECUTION_ERROR("B0001","系统执行出错"),
    SYSTEM_EXECUTION_TIMEOUT("B0100","系统响应超时"),
    SYSTEM_EXCEPTION_PROCESSING_TIMEOUT("B0101","系统订单处理超时");

    /**
     * 异常状态码
     */
    private  String errorCode;
    /**
     * 返回消息
     */
    private  String  msg;

    ErrorCodeEnum(String errorCode, String msg) {
        this.errorCode = errorCode;
        this.msg = msg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getMsg() {
        return msg;
    }
}
