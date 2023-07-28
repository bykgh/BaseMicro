package com.yk.model.bean;

import com.yk.model.enums.ResponseCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author yikai.bi on 2020/5/8
 */

@Data
@ApiModel("响应信息")
public class ResponseBean<T> implements Serializable {

    private static final long serialVersionUID = -508570775928959270L;
    @ApiModelProperty(value = "响应编码")
    private String code;
    @ApiModelProperty(value = "中文描述")
    private String msg;
    @ApiModelProperty(value = "英文描述")
    private String enMsg;
    @ApiModelProperty(value = "响应数据")
    private T data;

    public ResponseBean(){}

    public ResponseBean(ResponseCodeEnum codeEnum, T data) {
        this.code = codeEnum.getCode();
        this.msg = codeEnum.getMessage();
        this.enMsg = codeEnum.getEnMsg();
        this.data = data;
    } 
    public ResponseBean(ResponseCodeEnum codeEnum,String msg,String enMsg, T data) {
        this.code = codeEnum.getCode();
        this.msg = msg;
        this.enMsg = enMsg;
        this.data = data;
    } 
    public ResponseBean(String code,String msg,String enMsg, T data) {
        this.code = code;
        this.msg = msg;
        this.enMsg = enMsg;
        this.data = data;
    }

    public static <T> ResponseBean<T> SUCCESS_DATA(T data) {
        return new ResponseBean<T>(ResponseCodeEnum.SUCCESS_CODE, data);
    }
}
