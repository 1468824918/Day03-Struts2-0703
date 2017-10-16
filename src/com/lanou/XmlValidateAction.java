package com.lanou;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by dllo on 17/10/12.
 */
public class XmlValidateAction extends ActionSupport{
    private String username;
    private String password;

    public String login(){
        return SUCCESS;
    }

    public String register(){
        return SUCCESS;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
