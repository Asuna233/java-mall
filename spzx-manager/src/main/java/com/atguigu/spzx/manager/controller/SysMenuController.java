package com.atguigu.spzx.manager.controller;

import com.atguigu.spzx.manager.service.SysMenuService;
import com.atguigu.spzx.model.entity.system.SysMenu;
import com.atguigu.spzx.model.vo.common.Result;
import com.atguigu.spzx.model.vo.common.ResultCodeEnum;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/admin/system/sysMenu")
public class SysMenuController {
    @Autowired
    private SysMenuService sysMenuService;

    @DeleteMapping(value = "/removeById/{id}")
    public Result removeById(@PathVariable Long id) {
        sysMenuService.removeById(id);
        return Result.build(null, ResultCodeEnum.SUCCESS);
    }

    @PutMapping(value = "/update")
    public Result update(@RequestBody SysMenu sysMenu) {
        sysMenuService.update(sysMenu);
        return Result.build(null, ResultCodeEnum.SUCCESS);
    }

    @PostMapping(value = "/save")
    public Result save(@RequestBody SysMenu sysMenu) {
        sysMenuService.save(sysMenu);
        return Result.build(null, ResultCodeEnum.SUCCESS);
    }

    @GetMapping(value = "/findNodes")
    public Result findNodes() {
        List<SysMenu> list = sysMenuService.findNodes();
        return Result.build(list, ResultCodeEnum.SUCCESS);
    }
}
