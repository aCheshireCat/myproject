package com.wk.project.quickbi.model.entity;

import com.wk.project.quickbi.constants.TreeTypeEnum;
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
public class ProductWork {

    private String worksId;
    private TreeTypeEnum treeTypeEnum;
    private String workName;
    private String workspaceId;
    private String workspaceName;
    private String securityLevel;
    private int auth3rdFlag;
    private String description;
    private String ownerId;
    private String ownerName;
    private String modifyName;
    private long gmtCreate;
    private long gmtModify;
    private int status;
    private ProductWorkDirectory directory;






}
