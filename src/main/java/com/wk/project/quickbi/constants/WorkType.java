package com.wk.project.quickbi.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum WorkType {

    DATAPRODUCT("数据门户"),
    PAGE("仪表板"),
    FULLPAGE("全屏仪表板[备注]"),
    REPORT("电子表格"),
    dashboardOfflineQuery("自助取数");

    private String name;
}
