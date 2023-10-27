package com.wk.project.quickbi.service;

import com.wk.project.quickbi.constants.SystemEnum;
import com.wk.project.quickbi.model.entity.ProductWork;
import com.wk.project.quickbi.model.vo.UserInfo;

import java.util.List;

public interface UserService {
    UserInfo getUserBySystem(SystemEnum system);

    List<ProductWork> getProductByUser(UserInfo userInfo);
}
