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
public class ApiResponseBody {

    private String traceId;
    private String code;
    private String message;
    private String data;
    private boolean success;
}
