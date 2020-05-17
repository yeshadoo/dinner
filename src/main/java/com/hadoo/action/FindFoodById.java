package com.hadoo.action;

import com.hadoo.entity.Food;
import com.hadoo.service.FoodService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 20:30
 */
@Data
@Controller
public class FindFoodById extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private Food food;
    @Autowired
    private FoodService foodService;

    @Override
    public String execute() throws Exception {
        Map request = (Map) ActionContext.getContext().get("request");

        request.put("list", this.foodService.findFoodById(food.getId()));
        return SUCCESS;
    }
}