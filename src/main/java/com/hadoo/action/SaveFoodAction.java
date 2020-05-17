package com.hadoo.action;

import com.hadoo.entity.Food;
import com.hadoo.service.FoodService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 20:49
 */
@Data
@Controller
public class SaveFoodAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private Food food;
    @Autowired
    private FoodService foodService;

    @Override
    public String execute() throws Exception {
        this.foodService.doCreateFood(food);
        return SUCCESS;
    }
}