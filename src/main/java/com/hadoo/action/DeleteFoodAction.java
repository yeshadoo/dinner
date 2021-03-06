package com.hadoo.action;

import com.hadoo.entity.Food;
import com.hadoo.service.FoodService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 17:08
 */
@Data
@Controller
public class DeleteFoodAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private Food food;
    @Autowired
    private FoodService foodService;

    @Override
    public String execute() throws Exception {
        System.out.println(food);
        this.foodService.delete(food);
        return SUCCESS;
    }
}