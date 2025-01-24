package com.yupi.yupicturebackend.exception;

import com.yupi.yupicturebackend.common.BaseResponse;
import com.yupi.yupicturebackend.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@Slf4j
@RestControllerAdvice
public class GlobalHanderException {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> businessExceptionHander(BusinessException e){
      log.error("BusinessException: " + e) ;
      return ResultUtils.error(e.getCode(),e.getMessage());
    }
    @ExceptionHandler(RuntimeException.class)
    public BaseResponse<?> runtimeExceptionHander(RuntimeException e){
        log.error("RutimeException: " + e) ;
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR,"系统错误");
    }


}
