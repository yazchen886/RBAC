package com.example.rbac.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private Integer menuId;
    private String menuName;
    private String menuUrl;
    private String parentId;
    private String menuDesc;
}
