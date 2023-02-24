package com.wk.project.framework.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Auther weikai2
 * @Date 2022/8/29
 * @Description
 **/

@Getter
@ResponseStatus(code= HttpStatus.INTERNAL_SERVER_ERROR,reason = "业务异常")
public class BusinessException extends RuntimeException {

    private String code;


    public BusinessException(String code,String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(String message,Throwable cause) {
        super(message,cause);
    }

    public BusinessException(String code,String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }


    public Map<String, Object> toMap() {
        HashMap<String, Object> map = new LinkedHashMap();
        map.put("code", this.code);
        map.put("message", super.getMessage());
        return map;
    }

}
