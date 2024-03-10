package com.atguigu.spzx.manager.service.impl;

import com.atguigu.spzx.common.exception.GuiguException;
import com.atguigu.spzx.manager.mapper.SysMenuMapper;
import com.atguigu.spzx.manager.mapper.SysRoleMenuMapper;
import com.atguigu.spzx.manager.service.SysMenuService;
import com.atguigu.spzx.manager.utils.MenuHelper;
import com.atguigu.spzx.model.entity.system.SysMenu;
import com.atguigu.spzx.model.entity.system.SysUser;
import com.atguigu.spzx.model.vo.common.ResultCodeEnum;
import com.atguigu.spzx.model.vo.system.SysMenuVo;
import com.atguigu.spzx.utils.AuthContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuMapper sysMenuMapper;
    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;
    @Override
    public List<SysMenu> findNodes() {
        List<SysMenu> sysMenuList = sysMenuMapper.findAll();
        if (CollectionUtils.isEmpty(sysMenuList)) {
            return null;
        }
        List<SysMenu> treeList = MenuHelper.buildTree(sysMenuList);
        return treeList;
    }

    @Override
    public void save(SysMenu sysMenu) {

        sysMenuMapper.save(sysMenu);
        updateSysRoleMenuIsHalf(sysMenu);
    }

    private void updateSysRoleMenuIsHalf(SysMenu sysMenu) {
        SysMenu parentMenu = sysMenuMapper.selectParentMenu(sysMenu.getParentId());
        if (parentMenu != null) {
            sysRoleMenuMapper.updateSysRoleMenuIsHalf(parentMenu.getId());
            updateSysRoleMenuIsHalf(parentMenu);
        }
    }

    @Override
    public void update(SysMenu sysMenu) {
        sysMenuMapper.update(sysMenu);
    }

    @Override
    public void removeById(Long id) {
        int count = sysMenuMapper.selectCountById(id);
        if (count > 0) {
            throw new GuiguException(ResultCodeEnum.NODE_ERROR);
        }
        sysMenuMapper.delete(id);
    }

    @Override
    public List<SysMenuVo> findMenuByUserId() {
        SysUser sysUser = AuthContextUtil.get();
        Long userId = sysUser.getId();
        List<SysMenu> sysMenuList = sysMenuMapper.findMenuByUserId(userId);
        List<SysMenu> sysMenuTreeList = MenuHelper.buildTree(sysMenuList);
        return this.buildMenus(sysMenuTreeList);
    }

    // 将List<SysMenu>对象转换成List<SysMenuVo>对象
    private List<SysMenuVo> buildMenus(List<SysMenu> menus) {

        List<SysMenuVo> sysMenuVoList = new LinkedList<SysMenuVo>();
        for (SysMenu sysMenu : menus) {
            SysMenuVo sysMenuVo = new SysMenuVo();
            sysMenuVo.setTitle(sysMenu.getTitle());
            sysMenuVo.setName(sysMenu.getComponent());
            List<SysMenu> children = sysMenu.getChildren();
            if (!CollectionUtils.isEmpty(children)) {
                sysMenuVo.setChildren(buildMenus(children));
            }
            sysMenuVoList.add(sysMenuVo);
        }
        return sysMenuVoList;
    }

}
