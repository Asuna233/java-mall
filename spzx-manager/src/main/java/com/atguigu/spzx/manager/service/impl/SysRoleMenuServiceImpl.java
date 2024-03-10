package com.atguigu.spzx.manager.service.impl;

import com.atguigu.spzx.manager.mapper.SysRoleMenuMapper;
import com.atguigu.spzx.manager.service.SysMenuService;
import com.atguigu.spzx.manager.service.SysRoleMenuService;
import com.atguigu.spzx.model.dto.system.AssginMenuDto;
import com.atguigu.spzx.model.entity.system.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SysRoleMenuServiceImpl implements SysRoleMenuService {

    @Autowired
    private SysRoleMenuMapper sysRoleMenuMapper;
    @Autowired
    private SysMenuService sysMenuService;
    @Override
    public Map<String, Object> findSysRoleMenuByRoleId(Long roleId) {
        List<SysMenu> sysMenuList = sysMenuService.findNodes();

        List<Long> roleMenuIds = sysRoleMenuMapper.findSysRoleMenuByRoleId(roleId);
        Map<String , Object> result = new HashMap<>() ;
        result.put("sysMenuList" , sysMenuList) ;
        result.put("roleMenuIds" , roleMenuIds) ;
        return result;
    }

    @Override
    public void doAssign(AssginMenuDto assginMenuDto) {
        sysRoleMenuMapper.deleteByuRoleId(assginMenuDto.getRoleId());

        List<Map<String, Number>> menuInfo = assginMenuDto.getMenuIdList();
        if (menuInfo != null && menuInfo.size()>0) {
            sysRoleMenuMapper.doAssign(assginMenuDto);
        }
    }
}
