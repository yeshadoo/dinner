package com.hadoo.action;

import com.hadoo.service.FoodService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 16:56
 */
@Controller
public class ManagerFoodListAction extends ActionSupport {
    @Autowired
    private FoodService foodService;

    @Override
    public String execute() throws Exception {
        Map request = (Map) ActionContext.getContext().get("request");

        request.put("list", this.foodService.findAllFoods());
        return SUCCESS;
    }
}