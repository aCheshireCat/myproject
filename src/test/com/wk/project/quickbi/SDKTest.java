package com.wk.project.quickbi;

import com.alibaba.quickbi.openapi.core.exception.SDKException;
import com.wk.project.quickbi.util.SDKUtil;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther weikai2
 * @Date 2023/10/31
 * @Description
 **/
public class SDKTest {


    @Test
    public void testGet() throws SDKException {
        String uri = "/openapi/v2/organization/user";
        Map<String,String> paramMap = new HashMap<String,String>(){{
                put("pageNum", "1");
                put("pageSize", "10");
        }};
        String result = SDKUtil.get(uri,paramMap);
        System.out.println(result);
    }

    @Test
    public void testPost() throws SDKException {
        String uri = "/openapi/v2/embed/ticket/create";
        Map<String,String> paramMap = new HashMap<String,String>(){{
            put("worksid", "86fa1681-8c97-4d39-8683-3f2aaecc9480");
            put("ticketNum", "2");
            put("globalParam","[{\"conditionList\":[{\"operate\":\"like\",\"value\":\"case\"}],\"joinType\":\"and\",\"paramKey\":\"dictCode\"},{\"conditionList\":[{\"operate\":\"like\",\"value\":\"经典\"}],\"joinType\":\"and\",\"paramKey\":\"dictName\"}]");
        }};
        String result = SDKUtil.post(uri,paramMap);
        System.out.println(result);
    }

}
