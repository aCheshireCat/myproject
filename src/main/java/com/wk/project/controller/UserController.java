package com.wk.project.controller;

import com.wk.project.framework.entity.ApiResponse;
import com.wk.project.framework.exception.BusinessException;
import com.wk.project.vo.UserLoginRequestVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

/**
 * @Auther weikai2
 * @Date 2022/8/29
 * @Description
 **/
@Api(description = "用户管理控制器")
@RestController
@RequestMapping("/auth-user")
public class UserController {


    @PostMapping("/loginIn")
    @ApiOperation("逃生登录")
    public ApiResponse loginIn(@RequestBody UserLoginRequestVo userLoginRequestVo) throws BusinessException {
        String code = userLoginRequestVo.getCode();
        String password = userLoginRequestVo.getPassword();
        System.out.println("code:" + code );
        System.out.println("password:" + password );
        return ApiResponse.createBySuccess();
    }




}
