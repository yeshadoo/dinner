package com.hadoo.action;

import com.hadoo.entity.Food;
import com.hadoo.entity.User;
import com.hadoo.service.FoodService;
import com.hadoo.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * @Author : hadoo
 * @Date : 2020/5/13 9:06
 */
@Data
@Controller
public class ShowUserByName extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private User user;
    @Autowired
    private UserService userService;

    @Override
    public String execute() throws Exception {
//        Map request = (Map) ActionContext.getContext().get("request");
//        request.put("list_user", this.userService.showUserByName(user.getUsername()));
        Map<String, Object> session = ActionContext.getContext().getSession();
        session.put("id",this.userService.showUserByName(user.getUsername()).getId());
        return SUCCESS;
    }
}