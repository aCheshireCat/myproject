package com.wk.project.quickbi.model.entity;

import com.wk.project.quickbi.constants.WorkType;
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
public class ProductWorkDirectory {

    private String id;
    private String pathId;
    private String pathName;


}
