package com.atguigu.spzx.common.log.aspect;

import com.atguigu.spzx.common.log.annotation.Log;
import com.atguigu.spzx.common.log.service.AsyncOperLogService;
import com.atguigu.spzx.common.log.utils.LogUtil;
import com.atguigu.spzx.model.entity.system.SysOperLog;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    @Autowired
    private AsyncOperLogService asyncOperLogService;

    @Around(value = "@annotation(sysLog)")
    public Object doAroundAdvice(ProceedingJoinPoint joinPoint, Log sysLog) {
//        String title = sysLog.title();
//        int businessType = sysLog.businessType();
//        System.out.println("title:"+title+"::businessType:"+businessType);
        SysOperLog sysOperLog = new SysOperLog();
        LogUtil.beforeHandleLog(sysLog, joinPoint, sysOperLog);

        Object proceed = null;
        try {
            proceed = joinPoint.proceed();
//            System.out.println("在业务方法之后执行。。。");
            LogUtil.afterHandlLog(sysLog, proceed, sysOperLog, 0, null);
        } catch (Throwable e) {
            e.printStackTrace();
            LogUtil.afterHandlLog(sysLog, proceed, sysOperLog, 1, e.getMessage());
            //要手动抛出异常，否则事务不会感知，一旦出现异常事务不会回滚
            throw new RuntimeException();
        }
        asyncOperLogService.saveSysOperLog(sysOperLog);
        return proceed;
    }
}
