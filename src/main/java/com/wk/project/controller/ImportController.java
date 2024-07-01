package com.wk.project.controller;

import com.wk.project.framework.entity.ApiResponse;
import com.wk.project.framework.exception.BusinessException;
import com.wk.project.service.ImporterService;
import com.wk.project.vo.UserLoginRequestVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Auther weikai2
 * @Date 2022/8/29
 * @Description
 **/
@Api(description = "用户管理控制器")
@RestController
@RequestMapping("/import")
public class ImportController {


    @Autowired
    private ImporterService importerService;

    @PostMapping("/importMultipleData")
    public String importMultipleData(@RequestParam("file") MultipartFile file) {
        importerService.importMultipleData(file);
        return  new String( "ok");
    }




}
