package com.hadoo.action;

import com.hadoo.entity.Order2;
import com.hadoo.service.OrderService;
import com.opensymphony.xwork2.ActionSupport;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author : hadoo
 * @Date : 2020/5/13 10:23
 */
@Data
@Controller
public class AddOrderAction extends ActionSupport {
    private static final long serialVersionUID = 1L;
    private Order2 order;
    @Autowired
    private OrderService orderService;

    @Override
    public String execute() throws Exception {
        String convert_uname = new String(order.getUname().getBytes("iso-8859-1"),"UTF-8");
        String convert_cname = new String(order.getCname().getBytes("iso-8859-1"),"UTF-8");
        order.setUname(convert_uname);
        order.setCname(convert_cname);
        System.out.println(order);
        this.orderService.doCreateOrder(order);
        return SUCCESS;
    }
}