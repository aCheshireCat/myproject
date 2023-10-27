package com.wk.project.quickbi.service.impl;

import com.alibaba.fastjson.JSON;
import com.wk.project.quickbi.model.vo.GlobalParam;
import com.wk.project.quickbi.model.vo.GlobalValueParam;
import com.wk.project.quickbi.model.vo.TicketParam;
import com.wk.project.quickbi.service.TicketService;
import com.wk.project.quickbi.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther weikai2
 * @Date 2023/10/16
 * @Description
 **/
public class TicketServiceImpl implements TicketService {


    @Override
    public String create(TicketParam ticketParam) {


        return null;
    }


    private String constractParam(){
        List<GlobalParam> paramList = new ArrayList<GlobalParam>(){{
            add(new GlobalParam(){{
                setParamKey("dictCode");
                setJoinType("and");
                setConditionList(new ArrayList<GlobalValueParam>(){{
                    add(new GlobalValueParam(){{
                        setOperate("like");
                        setValue("case");
                    }});
                }});
            }});
            add(new GlobalParam(){{
                setParamKey("dictName");
                setJoinType("and");
                setConditionList(new ArrayList<GlobalValueParam>(){{
                    add(new GlobalValueParam(){{
                        setOperate("like");
                        setValue("经典");
                    }});
                }});
            }});
        }};
        String paramJson = JSON.toJSONString(paramList);

        return paramJson;
    }
}
