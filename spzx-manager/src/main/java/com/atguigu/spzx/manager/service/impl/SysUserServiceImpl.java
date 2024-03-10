package com.atguigu.spzx.manager.service.impl;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.atguigu.spzx.common.exception.GuiguException;
import com.atguigu.spzx.common.log.annotation.Log;
import com.atguigu.spzx.manager.mapper.SysRoleUserMapper;
import com.atguigu.spzx.manager.mapper.SysUserMapper;
import com.atguigu.spzx.manager.service.SysUserService;
import com.atguigu.spzx.model.dto.system.AssginRoleDto;
import com.atguigu.spzx.model.dto.system.LoginDto;
import com.atguigu.spzx.model.dto.system.SysUserDto;
import com.atguigu.spzx.model.entity.system.SysUser;
import com.atguigu.spzx.model.vo.common.Result;
import com.atguigu.spzx.model.vo.common.ResultCodeEnum;
import com.atguigu.spzx.model.vo.system.LoginVo;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private SysRoleUserMapper sysRoleUserMapper;

    private String inputPassword;

    @Override
    public LoginVo login(LoginDto loginDto) {
        String captcha = loginDto.getCaptcha();
        String codeKey = loginDto.getCodeKey();
        String redisCode = redisTemplate.opsForValue().get("user:validate" + codeKey);
        if (StrUtil.isEmpty(redisCode) || !StrUtil.equalsIgnoreCase(redisCode,captcha)){
            throw new GuiguException(ResultCodeEnum.VALIDATECODE_ERROR);
        }
        redisTemplate.delete("user:validate" + codeKey);

        String userName = loginDto.getUserName();
        SysUser sysUser = sysUserMapper.selectUserInfoByUserName(userName);
        if (sysUser == null) {
//            throw new RuntimeException("用户不存在");
            throw new GuiguException(ResultCodeEnum.LOGIN_ERROR);
        }
        String database_password = sysUser.getPassword();
        inputPassword = DigestUtils.md5DigestAsHex(loginDto.getPassword().getBytes());
        String input_password = inputPassword;
        if (!input_password.equals(database_password)) {
//            throw new RuntimeException("密码不正确");
            throw new GuiguException(ResultCodeEnum.LOGIN_ERROR);
        }
        String token = UUID.randomUUID().toString().replaceAll("-", "");
        redisTemplate.opsForValue().set("user:login" + token, JSON.toJSONString(sysUser), 7, TimeUnit.DAYS);
        LoginVo loginVo = new LoginVo();
        loginVo.setToken(token);
        return loginVo;
    }

    @Override
    public SysUser getUserInfo(String token) {
        String userJson = redisTemplate.opsForValue().get("user:login" + token);
        SysUser sysUser = JSON.parseObject(userJson, SysUser.class);
        return sysUser;
    }

    @Override
    public void logout(String token) {
        redisTemplate.delete("user:login" + token);
    }

    @Override
    public PageInfo<SysUser> findByPage(Integer pageNum, Integer pageSize, SysUserDto sysUserDto) {
        PageHelper.startPage(pageNum, pageSize);
        List<SysUser> list = sysUserMapper.findByPage(sysUserDto);
        PageInfo<SysUser> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public void saveSysUser(SysUser sysUser) {
        String userName = sysUser.getUserName();
        SysUser dbSysUser = sysUserMapper.selectUserInfoByUserName(userName);
        if (dbSysUser != null){
            throw new GuiguException(ResultCodeEnum.USER_NAME_IS_EXISTS);
        }
        String md5_PassWord = DigestUtils.md5DigestAsHex(sysUser.getPassword().getBytes());
        sysUser.setPassword(md5_PassWord);
        sysUser.setStatus(1); //1代表用户可用，0不可用
        sysUserMapper.save(sysUser);
    }

    @Override
    public void updateSysUser(SysUser sysUser) {
        sysUserMapper.update(sysUser);
    }

    @Override
    public void deleteById(Long userId) {
        sysUserMapper.delete(userId);
    }

    @Log(title = "用户分配角色", businessType = 0)
    @Transactional
    @Override
    public void doAssign(AssginRoleDto assginRoleDto) {
        sysRoleUserMapper.deleteByUserId(assginRoleDto.getUserId());
        List<Long> roleIdList = assginRoleDto.getRoleIdList();
        for (Long roleId : roleIdList) {
            sysRoleUserMapper.doAssign(assginRoleDto.getUserId(), roleId);
        }
    }

}
