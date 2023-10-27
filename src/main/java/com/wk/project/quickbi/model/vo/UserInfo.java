package com.wk.project.quickbi.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther weikai2
 * @Date 2023/10/23
 * @Description
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserInfo {

    private String accountId;
    private Integer userType;
    private String accountName;
    private String nickName;
    private String email;
    private String phone;
    private String admin;
    private String userId;

}
