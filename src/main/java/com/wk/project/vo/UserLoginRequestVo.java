package com.wk.project.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.io.Serializable;

/**
 * @Auther weikai2
 * @Date 2022/8/29
 * @Description
 **/
@Data
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UserLoginRequestVo implements Serializable {

    @ApiModelProperty("员工编号")
    private String code;

    @ApiModelProperty("密码")
    private String password;
}
