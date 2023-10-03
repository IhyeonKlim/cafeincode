package kr.cafeincode.domain.admin;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Menu {
    private String menuId;
    private String hierarchyMenu;
    private String hierarchyMenuId;
    private String upperMenuId;
    private String menuKey;
    private String menuNm;
    private String menuUrl;
    private String menuType;
    private String activeYn;

}
