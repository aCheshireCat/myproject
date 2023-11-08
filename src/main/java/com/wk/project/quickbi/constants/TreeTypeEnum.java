package com.wk.project.quickbi.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum TreeTypeEnum {

    DATAPRODUCT("数据门户",""),
    PAGE("仪表板","/token3rd/dashboard/view/pc.htm"),
    FULLPAGE("全屏仪表板[备注]",""),
    REPORT("电子表格","/token3rd/report/view.htm"),
    dashboardOfflineQuery("自助取数","");

    private String name;
    private String url;
}
