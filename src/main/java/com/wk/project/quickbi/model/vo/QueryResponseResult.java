package com.wk.project.quickbi.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther weikai2
 * @Date 2023/10/23
 * @Description
 **/
@NoArgsConstructor
@AllArgsConstructor
@Data
public class QueryResponseResult {

    private String data;
    private int totalNum;
    private int totalPages;
    private int start;
    private int pageSize;
    private int pageNum;
}
