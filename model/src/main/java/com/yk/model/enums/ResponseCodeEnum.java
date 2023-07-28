package com.yk.model.enums;

public enum ResponseCodeEnum {
    // 系统通用
    SUCCESS_CODE("200", "操作成功", "operation successfully"),
    SYSTEM_ERROR("999", "操作失败，请稍后重试", "Operation failed, please try again later");

    private String code;
    private String message;
    private String enMsg;

    ResponseCodeEnum(String code, String message, String enMsg) {
        this.code = code;
        this.message = message;
        this.enMsg = enMsg;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEnMsg() {
        return enMsg;
    }

    public void setEnMsg(String enMsg) {
        this.enMsg = enMsg;
    }
}
