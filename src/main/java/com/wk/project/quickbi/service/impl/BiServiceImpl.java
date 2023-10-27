package com.wk.project.quickbi.service.impl;

import com.wk.project.quickbi.constants.SystemEnum;
import com.wk.project.quickbi.model.entity.ProductWork;
import com.wk.project.quickbi.model.vo.TicketParam;
import com.wk.project.quickbi.model.vo.UserInfo;
import com.wk.project.quickbi.service.BiService;
import com.wk.project.quickbi.service.TicketService;
import com.wk.project.quickbi.service.UserService;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther weikai2
 * @Date 2023/10/16
 * @Description
 **/
public class BiServiceImpl implements BiService {


    @Override
    public String getProductUrl(SystemEnum system) {

        //获取系统所在用户
        UserService userService = new UserServiceImpl();
        UserInfo userInfo = userService.getUserBySystem(system);

        //获取用户对应作品列表
        List<ProductWork> productWorkList  = userService.getProductByUser(userInfo);
        //获取作品id
        String workId = CollectionUtils.isNotEmpty(productWorkList)?productWorkList.stream().map(ProductWork::getWorksId).collect(Collectors.toList()).stream().findFirst().get():"";

        //获取ticket
        TicketService ticketService = new TicketServiceImpl();
        String ticket = ticketService.create(new TicketParam(){{
            setWorksId(workId);
            setExpireTime(10);
            setUserId(userInfo.getUserId());
        }});
        //组装url
        String url = constructUrl(ticket);

        return url;
    }

    private String constructUrl(String ticket) {
        return null;
    }


    public static void main(String[] args) {

        BiService service = new BiServiceImpl();

        String sign = service.getProductUrl(SystemEnum.HR);


    }
}
