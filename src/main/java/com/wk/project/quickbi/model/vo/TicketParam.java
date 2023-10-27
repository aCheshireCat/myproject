package com.wk.project.quickbi.model.vo;

import com.sun.istack.internal.NotNull;
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
public class TicketParam {

    @NotNull
    private String worksId;

    private String cmptId;
    private Integer ticketNum = 1;
    private String userId;
    private String accountName;
    private Integer accountType;
    private Integer expireTime;
    private String watermarkParam;
    private String globalParam;


}
