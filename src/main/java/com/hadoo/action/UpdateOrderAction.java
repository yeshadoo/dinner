package com.hadoo.action;

import com.hadoo.entity.Order2;
import com.hadoo.service.OrderService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author : hadoo
 * @Date : 2020/5/14 10:43
 */
@Data
@Controller
public class UpdateOrderAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    @Autowired
    private OrderService orderService;
    private Order2 order;

    @Override
    public String execute() throws Exception {
        String convertStatus = new String(order.getO_status().getBytes("iso-8859-1"),"UTF-8");
        order.setO_status(convertStatus);
        this.orderService.updateOrder(order);
        return SUCCESS;
    }
}