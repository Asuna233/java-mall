package com.atguigu.spzx.manager.utils;

import com.atguigu.spzx.model.entity.system.SysMenu;

import java.util.ArrayList;
import java.util.List;

public class MenuHelper {

    public static List<SysMenu> buildTree (List<SysMenu> sysMenuList) {
        List<SysMenu> trees = new ArrayList<>();
        for (SysMenu sysMenu : sysMenuList) {
            if (sysMenu.getParentId().longValue() == 0) {
                trees.add(findChildren(sysMenu, sysMenuList));
            }
        }

        return trees;
    }

    public static SysMenu findChildren(SysMenu sysMenu, List<SysMenu> sysMenuList) {
        sysMenu.setChildren(new ArrayList<>());

        for (SysMenu it : sysMenuList) {
            if (sysMenu.getId().longValue() == it.getParentId().longValue()) {
                sysMenu.getChildren().add(findChildren(it, sysMenuList));
            }
        }
        return sysMenu;
    }

}
