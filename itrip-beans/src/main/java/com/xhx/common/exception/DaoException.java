package com.xhx.common.exception;

import com.xhx.common.constants.ErrorCodeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 类名称: DaoException
 * 类描述: Dao层异常
 * 创建人: 谢洪喜
 * 创建时间 2020/11/9 0009 11:09
 *
 * @Version 1.0
 */
@Data
@ApiModel(value = "自定义Dao异常")
public class DaoException  extends  RuntimeException{
@ApiModelProperty(value ="异常状态码" )
    private  String errorCode;

public  DaoException(String message,String  errorCode){
    super(message);
    this.errorCode=errorCode;
}
public  DaoException(ErrorCodeEnum errorCodeEnum){
    super(errorCodeEnum.getMsg());
    this.errorCode=errorCodeEnum.getErrorCode();
}
}
