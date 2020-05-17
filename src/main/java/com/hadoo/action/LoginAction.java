package com.hadoo.action;

import com.hadoo.entity.User;
import com.hadoo.service.LoginService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * @Author : hadoo
 * @Date : 2020/5/11 15:02
 */
@Data
@Controller
public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private LoginService loginService;

    @Override
    public String execute() throws Exception {
        if(username != null){
            String convertName = new String(username.getBytes("iso-8859-1"),"UTF-8");
            username = convertName;
        }
        Map<String, Object> session = ActionContext.getContext().getSession();
        session.put("username",username);
        boolean flag = this.loginService.sure(username,password);
        if(flag){return SUCCESS;}
        else {return ERROR;}
    }
}