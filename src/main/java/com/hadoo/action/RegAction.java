package com.hadoo.action;

import com.hadoo.entity.User;
import com.hadoo.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 7:56
 */
@Data
@Controller
public class RegAction extends ActionSupport {
    private User user;
    @Autowired
    private UserService userService;
    @Override
    public String execute() throws Exception {
        this.userService.addUser(user);
        return "success";
    }
}