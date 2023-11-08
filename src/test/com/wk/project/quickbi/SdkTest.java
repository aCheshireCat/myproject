package com.wk.project.quickbi;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.quickbi.openapi.core.exception.SDKException;
import com.wk.project.quickbi.constants.ApiEnum;
import com.wk.project.quickbi.constants.TreeTypeEnum;
import com.wk.project.quickbi.model.entity.ProductWork;
import com.wk.project.quickbi.model.vo.QueryResponseResult;
import com.wk.project.quickbi.model.vo.UserInfo;
import com.wk.project.quickbi.util.SdkUtil;
import org.junit.Test;

import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.wk.project.quickbi.constants.TreeTypeEnum.PAGE;

/**
 * @Auther weikai2
 * @Date 2023/10/31
 * @Description
 **/
public class SdkTest {


    @Test
    public void testGet() throws SDKException {
        String uri = "/openapi/v2/organization/user";
        Map<String,String> paramMap = new HashMap<String,String>(){{
                put("pageNum", "1");
                put("pageSize", "10");
        }};
        String result = SdkUtil.get(uri,paramMap);
        System.out.println(result);
    }

    @Test
    public void testQueryUsers() throws Exception{
        String workSpaceId = "c43d1ed7-a0cb-43d9-8dfe-ee6dea8debf2";
        String uri = ApiEnum.QueryWorkspaceUserList.getUrl().replace("*",workSpaceId);
        String result = SdkUtil.get(uri,null);
        QueryResponseResult queryResult = JSONObject.parseObject(result,QueryResponseResult.class);
//        JSONObject object = JSONObject.parseObject(queryResult.getData());

        List<UserInfo> userInfoList = JSONObject.parseArray(queryResult.getData(),UserInfo.class);
        System.out.println(userInfoList);
    }

    @Test
    public void testQueryWorks() throws Exception{
        String userId = "fec0741443204104b1905061e6a951a2";
        String uri = ApiEnum.QueryReadableResourcesListByUserId.getUrl().replace("*",userId);
        String result = SdkUtil.get(uri,null);
        System.out.println(result);
        List<ProductWork> list = JSONObject.parseArray(result, ProductWork.class);
        System.out.println(list);
    }
    @Test
    public void testPost() throws SDKException {
//        String uri = "/openapi/v2/embed/ticket/create";
        String uri = ApiEnum.CreateTicket.getUrl();
        String param = "[{\"conditionList\":[{\"operate\":\"like\",\"value\":\"case\"}],\"joinType\":\"and\",\"paramKey\":\"dictCode\"},{\"conditionList\":[{\"operate\":\"like\",\"value\":\"经典\"}],\"joinType\":\"and\",\"paramKey\":\"dictName\"}]";
        String workId = "86fa1681-8c97-4d39-8683-3f2aaecc9480";
        Map<String,String> paramMap = new HashMap<String,String>(){{
            put("worksId",workId);
            put("ticketNum", "2");
            put("globalParam", URLEncoder.encode(param));
        }};
        String ticket = SdkUtil.post(uri,paramMap);
        System.out.println(ticket);
        String url = constructUrl(workId, PAGE,ticket);
        System.out.println(url);
    }

    private String constructUrl(String workId, TreeTypeEnum treeTypeEnum, String ticket){
        String host = "http://quickbi.longi.com";
        switch (treeTypeEnum.name()){
            case "PAGE":
                return host+ treeTypeEnum.getUrl() + "?pageId=" + workId + "&accessTicket=" + ticket;
            case "REPORT":
                return host+ treeTypeEnum.getUrl() + "?id=" + workId + "&accessTicket=" + ticket;
            default:
                return "";
        }

    }

}
