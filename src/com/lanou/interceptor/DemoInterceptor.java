package com.lanou.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by dllo on 17/10/12.
 */
public class DemoInterceptor extends AbstractInterceptor{
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        /*
            自定义拦截器
            1.继承AbstractInterceptor
            2.实现intercept抽象方法
         */
        System.out.println("拦截前");
        String result = actionInvocation.invoke();
        System.out.println("拦截后");
        return result;
    }
}
