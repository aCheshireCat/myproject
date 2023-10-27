package com.wk.project.quickbi.constants;

import lombok.*;

/**
 * @Auther weikai2
 * @Date 2023/10/17
 * @Description
 **/


@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum SystemEnum {

    HR("人力","人力资源系统"),
    OMS("订单","供应链订单系统"),
    TMS("物流","供应链物流系统");

    private String name;
    private String description;



}
