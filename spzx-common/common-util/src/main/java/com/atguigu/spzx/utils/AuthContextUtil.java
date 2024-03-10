package com.atguigu.spzx.utils;

import com.atguigu.spzx.model.entity.system.SysUser;
import com.atguigu.spzx.model.entity.user.UserInfo;

public class AuthContextUtil {

    private static final ThreadLocal<UserInfo> userInfoThreadLocal = new ThreadLocal<>() ;


    // 定义存储数据的静态方法
    public static void setUserInfo(UserInfo userInfo) {
        userInfoThreadLocal.set(userInfo);
    }

    // 定义获取数据的方法
    public static UserInfo getUserInfo() {
        return userInfoThreadLocal.get() ;
    }

    // 删除数据的方法
    public static void removeUserInfo() {
        userInfoThreadLocal.remove();
    }
    private static final ThreadLocal<SysUser> threadlocal = new ThreadLocal<>();

    public static void set(SysUser sysUser){
        threadlocal.set(sysUser);
    }

    public static SysUser get(){
        return threadlocal.get();
    }

    public static void  remove(){
        threadlocal.remove();
    }
}
