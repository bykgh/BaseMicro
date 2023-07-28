package com.yk.model.enums;

/**
 * @Desciption:响应码配置
 * @Author: Erting.Wang
 * @Date: 2020/7/16 11:26 上午
 */
public enum ResponseCodeEnum {
    // 系统通用
    SUCCESS_CODE("200", "操作成功", "operation successfully"),
    SUCCESS_CODE_1("200", "查询成功", "query was successful"),
    SUCCESS_CODE_2("200", "没有符合条件的数据", "No eligible data"),
    SUCCESS_CODE_3("200", "审核成功", "verification successfully"),
    SUCCESS_CODE_4("200", "短信发送成功！", "SMS sent successfully!"),
    SUCCESS_CODE_5("200", "验证成功", "Successful authentication"),
    PARTIAL_SUCCESS("206", "部分成功", "Partial success"),
    NO_DATA_CODE("201", "数据不存在！", "Data not exist"),
    NO_DATA_CODE_1("201", "用户不存在", "User does not exist"),
    NO_DATA_CODE_2("1001", "验证码错误！", "Verification code error!"),
    NO_DATA_CODE_3("10002", "验证码错误！", "Verification code error!"),
    NO_DATA_CODE_4("10003", "短信发送失败！", "message failed to send!"),
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
