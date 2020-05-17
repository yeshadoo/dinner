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
public class FindFoodByName extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private Food food;
    @Autowired
    private FoodService foodService;

    @Override
    public String execute() throws Exception {
        Map request = (Map) ActionContext.getContext().get("request");
        String convertName = new String(food.getName().getBytes("iso-8859-1"),"UTF-8");
        request.put("list", this.foodService.findFoodByName(convertName));
        return SUCCESS;
    }
}