package com.xhx.common.handler;

import com.xhx.common.constants.ErrorCodeEnum;
import com.xhx.common.exception.DaoException;
import com.xhx.common.exception.ServiceException;
import com.xhx.common.exception.SysException;
import com.xhx.common.vo.ReturnResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 类名称: GlobalExceptionHandler
 * 类描述: 统一异常处理器
 * 创建人: 谢洪喜
 * 创建时间 2020/11/9 0009 10:36
 *
 * @Version 1.0
 */
@RestControllerAdvice  //开启全局异常处理
public class GlobalExceptionHandler {
    private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 捕获异常
     * @param e  异常类型为 Exception
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    public ReturnResult error(Exception e){
     LOGGER.error(e.getMessage(),e);
     return  ReturnResult.error(ErrorCodeEnum.SYSTEM_EXECUTION_ERROR);
    }

    /**
     * 捕获异常
     * @param e    捕获类型 service异常
     * @return
     */
    @ExceptionHandler(value = ServiceException.class)
   public  ReturnResult error(ServiceException e){
        LOGGER.error(e.getMessage(), e);
        return  ReturnResult.error(e.getErrorCode(),e.getMessage());
    }

    /**
     * 捕获异常
     * @param e  捕获类型   dao异常
     * @return
     */
    @ExceptionHandler(value = DaoException.class)
    public  ReturnResult error(DaoException e){
    LOGGER.error(e.getMessage(), e);
    return  ReturnResult.error(e.getErrorCode(),e.getMessage());
}

    /**
     * 捕获异常
     * @param e  捕获类型   系统异常
     * @return
     */
    @ExceptionHandler(value = SysException.class)
   public  ReturnResult error(SysException e){
    LOGGER.error(e.getMessage(), e);
    return  ReturnResult.error(e.getErrorCode(),e.getMessage());
}
}
