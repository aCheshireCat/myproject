package com.wk.project.framework.entity;

import com.wk.project.framework.enums.FrameworkErrorCodeEnum;
import com.wk.project.framework.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;

/**
 * @description 通用页面响应VO
 * @date 2021/6/11 16:01
 */
@Slf4j
public class ApiResponse<T> implements Serializable {

    private Boolean success;
    private String errorCode;
    private String msg;
    private String displayMessage;
    private T data;

    public ApiResponse() {
    }

    public ApiResponse(String errorCode, Boolean success, String msg) {
        this.errorCode = errorCode;
        this.success = success;
        this.msg = msg;
    }

    public ApiResponse(String errorCode, Boolean success, String msg, String displayMessage) {
        this.errorCode = errorCode;
        this.success = success;
        this.msg = msg;
        this.displayMessage = displayMessage;
    }

    public ApiResponse(String errorCode, Boolean success, String msg, T data) {
        this.errorCode = errorCode;
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    /**
     * @param <T> 类型
     * @return ServerResponse
     */
    public static <T> ApiResponse<T> createBySuccess() {
        return new ApiResponse<>(FrameworkErrorCodeEnum.FRAMEWORK_SUCCESS.name(), true,
                FrameworkErrorCodeEnum.FRAMEWORK_SUCCESS.getDisplay());
    }

    /**
     * @param data 信息
     * @param <T> 类型
     * @return ServerResponse
     */
    public static <T> ApiResponse<T> createBySuccess(T data) {
        return new ApiResponse<>(FrameworkErrorCodeEnum.FRAMEWORK_SUCCESS.name(), true,
                FrameworkErrorCodeEnum.FRAMEWORK_SUCCESS.getDisplay(), data);
    }

    /**
     * @param resultCode 信息
     * @param <T> 类型
     * @return ServerResponse
     */
    public static <T> ApiResponse<T> createBySuccessCode(String resultCode,String resultMessage) {
        return new ApiResponse<>(resultCode, true, resultMessage);
    }

    /**
     * @param data 信息
     * @param <T> 类型
     * @return ServerResponse
     */
    public static <T> ApiResponse<T> createBySuccessCode(T data,String resultCode,String resultMessage) {
        return new ApiResponse<>(resultCode, true, resultMessage, data);
    }

    /**
     * @param <T> 类型
     * @return ServerResponse
     */
    public static <T> ApiResponse<T> createByError() {
        return new ApiResponse<>(FrameworkErrorCodeEnum.FRAMEWORK_SYSTEM_ERROR.name(), false,
                FrameworkErrorCodeEnum.FRAMEWORK_SYSTEM_ERROR.getDisplay(), null);
    }

    /**
     * @param <T> 类型
     * @return ServerResponse
     */
    public static <T> ApiResponse<T> createByErrorCode(String resultCode,String resultMessage) {
        return new ApiResponse<>(resultCode, false, resultMessage);
    }

    /**
     * @param <T> 类型
     * @return ServerResponse
     */
    public static <T> ApiResponse<T> createByErrorCode(BusinessException businessException) {
        if (StringUtils.isNotEmpty(businessException.getMessage())) {
            return new ApiResponse<>(businessException.getMessage(), false,
                    businessException.getMessage(), businessException.getMessage());
        } else {
            return new ApiResponse<>(businessException.getMessage(), false,
                    businessException.getMessage());
        }
    }

    public Boolean getSuccess() {
        return success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public T getData() {
        return data;
    }

    public String getMsg() {
        // 优先展示传过来的消息
        if (StringUtils.isNotEmpty(this.displayMessage)) {
            return this.displayMessage;
        }
        // 如果是校验，则不走该处国际化转换
        if (StringUtils.isNotEmpty(this.errorCode)
                && !FrameworkErrorCodeEnum.FRAMEWORK_VALIDATE_ERROR.name().equals(this.errorCode)) {
            String message = this.errorCode;
            if (StringUtils.isNotEmpty(message)) {
                return message;
            }
        }
        return this.msg;
    }
}

