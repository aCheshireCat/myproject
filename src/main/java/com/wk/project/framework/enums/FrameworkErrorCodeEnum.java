package com.wk.project.framework.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum FrameworkErrorCodeEnum {



    FRAMEWORK_SUCCESS("操作成功"),

    FRAMEWORK_SYSTEM_ERROR("系统错误，请联系运维管理员"),

    FRAMEWORK_VALIDATE_ERROR("校验失败"),

    FRAMEWORK_REQUEST_NOT_VALID("请求不合法");


    private String display;
}
