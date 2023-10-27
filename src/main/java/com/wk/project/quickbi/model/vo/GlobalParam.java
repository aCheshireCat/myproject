package com.wk.project.quickbi.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Auther weikai2
 * @Date 2023/10/23
 * @Description
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class GlobalParam {

    private String paramKey;
    private String joinType;
    private List<GlobalValueParam> conditionList;
}
