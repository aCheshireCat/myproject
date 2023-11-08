package com.wk.project.quickbi.constants;

import com.alibaba.quickbi.openapi.client.HttpMethod;
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


    QueryOrganizationWorkspaceList("/openapi/v2/workspace",HttpMethod.GET),
    QueryWorkspaceUserList("/openapi/v2/workspace/*/user",HttpMethod.GET),
    QueryReadableResourcesListByUserId("/openapi/v2/works/readable/user/*/list",HttpMethod.GET),
    CreateTicket("/openapi/v2/embed/ticket/create",HttpMethod.POST);


    private String url;
    private HttpMethod method;

}
