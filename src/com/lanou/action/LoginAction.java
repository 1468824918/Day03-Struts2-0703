package com.lanou.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.ServletContextAware;

import javax.servlet.ServletContext;

/**
 * Created by dllo on 17/10/12.
 */
public class LoginAction extends ActionSupport implements ServletContextAware{

    private ServletContext mServletContext;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    /**
     * 添加,需要登录权限
     */
    public String add(){
        return SUCCESS;
    }
    /**
     * 修改,需要登录权限
     */
    public String update(){
        return SUCCESS;
    }
    /**
     * 登录
     */
    public String login(){
        /*
            保存登录的用户名
         */

        //第一种,通过静态方法的方式获得该对象
        //获得ServletContext对象,他的生命周期是整个web应用
        ServletContext servletContext = ServletActionContext.getServletContext();
        //调用登录方法之后将用户名保存在ServletContext的属性map中
        servletContext.setAttribute("user","张三");

//        mServletContext.setAttribute("user","张三");

        return SUCCESS;
    }

    @Override
    public void setServletContext(ServletContext context) {
        /*
        第二种方式,通过实现XXXAware接口方式,获得Servlet中的对象
         */
        mServletContext = context;
    }
}
