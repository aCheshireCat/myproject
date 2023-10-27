package com.wk.project.quickbi.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Auther weikai2
 * @Date 2023/10/17
 * @Description
 **/
@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ApiEnum {


    QueryOrganizationWorkspaceList("/openapi/v2/workspace"),
    QueryWorkspaceUserList("/openapi/v2/workspace/*/user"),
    QueryReadableResourcesListByUserId("/openapi/v2/works/readable/user/*/list");

    private String url;

}
