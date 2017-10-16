package com.lanou.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by dllo on 17/10/12.
 */
public class TestInterceptorAction extends ActionSupport{

    public String register(){
        System.out.println("进入了注册方法");
        return SUCCESS;
    }
    public String login(){
        System.out.println("进入了登录的方法");
        return SUCCESS;
    }
    @Override
    public String execute() throws Exception {
        System.out.println("进入动作方法");
        return SUCCESS;
    }
}
