package com.wk.project.quickbi.model.vo;

import in.com.fasterxml.jackson.annotation.JsonFormat;
import in.com.fasterxml.jackson.databind.annotation.JsonDeserialize;
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
    private RoleInfo role;
    private String accountName;
    private String nickName;
    private int accountType;
    private String userId;

}
