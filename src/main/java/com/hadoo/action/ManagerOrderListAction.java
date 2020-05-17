package com.hadoo.action;

import com.hadoo.service.FoodService;
import com.hadoo.service.OrderService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

/**
 * @Author : hadoo
 * @Date : 2020/5/12 15:28
 */
@Data
@Controller
public class ManagerOrderListAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    @Autowired
    private OrderService orderService;

    @Override
    public String execute() throws Exception {
        Map request = (Map) ActionContext.getContext().get("request");

        request.put("list_order", this.orderService.findAllOrders());
        return SUCCESS;
    }
}