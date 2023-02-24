package com.wk.project.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public enum Shape {

    NORMAL,
    LARGE,
    SMALL;

    private int type;
    private String description;


}
