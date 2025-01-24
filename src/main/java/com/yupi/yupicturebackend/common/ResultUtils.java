package com.yupi.yupicturebackend.common;

import com.yupi.yupicturebackend.exception.ErrorCode;
import io.swagger.models.Response;

public class ResultUtils {
    /**
     * 成功
     * @param data
     * @return
     * @param <T>
     */
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0,data,"ok");
    }

    /**
     * 失败
     * @param errorCode
     * @return
     */
    public static  BaseResponse<?> error(ErrorCode errorCode){
        return new BaseResponse<>(errorCode);
    }
    /**
     * 失败
     * @param code
     * @param message
     * @return
     */
    public static BaseResponse<?> error(int code,String message){
        return new BaseResponse<>(code,null,message);
    }
    public static BaseResponse<?> error(ErrorCode errorCode,String message){
        return new BaseResponse<>(errorCode.getCode(),null,message);
    }
}
