package com.hadoo.action;

import com.hadoo.service.LoginService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author : hadoo
 * @Date : 2020/5/11 15:02
 */
@Data
@Controller
public class ManagerLoginAction extends ActionSupport {
    private String username;
    private String password;
    @Autowired
    private LoginService loginService;

    @Override
    public String execute() throws Exception {
        String convertName = new String(username.getBytes("iso-8859-1"),"UTF-8");
        boolean flag = this.loginService.sure(convertName,password);
        if(flag){return SUCCESS;}
        else {return ERROR;}
    }
}