package com.inventrax.karthikm.merlinwmscipher_vip_rdc.model;


public class MenuModel {

    public String menuName,menuItemName;
    public boolean hasChildren, isGroup;

    public MenuModel(String menuName, boolean isGroup, boolean hasChildren, String menuItemName) {

        this.menuName = menuName;
        this.isGroup = isGroup;
        this.hasChildren = hasChildren;
        this.menuItemName = menuItemName;
    }

    public String getMenuItemName() {
        return menuItemName;
    }

    public void setMenuItemName(String menuItemName) {
        this.menuItemName = menuItemName;
    }
}
